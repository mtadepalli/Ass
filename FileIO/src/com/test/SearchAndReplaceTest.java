package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.main.SearchAndReplace;

public class SearchAndReplaceTest {
	
	SearchAndReplace sr;
	
	@Before
	public void setUp(){
		
		sr = new SearchAndReplace();		
	}

	@Test
	public void positiveTest(){
		
		String path = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\SearchReplace\\file.txt";
		
		assertTrue(sr.performSearchReplace(path, "hi", "bye"));			
	}
	
	@Test
	public void negativeTestWordDoesNotExist(){
		
		String path = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\SearchReplace\\file.txt";
		
		assertFalse(sr.performSearchReplace(path, "hello", "yellow"));			
	}	
	
	@After
	public void cleanUp(){
		
		sr = null;
	}

}
