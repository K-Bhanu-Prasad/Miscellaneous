package streamsexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Ravi", "Rahul", "Teja", "Bhanu"));

		System.out.println("Normal For loop");
		for(String fruit : list) {
			System.out.println(fruit);
		}

		System.out.println("Using streams");
		list.stream().filter(StreamsExample::isNotMango)
		.map(User::new)
		.forEach(System.out::println);

		System.out.println("Using Collect");
		List<User> userList =  list.stream().filter(StreamsExample::isNotMango)
		.map(User::new)
		.collect(Collectors.toList());

		System.out.println(userList);

		System.out.println("MapToInt");
		int sum = list.stream()
		.map(User::new)
		.mapToInt(User::getAge)
		.sum();
		System.out.println("Sum of ages = "+sum);
	}

	private static boolean isNotMango(String fruit) {
		return !fruit.equals("Bhanu");
	}

}
