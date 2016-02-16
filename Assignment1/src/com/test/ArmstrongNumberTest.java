package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.main.ArmstrongNumber;

public class ArmstrongNumberTest {

	@Test
	public void positiveNumberTest()
	{
		ArmstrongNumber arm = new ArmstrongNumber();
		int number = 153;	
		Assert.assertTrue("The number " + number + " is Armstrong", arm.isNumberArmstrong(number));		
	}
	
	@Test
	public void negativeNumberTest()
	{
		ArmstrongNumber arm = new ArmstrongNumber(); 
		int number = 10;
		Assert.assertFalse("The number " + number + " is not Armstrong", arm.isNumberArmstrong(number));	
	}
	
}
