package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.ParenthesisBalance;

public class ParenthesisBalanceTest {
	
	ParenthesisBalance par;
	
	@Before
	public void init(){
		par = new ParenthesisBalance();
	}
	
	@Test
	public void positiveTest(){		
		
		String str = "{()}";
		Assert.assertTrue(str + " has matched parenthesis.", par.checkParenthesis(str));
	}	
	
	@Test
	public void positiveTestAllParenthesis(){		
		
		String str = "[{()}]";
		Assert.assertTrue(str + " has matched parenthesis.", par.checkParenthesis(str));
	}	
	
	@Test
	public void negativeTest(){		
		
		String str = ")(";
		Assert.assertFalse(str + " doesn't have matched parenthesis.", par.checkParenthesis(str));
	}	
	
	@Test
	public void negativeTestWithMultipleUnevenParenthesis(){		
		
		String str = "[({})]]]";
		Assert.assertFalse(str + " doesn't have matched parenthesis.", par.checkParenthesis(str));
	}	
	
	@Test
	public void negativeTestWithUnevenParenthesis(){		
		
		String str = "(())))";
		Assert.assertFalse(str + " doesn't have matched parenthesis.", par.checkParenthesis(str));
	}	
	

	@Test
	public void negativeTestEmptyString(){
		
		String str = " ";
		Assert.assertFalse(str + " doesn't have matched parenthesis.", par.checkParenthesis(str));	
	}
	
	@Test(expected = NullPointerException.class)	
	public void negativeTestNullString(){	
		
		String str = null;
		Assert.assertFalse(str + " doesn't have matched parenthesis.", par.checkParenthesis(str));
	}			

	@After
	public void cleanUp(){
		par = null;		
	}
}
