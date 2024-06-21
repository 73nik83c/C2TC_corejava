package com.edu.atria.java.abstraction;

public class AbstracrClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape sOne=new Square(2.5f);
		sOne.calculateArea();
		sOne.display();
		
		
		Shape sTwo=new Rectangle(7,5.5f);
		sTwo.calculateArea();
		sTwo.display();

	}

}
