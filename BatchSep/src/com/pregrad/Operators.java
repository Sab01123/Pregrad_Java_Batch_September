package com.pregrad;

public class Operators {
	
	
	
	String myName= "sabira";
	
	int i = 10;
	byte j = 10;
	
	byte num = -127;
	
	double precent = 72.2;
	char section = 'A';
	
	
	
	
	public boolean  ternaryOpre() {
		
		int num1 = 10;
		int num2 = 9;
		
//		if(num1 > num2) {
//			return true;
//		}
//		else {
//			return false;
//		}
           
		return num1 > num2 ? true:false;
		
	}
	
	public int  ternaryOpre2() {
		
		int num1 = 10;
		int num2 = 19;
		

           
		return num1 > num2 ? 1:-1;
		
	}
	
	
	public void studentResult(int marks) {
		//50-100
		//below 50 fail
	
		if(marks >= 50 && marks <100) {
			
			System.out.println("pass..");
			
		}else {
			System.out.println("fail...");
		}
		
	}

	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		Operators s1 = new Operators();
//		s1.studentResult(50);
		
	
		
//	  boolean ans =	s1.ternaryOpre();
//	  System.out.println(ans);
		
		
//		System.out.println(s1.ternaryOpre());
		System.out.println(s1.ternaryOpre2());
		System.out.println(s1.ternaryOpre2());
		System.out.println(s1.ternaryOpre2());
		
		
		boolean stu1 = false;
		boolean stu2 = true;
		boolean stu3 = false;
		
		// login and logout  +1
		
		System.out.println(stu1 && stu2 || stu3);    //
		
//		OR Case
		
		//A     B        R
		
//		  T     T        T
//		  F     T        T
//		  T     F        T
//		  F     F        F
//		AND
		//A     B        R
		
//		  T     T        T
//		  F     T        F
//		  T     F        F
//		  F     F        F
		
		
		
		
//		T && (T || F) = 
		
		
		
		
		
		
	}
	
	
	
	

}
