/*Write a program to find a substring in a given string and then replace it with another string.*/
package com.main;

public class SubstringAndReplace {
	
	public String replaceString(String str, String strToReplace){
		
		String ret = null;
		
		int length = str.length();
		
		int startIndex = 0, endIndex = 0;
		
		if(length < 0) return ret;
		
		endIndex = startIndex + 2;
		
		if(endIndex > length) return ret;
		
		String temp = str.substring(startIndex, endIndex);
			
		System.out.println("The substring is :"+ temp);
			
		ret = str.replaceAll(temp , strToReplace);			
				
		return ret;
	}
	
	public static void main(String[] args){
	
		SubstringAndReplace sub = new SubstringAndReplace();
		
		System.out.println(sub.replaceString("H", "RRR"));				
		
	}

}
