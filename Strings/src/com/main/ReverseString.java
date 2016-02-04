/*Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.*/
package com.main;

public class ReverseString {
	
	public String reverse(String str){
		
		String reversedStr = null;
		
		// swap a, b
		// a = a + b
		// b = a - b
		// a = a - b
		
		char[] charArray = str.toCharArray();
		
		int length = charArray.length;		
		
		for (int i=0; i < length/2; i++){
			
			charArray[i] = (char) (charArray[i] + charArray[length-1-i]);
			charArray[length-1-i] = (char) (charArray[i] - charArray[length-1-i]);
			charArray[i] = (char) (charArray[i] - charArray[length-1-i]);
		}		
		reversedStr = String.valueOf(charArray);
		
		return reversedStr;
	}

	
	public static void main(String[] args){
		
		ReverseString rev = new ReverseString();	
		String str = "Maryland"; 
		System.out.println("Original is :" + str);
		System.out.println("Reverse string :"+ rev.reverse(str));
		
	}
	
}
