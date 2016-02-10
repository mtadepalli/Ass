package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.SwapElements;

public class SwapElementsTest {
	
	SwapElements swap;
	
	@Before
	public void init(){
		swap = new SwapElements();
	}

	@Test
	public void positiveTest(){
		
		int[] array = {1,4,3,2,5};
		int[] expected = {1,2,3,4,5};
		Assert.assertArrayEquals(expected, swap.performSwap(array));
	}	
	
	@Test
	public void positiveTestWithDuplicates(){
		
		int[] array = {1,4,3,4,5};
		int[] expected = {1,3,4,4,5};
		Assert.assertArrayEquals(expected, swap.performSwap(array));
	}	
	
	@Test
	public void positiveTestWithNegativeNumbers(){
		
		int[] array = {-5,-2,-3,-4,-1};
		int[] expected = {-5,-4,-3,-2,-1};
		Assert.assertArrayEquals(expected, swap.performSwap(array));
	}	
	
	@Test
	public void positiveTestWithSameElements(){
		
		int[] array = {1,1,1};
		int[] expected = {1,1,1};
		Assert.assertArrayEquals(expected, swap.performSwap(array));
	}	
	
	@Test
	public void negativeTestWithEmptyArray(){
		
		int[] array = {};
		int[] expected = {};
		Assert.assertArrayEquals(expected, swap.performSwap(array));
	}
	
	@After
	public void cleanUp(){
		swap = null;		
	}
}
