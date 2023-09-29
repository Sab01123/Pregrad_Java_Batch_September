package relationship;



public class Main {
	
	
	
	public static void main(String[] args) {
		
//		Dog a1 = new Dog();
//		
//		String sound = a1.sound;
//		String sleep = a1.sleep;
//		
//		
//		Cat c1 = new Cat();
//		
//		String catSound = c1.sound;
//		String catSleep = c1.sleep;
		
		
		
		
		
		
		Teacher t2 = new Teacher();
		t2.id = 10;
		t2.name = "saba";
		
		
		Teacher t1 = new Teacher(10, "sabira", 100, new Address(111, "india", "punjab", "chand")); 
		
		
		System.out.println(t1);
		
		
		HOD h1 = new HOD(100, "abc", new Address(100, "as", "xyz", "delhi"));
		
		
		System.out.println(h1);
		
	   
		
		
		
		
		
		
	}
	
	

}
