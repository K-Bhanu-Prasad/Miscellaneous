package com.basis.tdd;

public class FizzBuzz {

	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";

	public String play(int number) {
		if(number % 3 == 0) return FIZZ;
		if(number % 5 == 0) return BUZZ;
		return String.valueOf(number);
	}

}
