package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.CommonNumber;

public class CommonNumberTest {

	CommonNumber com;
	
	@Before
	public void init(){
		com = new CommonNumber();
	}
		
	@Test
	public void positiveTest(){
		
		int expected = 34;
		int[] array1 = {12,34,56,23,67};
		int[] array2 = {1,3,45,56,34,213};
		Assert.assertEquals(expected, com.findCommon(array1, array2));	
	}	
	
	@Test
	public void positiveTestWithNegativeNumbers(){
		
		int expected = -34;
		int[] array1 = {-12,-34,-56,-23,-67};
		int[] array2 = {-1,-3,-45,-56,-34,-213};
		Assert.assertEquals(expected, com.findCommon(array1, array2));	
	}	
	
	@Test
	public void positiveTestMultipleCommon(){
		
		int expected = 3;
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {6,3,4,5};
		Assert.assertEquals(expected, com.findCommon(array1, array2));
	}	

	@Test
	public void negativeTest(){
		
		int expected = -1;
		int[] array1 = {12,34,56,23,67};
		int[] array2 = {1,3,45,561,314,213};
		Assert.assertEquals(expected, com.findCommon(array1, array2));	
	}	
	
	@Test
	public void negativeTestWithSameElements(){
		
		int expected = 1;
		int[] array1 = {1,1,1,1,1};
		int[] array2 = {1,1,1,1,1};
		Assert.assertEquals(expected, com.findCommon(array1, array2));	
	}	
	
	@Test
	public void negativeTestWithEmptyArray(){
		
		int expected = -1;
		int[] array1 = {};
		int[] array2 = {};
		Assert.assertEquals(expected, com.findCommon(array1, array2));	
	}		
	
	@After
	public void cleanUp(){
		com = null;		
	}
}


