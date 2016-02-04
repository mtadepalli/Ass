package com.main;

public class Palindrome {

		public boolean checkPalindrome(String str){
			
			boolean ret = false;
			
			String strLower = str.toLowerCase();
			
			ReverseString rev = new ReverseString();
						
			String reversedStr = rev.reverse(strLower);
			
			if(strLower.equals(reversedStr))
				ret = true;			
			
			return ret;			
		}
		
		public static void main(String[] args) {
			
			Palindrome pali = new Palindrome();
			System.out.println(pali.checkPalindrome(""));
		}
}
