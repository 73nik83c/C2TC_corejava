package com.edu.atria.java.finalkeyword;

public class Finalvariable {
	
	final int x =100;
	
	final static int y;
	
	final static int z=10;
	
	void change() {
		//x=30;//
		//y=200;//
		
	}

	@Override
	public String toString() {
		return "Finalvariable [x=" + x + ", y="+y+"]";
	}
	
	static {
		y=20;
		System.out.println("Value of Y:"+y);
	}

}
