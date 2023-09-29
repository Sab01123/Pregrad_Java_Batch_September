package com.pregrad;

import relationship.ClassA;

//blueprint
public class Car extends ClassA{
	
	String colour;
	String engine;
	
	
	int myAge = 30;
//	int @hisAge = 32;// not valid
	int $my_Money;
	
//	int byte = 1;
	byte b = 125;
//	byte c = 129;
	
	char section ='A';
	
	boolean isPresent= false;
	
	
	
    //  String if = "sabira";
      
      
      public void sum() {
    	  
    	  int i = 20;
    	  int j = 10;
    	  
    	  int ans = i%j;
    	  
    	  System.out.println(ans);
    	  
    	  
    	  
      }
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Car [colour=" + colour + ", engine=" + engine + "]";
	}

	

}
