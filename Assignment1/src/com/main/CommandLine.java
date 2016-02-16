/*Write a program  that accepts input from the command line and then prints them.*/

package com.main;

import java.util.Scanner;

public class CommandLine {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println("You enetered :"+ str);
		
		scan.close();
	}	
}
