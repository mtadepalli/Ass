package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.main.CountWords;

public class CountWordsTest {
	
	CountWords cw;
	
	@Before
	public void setUp(){		
		
		cw = new CountWords();	
	}

	@Test
	public void positiveTest(){
		
		String path = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\CountWords\\count.txt";
		
		assertEquals(26, cw.count(path));		
	}
	
	@Test
	public void emptyFileTest(){
		
		String path = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\CountWords\\EmptyFile.txt";		
		
		assertEquals(0, cw.count(path));	
	}
	
	@Test
	public void negativeTestFileDoesntExist(){
		
		String path = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\CountWords\\FileDoesNotExist.txt";		
		
		assertEquals(0, cw.count(path));	
	}	
	
	@After
	public void cleanUp(){
		
		cw = null;
	}	
}
