package com.test;
import static org.junit.Assert.*;
import org.junit.Test;

import com.main.SwapNumbers;

public class SwapNumbersTest{

	@Test
	public void positiveNumbersTest()
	{
		SwapNumbers swap = new SwapNumbers();
		int[] array = {30, 40};
		swap.swapNumbers1(array);
		assertEquals(40, array[0]);
		assertEquals(30, array[1]);
	}
	
	@Test
	public void negativeNumbersTest()
	{
		SwapNumbers swap = new SwapNumbers();
		int[] array = {-30, -40};
		swap.swapNumbers1(array);
		assertEquals(-40, array[0]);
		assertEquals(-30, array[1]);
	}
	
	@Test
	public void mixedNumbersTest()
	{
		SwapNumbers swap = new SwapNumbers();
		int[] array = {20, -60};
		swap.swapNumbers1(array);
		assertEquals(-60, array[0]);
		assertEquals(20, array[1]);
	}	

	@Test(expected = Exception.class)
	public void negativeTestWithNullArray()
	{
		SwapNumbers swap = new SwapNumbers();
		int[] array = null;
		swap.swapNumbers1(array);
		assertEquals(0,array[0]);
		assertEquals(0,array[1]);
	}	

	@Test(expected = Exception.class)
	public void negativeTestWithEmptyArray()
	{
		SwapNumbers swap = new SwapNumbers();
		int[] array = {};
		swap.swapNumbers1(array);
		assertEquals(0,array[0]);
		assertEquals(0,array[1]);
	}		
}