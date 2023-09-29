package com.pregrad;

public class Student {
	
	
	int roll;
	String name;
	
	//constructor
	//zero args constructor
	
	
	public Student() {
		
	}
	
	
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

//	
//	public  Student2 (int roll, String name) {
//		
//	}





	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	
	
	
	
	
	

}
