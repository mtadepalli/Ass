/*Write a program to check if a given string of parenthesis has balanced parenthesis or not. 
 * For example a string as "(())" is a valid string where as strings like ")(" or "(()))" are 
 * not valid strings. * 
 */
package com.main;

public class ParenthesisBalance {
	
	public boolean checkParenthesis(String str){
		
		boolean ret = false;
		
		char[] charArray = str.toCharArray();
		
		int length = charArray.length;
		
		for(int i=0; i < length/2; i++){			
			
			char ch = charArray[i];
	
			switch(ch){
			
			case '(':
			case ')':	
				if( (charArray[i] == '(') && (charArray[length-1-i] == ')')){
										
					ret = true;
					
				}else{
					
					ret = false;
				}
				
			break;
				
			case '{':
			case '}':	
				if( (charArray[i] == '{') && (charArray[length-1-i] == '}')){
					
					ret = true;
					
				}else{

					ret = false;
				}
			break;
			
			case '[':
			case ']':	
				if( (charArray[i] == '[') && (charArray[length-1-i] == ']')){
				
					ret = true;
					
				}else{

					ret = false;
				}
			break;
			
			}			
		}
		
		return ret;
	}
	
	
	public static void main(String[] args) {
		
		ParenthesisBalance par = new ParenthesisBalance();
		System.out.println(par.checkParenthesis("({[]}))}"));		
	}
}
