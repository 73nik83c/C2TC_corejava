package com.edu.atria.java.abstraction;

public abstract class Shape {
	
	float area;
	public abstract float calculateArea();
	
	public void display() {
		System.out.println("Area of the Shape:"+ area);
	}

}
