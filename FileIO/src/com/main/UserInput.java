/*Write a program that takes input from user dynamically using below classes.
  	--> Scanner: Use this class to input 2 integer numbers and sum them.
  	--> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
  	--> DatainputStream: Use this class to input 2 integer numbers and multiply them.
  	--> Console: Use this class to input 2 integer numbers and divide them.
*/
package com.main;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
	
	public int useScanner(){
		
		int sum=0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first number");
		
		int num1 = in.nextInt();
		
		System.out.println("Enter second number");
		
		int num2 = in.nextInt();
		
		sum = num1 + num2;
		
		in.close();
		
		return sum;
	}
	
	public int useDataInputStream(){
		
		int product=0, num1=0,num2=0;
			
		DataInputStream data = new DataInputStream(System.in);	
		
		try {
			
			System.out.print("Enter first number : ");
			num1 = Integer.parseInt(data.readLine());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
		
		try {
			
			System.out.print("Enter second number : ");
			num2 = Integer.parseInt(data.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
		
		finally{
		
			product = num1 * num2;	
			
			try {
				
				data.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}			
		}		
		return product;
	}
	
	
public int useBufferedReader(){
		
		int diff=0, num1=0, num2=0;
						
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));		
		
		System.out.print("Enter first number :");
		
		try {
			 num1  = Integer.parseInt(buff.readLine());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.print("Enter second number :");
		
		try {
			 num2  = Integer.parseInt(buff.readLine());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
		finally{
			
			diff = num1 -num2;
			
			try {
				
				buff.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}			
		}		
		
		return diff;
	}
	

	public int useConsole(){

		int quot=0, num1=0, num2=0;
		
		System.out.print("Enter 1st number :");
		
		Console console = System.console();
		
		if (console == null) {
		    System.out.println("No console: non-interactive mode!");
		    System.exit(0);
		}
				
		num1 = Integer.parseInt(console.readLine());
		
		System.out.print("Enter 2nd number :");		
			
		num2 = Integer.parseInt(console.readLine());
		
		quot = num1/num2;		
		
		return quot;
	}
	
	
	
	public static void main(String[] args) {
		
		UserInput input = new UserInput();
		
		System.out.println("The sum is :" + input.useScanner());
		
		/*System.out.println("The difference is :" + input.useBufferedReader());
		
		System.out.println("the product is :"+ input.useDataInputStream());
		
		System.out.println("The divisor is :"+ input.useConsole());*/
		
	}

}
