package pack1;
//java bean class
public class Student {
	
	
	private int roll;
	private String name;
	private double marks;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}


	
	
	
	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	public void displaydetails() {
		System.out.println("Roll is " + roll);
		System.out.println("name is " + name);
		System.out.println("marks are " + marks);
	}


//	@Override
//	public String toString() {
//		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
//	}
//	
	
	
	

	
	
	
	
	
	
	
	

}
