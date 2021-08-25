import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 69), new Person("Ravi", "Kumar", 98),
				new Person("Bhanu", "Prasad", 69), new Person("Sachin", "Tendulkar", 37),
				new Person("Chanikya", "CPeddi", 23));

		// Step1: Sort List by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step2: Create method prints all elements in list
		System.out.println("Printing all persons");
		printContionally(people, p -> true, p -> System.out.println(p));

		// Step3: Create method that prints all elements that have last name beginning
		// with C.
		System.out.println("Print condtionally");
		printContionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getFirstName()));

	}

	private static void printContionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}

	}

}
