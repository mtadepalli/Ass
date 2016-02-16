package com.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.main.Rectangle;
import com.main.Shape;

public class RectangleTest {
	@Test
	public void positiveDimensionTest()
	{
		Shape shape = new Rectangle(3, 4);
		assertEquals(12, shape.calculateArea(), 0);
		assertEquals(14, shape.calculatePerimeter(), 0);
	}

	@Test
	public void negativeZeroDimensionTest()
	{
		Shape shape = new Rectangle(0, 0);
		assertEquals(0, shape.calculateArea(), 0.0);
		assertEquals(0, shape.calculatePerimeter(), 0.0);
	}

	@Test
	public void negativeDimensionTest()
	{
		Shape shape = new Rectangle(-2, -3);
		assertEquals(0, shape.calculateArea(), 0.0);
		assertEquals(0, shape.calculatePerimeter(), 0.0);
	}

}
