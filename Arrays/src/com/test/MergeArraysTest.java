package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.MergeArrays;

public class MergeArraysTest {

MergeArrays merge;
	
	@Before
	public void init(){
		merge = new MergeArrays();
	}
	
	@Test
	public void positiveTest(){
		
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {6,7,8,9,10};
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		Assert.assertArrayEquals(expected, merge.performMerge(array1, array2));
	}	
	
	@Test
	public void negativeTestWithDuplicates(){
		
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {5,7,8,9,10};
		int[] expected = {1,2,3,4,5,5,7,8,9,10};
		Assert.assertArrayEquals(expected, merge.performMerge(array1, array2));
	}
	
	@Test
	public void negativeTestWithSameElements(){
		
		int[] array1 = {1,1,1,1,1};
		int[] array2 = {1,1,1,1};
		int[] expected = {1,1,1,1,1,1,1,1,1};
		Assert.assertArrayEquals(expected, merge.performMerge(array1, array2));
	}
	
	@Test
	public void negativeTestWithEmptyArray(){	
		
		int[] array1 = {};
		int[] array2 = {};
		int[] expected = {};
		Assert.assertArrayEquals(expected, merge.performMerge(array1, array2));	
	}		
	
	@After
	public void cleanUp(){
		merge = null;		
	}
}
