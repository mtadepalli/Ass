package com.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.main.Divisible;

public class DivisibleTest{

	@Test
	public void positivePingTest()
	{
		Divisible div = new Divisible();
		String actual = "ping";
		int number = 3;
		String expected = div.divideNumber(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void positivePongTest()
	{
		Divisible div = new Divisible();
		String actual = "pong";
		int number = 10;
		String expected = div.divideNumber(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void positivePingPongTest()
	{
		Divisible div = new Divisible();
		String actual = "ping pong";
		int number = 15;
		String expected = div.divideNumber(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void positiveNumberTest()
	{
		Divisible div = new Divisible();
		String actual = "16";
		int number = 16;
		String expected = div.divideNumber(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void zeroNumberTest()
	{
		Divisible div = new Divisible();
		String actual = "ping pong";
		int number = 0;
		String expected = div.divideNumber(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void maximumNumberTest()
	{
		Divisible div = new Divisible();
		String actual = String.valueOf(Integer.MAX_VALUE);
		int number = Integer.MAX_VALUE;
		String expected = div.divideNumber(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void minimumNumberTest()
	{
		Divisible div = new Divisible();
		String actual = String.valueOf(Integer.MIN_VALUE);
		int number = Integer.MIN_VALUE;
		String expected = div.divideNumber(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void negativePingTest()
	{
		Divisible div = new Divisible();
		String actual = "ping";
		int number = -3;
		String expected = div.divideNumber(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void negativePongTest()
	{
		Divisible div = new Divisible();
		String actual = "pong";
		int number = -10;
		String expected = div.divideNumber(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void negativePingPongTest()
	{
		Divisible div = new Divisible();
		String actual = "ping pong";
		int number = -15;
		String expected = div.divideNumber(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void negativeNumberTest()
	{
		Divisible div = new Divisible();
		String actual = "-16";
		int number = -16;
		String expected = div.divideNumber(number);
		assertEquals(expected, actual);
	}
	
}
