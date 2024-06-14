package com.edu.atria.java.keyword;

public class Employee {
	//Instance variable
		private int empid;
		private String employee;
		
		private static String company="IBM";

		public Employee(int empid, String employee) {
			super();
			this.empid = empid;
			this.employee = employee;
			
		}

		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", employee=" + employee + ", company=" +company+ "]";
		}

		
}
