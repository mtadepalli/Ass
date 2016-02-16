package com.test;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.main.FileCopy;


public class FileCopyTest {
	
	FileCopy fc;
	
	@Before
	public void setUp(){
		
		fc = new FileCopy();		
	}

	@Test
	public void positiveTest(){
		
		String source = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\FileCopy\\SourceFile.txt";
		
		String dest = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\FileCopy\\DestFile.txt";
		
		assertEquals(63, fc.performCopy(source, dest));	
	}	
	
	@Test
	public void emptyFileTest(){
		
		String source = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\FileCopy\\EmptyFile.txt";
		
		String dest = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\FileCopy\\EmptyFileDest.txt";
		
		assertEquals(-1, fc.performCopy(source, dest));	
	}
	
	@Test
	public void negativeTestFileDoesntExist(){
		
		String source = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\FileCopy\\FileDoesNotExist.txt";
		
		String dest = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\FileCopy\\DestFileDoesNotExist.txt";
		
		assertEquals(-1, fc.performCopy(source, dest));	
	}
	
	@After
	public void cleanUp(){
		
		fc = null;
	}
}
