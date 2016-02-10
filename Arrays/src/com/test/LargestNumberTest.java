package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.LargestNumber;

public class LargestNumberTest {
	LargestNumber lnum;
	
	@Before
	public void init(){
		lnum = new LargestNumber();
	}
		
	@Test
	public void positiveTest(){
		
		int expected = 67;
		int[] array = {12,34,56,23,67};
		Assert.assertEquals(expected, lnum.findMax(array));	
	}		
	
	@Test
	public void positiveTestWithNegativeNumbers(){
		
		int expected = -12;
		int[] array = {-12,-34,-56,-23,-67};		
		Assert.assertEquals(expected, lnum.findMax(array));	
	}	
	
	@Test
	public void positiveTestMultipleCommon(){
		
		int expected = 5;
		int[] array = {1,2,3,4,5,0,5};
		Assert.assertEquals(expected, lnum.findMax(array));
	}	
		
	@Test
	public void negativeTestWithSameElements(){
		
		int expected = 1;
		int[] array = {1,1,1,1,1};
		Assert.assertEquals(expected, lnum.findMax(array));	
	}	
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void negativeTestWithEmptyArray(){
		
		int expected = -1;
		int[] array = {};		
		Assert.assertEquals(expected, lnum.findMax(array));	
	}		
		
	@After
	public void cleanUp(){
		lnum = null;		
	}
}
