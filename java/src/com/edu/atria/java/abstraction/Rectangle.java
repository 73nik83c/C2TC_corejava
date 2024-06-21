package com.edu.atria.java.abstraction;

public class Rectangle extends Shape {
	
	float length,breadth;
	
	public Rectangle (float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public float calculateArea() {
		return area=length*breadth;
	}
}
