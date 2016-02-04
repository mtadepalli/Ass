package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.ReverseEachWord;

public class ReverseEachWordTest {	
	
		ReverseEachWord revWord;
		
		@Before
		public void init(){
			revWord = new ReverseEachWord();
		}
			
		@Test
		public void positiveTest(){
			
			String expected = "sihT si ecin";
			Assert.assertEquals(expected, revWord.reverse("This is nice"));	
		}		
		
		@Test
		public void positiveTestWithNumbers(){
			
			String expected = "321";
			Assert.assertEquals(expected, revWord.reverse("123"));	
		}
		
		@Test
		public void positiveTestWithPalindrome(){
			
			String expected = "redivider";
			Assert.assertEquals(expected, revWord.reverse("redivider"));	
		}
				
		@Test
		public void negativeTestEmptyString(){		

			String expected = "";
			Assert.assertEquals(expected, revWord.reverse(""));	
		}
		
		@Test(expected = NullPointerException.class)	
		public void negativeTestNullString(){		

			String expected = "";
			Assert.assertEquals(expected, revWord.reverse(null));	
		}		
		
		@After
		public void cleanUp(){
			revWord = null;		
		}
}
