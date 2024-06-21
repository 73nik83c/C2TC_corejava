package com.edu.atraia.java.exception;

@SuppressWarnings("serial")
public class InvalidageException extends Exception{
	
	public InvalidageException() {
		super("Invalid Age");
	}
	
	InvalidageException(String message){
		super(message);
	}
	
	
	

}
