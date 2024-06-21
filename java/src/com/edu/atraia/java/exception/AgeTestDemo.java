package com.edu.atraia.java.exception;

import java.util.Scanner;

public class AgeTestDemo {
	
	public static void main(String[]args) {
		
		int age;
		Scanner sc=new Scanner(System.in);
		AgeTest at=new AgeTest();
		System.out.println("Enter your age");
		age=sc.nextInt();
		
		try {
			at.validate(age);
		}catch(InvalidageException e) {
			System.err.println("Caught an Exception:\n"+e.getMessage());
		}
		sc.close();
	}
}
