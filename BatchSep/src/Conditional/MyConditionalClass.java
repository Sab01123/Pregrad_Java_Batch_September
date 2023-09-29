package Conditional;

public class MyConditionalClass {
	
	
	public static int sum(int num) {
		
		int i= 10;
		int j = 20;
		
		if(num==i) {
			return 10;
		}
		
		else if(num ==j) {
			return 20;
		}
		else return 0;
		
	}
	
	
	
	public void switchCase(String day) {
		
		switch(day) {
		case "sunday" : System.out.println("today is sunday enjoy!");
		break;
		case "mon" : System.out.println("today is mon office!");
		break;
		case "tue" : System.out.println("today is office enjoy!");
		break;
		case "wed" : System.out.println("today is office enjoy!");
		break;
		case "thur" : System.out.println("today is office enjoy!");
		break;
		case "fri" : System.out.println("today is office enjoy");
		break;
		case "sat" : System.out.println("today is weedend...!");
		break;
		default :System.out.println("not a valid day");
		break;
		
		}

	}
	
	
	public static void main(String[] args) {
		
		System.out.println(MyConditionalClass.sum(16));
		
	MyConditionalClass m1 = new MyConditionalClass();
	
	m1.switchCase("mon");
	
	
//	System.out.println("anmol");
//	System.out.println("anmol");
//	System.out.println("anmol");
//	System.out.println("anmol");
//	System.out.println("anmol");
//	System.out.println("anmol");
//	System.out.println("anmol");
//	System.out.println("anmol");
//	System.out.println("anmol");
//	System.out.println("anmol");
	
	
//	int count = 1;
//	
//	for(int i = 0; i<10; i++) {
//		System.out.println("anmol "+ count++);
//	}
//	
//	
//	
//	for(int i=0; i<10; i++) {
//		System.out.println(i);
//	}
	
	int[] arr = new int[] {20,30,40,50};
	
    
    
//    for(int i=0; i<arr.length; i++) {
//    	System.out.println(arr[i]);
//    }
//  
//	System.out.println("enhanced forloop....");
//	
//	///Enhanced forloop
//	for(int i: arr) {
//		System.out.println(i);
//	}
	
//	int i =0;
//	while(i<arr.length) {
//		System.out.println(arr[i]);
//		i++;
//	}
	
	
	
	
	
	
	
		
		
	}
	
	
	
	

}
