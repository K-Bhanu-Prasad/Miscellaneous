package unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 69), new Person("Ravi", "Kumar", 98),
				new Person("Bhanu", "Prasad", 69), new Person("Sachin", "Tendulkar", 37),
				new Person("Chanikya", "CPeddi", 23));


		// Create method prints all elements in list
		System.out.println("Printing all persons");
		printContionally(people, p -> true,System.out::println); // p-> method(p)


	}

	private static void printContionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}

	}
}

