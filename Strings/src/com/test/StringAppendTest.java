package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.main.StringAppend;

public class StringAppendTest {
	
	StringAppend strAppend;
	
	@Before
	public void init(){
		strAppend = new StringAppend();
	}
		
	@Test
	public void positiveTest(){
		
		String expected = "This1 is2 nice3";
		Assert.assertEquals(expected, strAppend.appendString("This is nice"));	
	}
	
	@Test
	public void positiveTestWithNumbers(){
		
		String expected = "1231";
		Assert.assertEquals(expected, strAppend.appendString("123"));	
	}
	
	@Test
	public void positiveTestWithNumbersSentence(){
		
		String expected = "11 22 33";
		Assert.assertEquals(expected, strAppend.appendString("1 2 3"));	
	}
	
	
	@Test
	public void positiveTestOneWord(){		

		String expected = "This1";
		Assert.assertEquals(expected, strAppend.appendString("This"));	
	}
	
	@Test
	public void negativeTestEmptyString(){		

		String expected = "";
		Assert.assertEquals(expected, strAppend.appendString(""));	
	}
	
	@Test(expected = NullPointerException.class)	
	public void negativeTestNullString(){		

		String expected = "";
		Assert.assertEquals(expected, strAppend.appendString(null));	
	}
	
	
	
	@After
	public void cleanUp(){
		strAppend = null;		
	}
}
