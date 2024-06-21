package com.edu.atraia.java.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		try {
		int x[];
		x=new int[] {1,2,4,5};
		System.out.println(x[5]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("Index is out of the bounds.."+ex.getMessage());
		}
		System.out.println("hello");
	}

}

