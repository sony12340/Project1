package com.tns.staticprog;
// program to demonstrate static block and method
public class MyClass {
	private int section;
	private static int srNo;
	
	static {
		System.out.println("Static Block");
		srNo=1000;
	}
	MyClass()
	{
		System.out.println("default constructor");
		section++;
		srNo++;
	}
	static void display() {
		System.out.println("Serial no"+srNo);
		
		
	}
	@Override
	public String toString() {
		return "MyClass [seection=" + section + "]";
	}
	

}