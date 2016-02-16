package com.main;

public class Rectangle extends Shape{
	
	int length, width;
	
	public Rectangle(int length, int width){
		
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea(){
		
		area = 0;
		
		if(length > 0 && width > 0)
			area = length * width;
		
		return area;
	}
	
	public double calculatePerimeter(){
		
		perimeter = 0;
		
		if(length > 0 && width > 0)
			perimeter = 2*(length + width);
		
		return perimeter;
	}
	
	public static void main(String[] args){
		
		Shape s = new Rectangle(3,4);
		System.out.println("Area is : "+ s.calculateArea());
		System.out.println("Perimeter is : "+ s.calculatePerimeter());
	}
}
