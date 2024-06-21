package com.edu.atraia.java.exception;

public class AgeTest {
	
	public void validate(int age) throws InvalidageException{
		
		if (age<10)
			throw new InvalidageException("Invalid age..you are not eligible to vote..");
			else
				System.out.println("Welcome to vote");
	}

}
