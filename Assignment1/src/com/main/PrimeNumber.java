package com.main;

import java.util.Scanner;

public class PrimeNumber {
	
	public boolean isNumberPrime(int number)
	{
		boolean result = true;
		
		if(number <= 1)
			return result = false;
		
		for(int i = 2; i <= number/2; i++)
		{	           
		   if(number % i == 0)
		   {
		      result = false;
		      break;
		   }
		}
		
		return result;		
	}
	
	public static void main(String[] args)
	{
		PrimeNumber prime = new PrimeNumber();
		
		System.out.println("Please enter a number :");
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		System.out.println("The number " + number + " is prime : "+ prime.isNumberPrime(number));		
	}
}
