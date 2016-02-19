package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.main.ThrowsClauseExample;

public class ThrowsClauseExampleTest {
	
	ThrowsClauseExample th;
	
	@Before
	public void setUp(){
		
		th = new ThrowsClauseExample();		
	}	
	
	@Test
	public void positiveTest(){
		
		assertEquals(5, th.numberOperations("/", 10, 2));		
	}	

	@Test
	public void negativeTest(){
		
		assertEquals(0, th.numberOperations("/", 10, 0));		
	}	
	
	@After
	public void cleanUp(){
		
		th = null;		
	}
}