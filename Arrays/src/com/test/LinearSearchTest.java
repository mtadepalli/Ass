package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.LinearSearch;

public class LinearSearchTest {
	
	LinearSearch lsearch;
	
	@Before
	public void init(){
		lsearch = new LinearSearch();
	}

	@Test
	public void positiveTest(){
		
		int key = 34;
		int[] array = {12,34,56,23,67};
		Assert.assertTrue(lsearch.performSearch(key, array));
	}	
	
	@Test
	public void positiveTestKeyNotPresent(){
		
		int key = 89;
		int[] array = {12,34,56,23,67};
		Assert.assertFalse(lsearch.performSearch(key, array));
	}	
	
	@Test
	public void negativeTestWithSameElements(){
		
		int key = 3;
		int[] array = {3,3,3,3,3};
		Assert.assertTrue(lsearch.performSearch(key, array));
	}
	
	@Test
	public void negativeTestWithMixedElements(){
		
		int key = 36;
		int[] array = {-3,13,23,-53,36};
		Assert.assertTrue(lsearch.performSearch(key, array));
	}
	
	@Test
	public void negativeTestWithEmptyArray(){
		
		int key = 5;
		int[] array = {};
		Assert.assertFalse(lsearch.performSearch(key, array));	
	}			
	
	@After
	public void cleanUp(){
		lsearch = null;		
	}
}
