/* Write a program that creates a class Circle extending Shape abstract class and implementing ShapeConstants 
 * interface and has following behavior.
  	--> Properties: radius.
  	--> Constructor: To set number of sides.
  	--> Overrides all the methods from parents.
*/
package com.main;

public class Circle extends Shape implements ShapeConstants{
	
	private int radius;
	
	public Circle(int radius)
	{
		this.radius = radius;		
	}
	
	void setSides() {
		
		this.noOfSides = 0;
	}
	
	public double calculateArea() {
			
		if(radius > 0)
			area = pi * radius * radius;
		
		return area;
	}

	
	 public double calculatePerimeter() {
		
		if(radius > 0)
			perimeter = 2 * pi * radius;
		
		return perimeter;		
	}	
}
