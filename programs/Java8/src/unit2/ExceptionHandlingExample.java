package unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		int [] someNumbers = {1,4,6,9};
		int key = 0;


		System.out.println("Addtion");
		process(someNumbers, key, (v,k)->System.out.println(v+k));


		System.out.println("Division");
		process(someNumbers, key, wrapperLambdaExpression((v,k)->System.out.println(v/k)));

	}

	public static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for(int i : someNumbers) {
			biConsumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLambdaExpression(BiConsumer<Integer, Integer> biConsumer){
		return (v,k)->{
			try {
				biConsumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Cannot divide by 0");
			}
		};
	}
}
