/*Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter)  
 * and methods(calculateArea,calculatePerimeter,setSides.
 */

package com.main;

public abstract class Shape {

	int noOfSides;
	
	double area = 0,perimeter = 0 ;
	
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();
	
	abstract void setSides();
}
