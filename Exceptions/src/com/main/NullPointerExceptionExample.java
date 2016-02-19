/*Write a program that is expected to throw a null pointer exception and in turn handles it using try catch and finally.*/

package com.main;

public class NullPointerExceptionExample {
		
	public int stringOperations(String str){
		
		int length = -1;				
		
		try{
			length = str.length();		
		}
		catch(NullPointerException e){
			
			System.out.println("The string is null!!!!");
			e.printStackTrace();
		}
		finally{
		
		}	
		return length;
	}
}
