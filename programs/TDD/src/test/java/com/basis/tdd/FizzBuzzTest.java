package com.basis.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private static final String FIZZ = "Fizz";
	private FizzBuzz fizzBuzz;

	@Before
	public void setUp() {
		fizzBuzz=new FizzBuzz();
	}
	@Test
	public void testNumber() {
		int number=1;
		assertEquals("1", fizzBuzz.play(number));
	}

	@Test
	public void testFizz() {
		int number =3;
		assertEquals(FIZZ, fizzBuzz.play(number));

	}

	@Test
	public void testFizzDivisibleBy3() {
		int number=6;
		assertEquals(FIZZ, fizzBuzz.play(number));
	}

	@Test
	public void testBuzz() {
		int number =5;
		assertEquals("Buzz", fizzBuzz.play(number));
	}

	@Test
	public void testBuzzDivisibleBy5() {
		int number =10;
		assertEquals("Buzz", fizzBuzz.play(number));
	}
}
