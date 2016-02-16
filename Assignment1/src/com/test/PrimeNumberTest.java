package com.test;
import org.junit.Assert;
import org.junit.Test;

import com.main.PrimeNumber;

public class PrimeNumberTest {
	
	@Test
	public void positivePrimeNumberTest()
	{
		PrimeNumber prime = new PrimeNumber(); 
		int number = 5;	
		Assert.assertTrue("The number " + number + " is prime", prime.isNumberPrime(number));		
	}
	
	@Test
	public void negativePrimeNumberTest()
	{
		PrimeNumber prime = new PrimeNumber(); 
		int number = 10;
		Assert.assertFalse("The number " + number + " is not prime", prime.isNumberPrime(number));	
	}
	
	@Test
	public void negativeOneNumberTest()
	{
		PrimeNumber prime = new PrimeNumber(); 
		int number = 1;
		Assert.assertFalse("The number " + number + " is not prime", prime.isNumberPrime(number));
	}
	
	@Test
	public void negativeZeroNumberTest()
	{
		PrimeNumber prime = new PrimeNumber(); 
		int number = 0;
		Assert.assertFalse("The number " + number + " is not prime", prime.isNumberPrime(number));
	}
	
	@Test
	public void negativeNumberTest()
	{
		PrimeNumber prime = new PrimeNumber(); 
		int number = -5;				
		Assert.assertFalse("The number " + number + " is not prime", prime.isNumberPrime(number));
	}
}
