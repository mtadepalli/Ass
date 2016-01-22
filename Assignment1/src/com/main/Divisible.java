
/*Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5, 
 * and "ping pong" if number is divisible by both, else print the number.
 */
package com.main;

import java.util.Scanner;

public class Divisible{

	public String divideNumber(int number)
	{
		String str = "";
		
		if((number % 3 == 0) && (number % 5 == 0))
			str = "ping pong";
		else if(number % 5 == 0) 
			str = "pong";
		else if (number % 3 == 0)
			str = "ping";
		else str = String.valueOf(number);
		
		return str;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		
		Divisible div = new Divisible();
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter number :  ");
		
		number = input.nextInt();
		
		input.close();
				
		System.out.println(div.divideNumber(number));	
	}

}
