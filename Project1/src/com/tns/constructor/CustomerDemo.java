package com.tns.constructor;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("read name,id,city");
		id=sc.nextInt();
		sc.nextLine();
		name=sc.nextLine();
		city=sc.nextLine();
		System.out.println("the details are" +name +"," +city  +"," +id);
		Customer c=new Customer();// default constructor is invoked
		System.out.println(c);
		c.setCustomerId(id);
		c.setCustomerName(name);
		c.setCustomerCity(city);
		
		System.out.println(c);
		
		Customer cob=new Customer();
		System.out.println(cob);
		

	}

}
