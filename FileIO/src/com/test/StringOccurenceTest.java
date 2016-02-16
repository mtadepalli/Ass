package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.main.StringOccurence;

public class StringOccurenceTest {
	
	StringOccurence sr;
	
	@Before
	public void setUp(){
		
		sr = new StringOccurence();		
	}

	@Test
	public void positiveTest(){
		
		String path = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\StringOccurence\\count.txt";
		
		assertEquals(2, sr.count(path, "java"));			
	}
	
	@Test
	public void positiveTestWordNotPresent(){
		
		String path = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\StringOccurence\\count.txt";
		
		assertEquals(0, sr.count(path, "belong"));			
	}
	
	@Test
	public void positiveTestWordEmptyFile(){
		
		String path = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\StringOccurence\\EmptyFile.txt";
		
		assertEquals(0, sr.count(path, "belong"));			
	}	
	
	@After
	public void cleanUp(){
		
		sr = null;
	}
	

}
