/*
Write a program  to check an armstrong number i.e. whether the if we power up the each 
individual number to the total number of digits in the number and add them it should be equal 
to the number itself. 
For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.
*/

package com.main;

import java.util.Scanner;

public class ArmstrongNumber {

	public boolean isNumberArmstrong(int number)
	{
		boolean result = true;
		
		if(number <= 1)
			return result = false;
		
		String str = Integer.toString(number);
		
		int digitsNumber = str.length();
		
		int sum = 0;
		
		for(int i = 0; i < digitsNumber; i++)
		{
			int digit = Character.getNumericValue(str.charAt(i));
			int power = (int) Math.pow(digit , digitsNumber);			
			sum = sum + power;
		}
		
		if(sum != number)
			result = false;
		
		return result;
	}
		
	public static void main(String[] args)
	{
		ArmstrongNumber arm = new ArmstrongNumber();
		
		System.out.println("Please enter a number :");
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		System.out.println("The number " + number + " is Armstrong : "+ arm.isNumberArmstrong(number));
		
		scan.close();
	}
}
