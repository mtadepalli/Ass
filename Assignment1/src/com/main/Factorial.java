/* Write a program  to calculate factorial of a given number. You need to compute the factorial with one logic that uses
 *  recursion and another logic without recursion. To remember 0! = 1
 */
package com.main;

import java.util.Scanner;

public class Factorial {	
	
	public int calculateFactorial(int number) throws IllegalArgumentException
	{	 
		 if(number < 0)
		 {			
			 throw new IllegalArgumentException("Factorial cannot be calculated for negative numbers");
		 }
		 
		 int result = 1;
		 
	     for (int i = 1; i <= number; i++) 
	     {
	           result = result * i;
	     }
	     
	     return result;
	}
			
	public int factByRecursion(int number) throws IllegalArgumentException
	{
		if(number < 0)
		{			
			throw new IllegalArgumentException("Factorial cannot be calculated for negative numbers");
		}
		
		if(number == 0)
		{
			return 1;
		}
		else
		{
			return number * factByRecursion(number -1);
		}
	}
			
	public static void main(String[] args)
	{
		int number = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter number :  ");
		
		number = input.nextInt();
		
		input.close();
				
		Factorial fact = new Factorial();
		
		System.out.println(fact.calculateFactorial(number));		
		
		System.out.println(fact.factByRecursion(number));
	}
}
