package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.FileNames;

public class FileNamesTest {

	FileNames fname;
	
	@Before
	public void setUp(){
		
		fname = new FileNames();		
	}

	@Test
	public void positiveTest(){
		
		String path = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\FileNames";
		
		FileNames f = new FileNames();
		
		String[] expectedNames = {"a.txt","b.txt","c.txt","d.txt","Empty"};
		
		Assert.assertArrayEquals(expectedNames, f.getNames(path));				
	}
	
	@Test
	public void positiveTestWithEmptyDirectory(){
		
		String path = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\FileNames\\Empty";
		
		FileNames f = new FileNames();
		
		String[] expectedNames = {};
		
		Assert.assertArrayEquals(expectedNames, f.getNames(path));				
	}
	
	@Test
	public void negativeTestWithDirectoryDoesntExist(){
		
		String path = "C:\\Innovapath\\Java\\JavaAssignments\\FileIO\\src\\com\\test\\FileNames\\Directory";
		
		FileNames f = new FileNames();
		
		String[] expectedNames = null;
		
		Assert.assertArrayEquals(expectedNames, f.getNames(path));				
	}
		
	@After
	public void cleanUp(){
		
		fname = null;
	}
}
