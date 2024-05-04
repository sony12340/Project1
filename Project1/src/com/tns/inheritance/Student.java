package com.tns.inheritance;
// child class
public class Student extends Citizen {
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collageName=" + collageName + "]";
	}
	

	private int rollNo;
	private String collageName;
	
	public Student(int i, String string) {
		super();
	}

	public Student(String name,long aadharNo,String address,long phno) {
		super(name,aadharNo,address,phno);
		this.rollNo = rollNo;
		this.collageName = collageName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	

}
