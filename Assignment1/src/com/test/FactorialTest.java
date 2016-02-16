package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.Factorial;

public class FactorialTest {
	
	@Test
	public void positiveFactTest()
	{
		Factorial fact = new Factorial();		
		int number = 5;
		int actual = 120;
		int expected = fact.calculateFactorial(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void positiveZeroNumberTest()
	{
		Factorial fact = new Factorial();		
		int number = 0;
		int actual = 1;
		int expected = fact.calculateFactorial(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void positiveOneNumberTest()
	{
		Factorial fact = new Factorial();		
		int number = 1;
		int actual = 1;
		int expected = fact.calculateFactorial(number);
		assertEquals(expected, actual);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void negativeNumberTest()
	{
		Factorial fact = new Factorial();		
		int number = -5;
		int actual = 1;
		fact.calculateFactorial(number);		
	}
	
	
	
	/*POSITIVE TEST CASES
	1) Submit integer value at lower boundary [ 0 ]
	2) Submit integer value at lower boundary +1 [ 1 ]
	3) Submit integer value at upper boundary -1
	4) Submit integer value at upper boundary
	NEGATIVE TEST CASES
	5) Submit integer value at upper boundary +1
	6) Submit integer value with leading 0
	7) Submit integer value with leading plus sign [+]
	8) Submit integer value with leading minus sign [-]
	9) Submit integer value with leading space
	10) Submit number with decimal point
	12) Submit number with the letter 'e' in it
	13) Submit alpha character(s)
	14) Submit special character(s) [ex: !@#$^]
	15) Submit with only space
	16) Submit with nothing entered
	*/

}
