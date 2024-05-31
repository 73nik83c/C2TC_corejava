package com.edu.atria.java.secondpackage;

import com.edu.atria.java.firstpackage.Base;

public class ExecuteTwo extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bTwo=new Base();
		//private members are not accessible outside the first package
		//System.out.println(bTwo.varPrivate);
		
		//default members are not accessible outside the first package
		//System.out.println(bTwo.varPrivate);
		
		ExecuteTwo ex=new ExecuteTwo();
		System.out.println(ex.variableProtected);
		
		System.out.println(bTwo.variablePublic);

	}

}
