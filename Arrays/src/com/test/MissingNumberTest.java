package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.MissingNumber;

public class MissingNumberTest {
	
	MissingNumber miss;
	
	@Before
	public void init(){
		miss = new MissingNumber();
	}

	@Test
	public void positiveTest(){
		
		int[] array = {1,2,0,4,5};
		int expected = 3;
		Assert.assertEquals(expected, miss.missingNumber(array));
	}	
	
	@Test
	public void negativeTest(){
		
		int[] array = {1,2,3,4,5};
		int expected = 0;
		Assert.assertEquals(expected, miss.missingNumber(array));
	}	
		
	@Test
	public void negativeTestWithEmptyArray(){
		
		int[] array = {};
		int expected = 0;
		Assert.assertEquals(expected, miss.missingNumber(array));
	}	
	
	@After
	public void cleanUp(){
		miss = null;		
	}
}
