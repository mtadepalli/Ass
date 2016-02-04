package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.Palindrome;

public class PalindromeTest {
	Palindrome pali;
	
	@Before
	public void init(){
		pali = new Palindrome();
	}
		
	@Test
	public void positiveTest(){		
		
		String str = "radar";
		Assert.assertTrue(str + " is palindrome", pali.checkPalindrome(str));
	}		

	@Test
	public void negativeTest(){		
		
		String str = "apple";
		Assert.assertFalse(str + " is palindrome", pali.checkPalindrome(str));
	}		
	
	@Test
	public void negativeTestEmptyString(){
		
		String str = " ";
		Assert.assertTrue(str + " is palindrome", pali.checkPalindrome(str));	
	}
	
	@Test(expected = NullPointerException.class)	
	public void negativeTestNullString(){	
		
		String str = null;
		Assert.assertFalse(str + " is palindrome", pali.checkPalindrome(str));	
	}		
	
	@After
	public void cleanUp(){
		pali = null;		
	}
}
