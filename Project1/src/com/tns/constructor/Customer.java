package com.tns.constructor;
//program to demonstrate constructor
public class Customer {
	private int customerId; // data members
	private String customerCity;
	private String customerName;
	// default constructor
	public Customer() {
		System.out.println("Default Constructor");
		
		
		}
	// Parameterized constructor
	
	public Customer(int customerId,String customerCity, String customerName)
	{
		
		System.out.println("Parametreized constructor");
		this.customerId=customerId;
		this.customerCity=customerCity;
		this.customerName=customerName;
		
		
		
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerCity=" + customerCity + ", customerName="
				+ customerName + "]";
	}
	
	

}
