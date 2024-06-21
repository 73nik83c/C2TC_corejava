package com.edu.atraia.java.exception;

import java.util.Scanner;

public class RuntimeException {
	public static void divide(int x, int y) {
		int z;
		try {
		z=x/y;
		System.out.println("The value of z:"+z);
		}catch(ArithmeticException a) {
			System.err.println(a.getMessage());
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Inside the try block...");
			System.out.println("Enter two number...");
			x=Integer.parseInt(sc.nextLine());
			y=Integer.parseInt(sc.nextLine());
			divide(x,y);
		}catch(Exception ex) {
			System.err.println("Invalid Input! please enter a valid integer input");

	}

	}
}
