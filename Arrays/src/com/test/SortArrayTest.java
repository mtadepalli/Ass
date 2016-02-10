package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.SortArray;;

public class SortArrayTest {

	SortArray sort;
	
	@Before
	public void init(){
		sort = new SortArray();
	}
	
	@Test
	public void positiveTest(){
		
		int[] array = {4,3,2,5,6};
		int[] expected = {2,3,4,5,6};
		Assert.assertArrayEquals(expected, sort.performSort(array));
	}	
	
	@Test
	public void positiveTestDuplicateNumbers(){
		
		int[] array = {2,2,2,2,2};
		int[] expected = {2,2,2,2,2};
		Assert.assertArrayEquals(expected, sort.performSort(array));
	}
	
	@Test
	public void positiveTestNegativeNumbers(){
		
		int[] array = {-3,-5,-2,-10,-8,-34};
		int[] expected = {-34,-10,-8,-5,-3,-2};
		Assert.assertArrayEquals(expected, sort.performSort(array));
	}
	
	@Test
	public void positiveTestPositiveNegativeNumbers(){
		
		int[] array = {3,5,-2,10,2,8};
		int[] expected = {-2,2,3,5,8,10};
		Assert.assertArrayEquals(expected, sort.performSort(array));
	}
	
	@Test
	public void negativeTestWithEmptyArray(){
		
		int[] array = {};
		int[] expected = {};
		Assert.assertArrayEquals(expected, sort.performSort(array));
	}
	
		
	@After
	public void cleanUp(){
		sort = null;		
	}
}
