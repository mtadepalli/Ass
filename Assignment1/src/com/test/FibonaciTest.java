package com.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.main.Fibonaci;

public class FibonaciTest{

	@Test
	public void positiveFibTest()
	{
		Fibonaci fib = new Fibonaci();
		String actual = "0 1 1 2 3 5 8 13 21 34";
		int n = 10;
		String expected = fib.calculateFibonaciNumbers(n);
		assertEquals(expected, actual);
	}
	
	@Test
	public void defaultFibTest()
	{
		Fibonaci fib = new Fibonaci();
		String actual = "";
		int n = 0;
		String expected = fib.calculateFibonaciNumbers(n);
		assertEquals(expected, actual);
	}
	
	@Test
	public void negativeFibTest()
	{
		Fibonaci fib = new Fibonaci();
		String actual = "";
		int n = -1;
		String expected = fib.calculateFibonaciNumbers(n);
		assertEquals(expected, actual);
	}
	
	@Test
	public void oneFibnumbersTest()
	{
		Fibonaci fib = new Fibonaci();
		String actual = "0";
		int n = 1;
		String expected = fib.calculateFibonaciNumbers(n);
		assertEquals(expected, actual);
	}
	
	@Test
	public void twoFibnumbersTest()
	{
		Fibonaci fib = new Fibonaci();
		String actual = "0 1";
		int n = 2;
		String expected = fib.calculateFibonaciNumbers(n);
		assertEquals(expected, actual);
	}

	@Test
	public void threeFibnumbersTest()
	{
		Fibonaci fib = new Fibonaci();
		String actual = "0 1 1";
		int n = 3;
		String expected = fib.calculateFibonaciNumbers(n);
		assertEquals(expected, actual);
	}
	
}
