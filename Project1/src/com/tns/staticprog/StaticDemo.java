package com.tns.staticprog;

public class StaticDemo {
	
	public static void main(String [] args) {
		System.out.println(Employee.companyName);
		Employee e=new Employee("ramya",123);
		System.out.println(e);
	    e=new Employee("suma",122);
	    System.out.println(e);


	}

}
