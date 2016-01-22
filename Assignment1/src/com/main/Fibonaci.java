package com.main;
import java.util.Scanner;

/*
  Write a program that prints a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.
  You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 or
  any desired number.  
 */

public class Fibonaci {	
	
	public String calculateFibonaciNumbers(int n)
	{
		String str = "";
		
		if(n <= 0) return str;
		
		int prevNumber = 0, currentNumber = 1, fibNumber;
		
		str += prevNumber ;
		
		for (int i = 1; i < n; i++)
		{
			fibNumber = prevNumber + currentNumber;
			
			str += " " +fibNumber;
			
			currentNumber = prevNumber;
			
			prevNumber = fibNumber;			
		}
		
		return str;
	}
		
	
	public static void main(String args[])
	{		
		int numbersToPrint = 0;
		
		Fibonaci fib = new Fibonaci();
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter number of fibonaci numbers to print:  ");
		
		numbersToPrint = input.nextInt();
		
		input.close();
				
		System.out.println(fib.calculateFibonaciNumbers(numbersToPrint));		
	}
}
