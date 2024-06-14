package com.edu.atria.java.keyword;

public class MyClass {
	private int section;
	private static int srNo;
	
	static {
		System.out.println("within the block.....");
		srNo=1000;
	}
	MyClass(){
		System.out.println("within default constructor....");
		srNo++;
	}
	public static void display() {
		System.out.println(srNo);
		//System.out.println(section);//cannot access non static member inside a static a 
	}
	@Override
	public String toString() {
		return "MyClass [section=" + section + ", srNo="+srNo+"]";
	}
	

}
