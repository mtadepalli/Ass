package com.test;
import org.junit.*;
import org.junit.Test;
import com.main.Numbers;

public class NumbersTest {
	
	@Test
	public void positiveTest(){
		
		Numbers num = new Numbers();
		Assert.assertEquals(5, num.sum(2, 3));	
		Assert.assertEquals(9.5, num.sum(2, 3, 4.5), 0);
		Assert.assertEquals(9.5, num.sum(5, 4.5), 0);
	}
	
	@Test
	public void positiveNegativeNumbersTest(){
		
		Numbers num = new Numbers();
		Assert.assertEquals(-5, num.sum(-2, -3));		
		Assert.assertEquals(-9.5, num.sum(-5, -4.5), 0);		
	}
}
