/*Write a program that prints a pattern like below.*/

package com.main;

import java.util.Scanner;

public class Pattern {	
	
	public void printPattern(int number)
	{
		String str = "*", temp = ""; 	
		
		for(int i = 0; i < number; i++)
		{
			for(int j = i; j < i + 1 ; j++)
			{
				temp += str;		
			}	
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args)
	{		
		System.out.println("Please enter a number :");
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		Pattern pat = new Pattern();
		
		pat.printPattern(number);
		
		scan.close();
	}	
}
