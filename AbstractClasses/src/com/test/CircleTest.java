package com.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.main.Circle;
import com.main.Shape;

public class CircleTest {
	
	@Test
	public void positiveTest()
	{
		Shape shape = new Circle(3);
		assertEquals(28.2744, shape.calculateArea(), 0.0);
		assertEquals(18.8496, shape.calculatePerimeter(), 0.0);
	}

	@Test
	public void negativeZeroRadiusTest()
	{
		Shape shape = new Circle(0);
		assertEquals(0, shape.calculateArea(), 0.0);
		assertEquals(0, shape.calculatePerimeter(), 0.0);
	}

	@Test
	public void negativeRadiusTest()
	{
		Shape shape = new Circle(-2);
		assertEquals(0, shape.calculateArea(), 0.0);
		assertEquals(0, shape.calculatePerimeter(), 0.0);
	}
}
