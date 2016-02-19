package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.main.NullPointerExceptionExample;

public class NullPointerExceptionTest {
	
	NullPointerExceptionExample np;
	
	@Before
	public void setUp(){
		
		np = new NullPointerExceptionExample();		
	}	
	
	@Test
	public void positiveTest(){
		
		assertEquals(5, np.stringOperations("Hello"));		
	}	

	@Test
	public void negativeTestNullString(){
		
		String str = null;
		assertEquals(-1, np.stringOperations(str));		
	}	
	
	@After
	public void cleanUp(){
		
		np = null;		
	}
}
