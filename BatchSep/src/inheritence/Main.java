
package inheritence;

public class Main {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Anmol", 500);
		
//		System.out.println("Roll number is "+ s1.getRoll());
//		System.out.println("name  is "+ s1.getName());
//		System.out.println("marks number is "+ s1.getMarks());
		
		System.out.println(s1);
		
		
		
		Shape shape1 = new Rectangle() ;
		shape1.draw();
		Shape shape2 = new Square() ;
		shape2.draw();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
