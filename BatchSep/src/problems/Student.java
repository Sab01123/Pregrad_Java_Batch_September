package problems;

public class Student {
	
	private int roll;
	private String name;
	private String address;
	private String CollageName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public Student(int roll, String name, String address, String collageName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		CollageName = collageName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollageName() {
		return CollageName;
	}

	public void setCollageName(String collageName) {
		CollageName = collageName;
	}

//	public static Student getStudent(boolean isFromNIT) {
//		
//		
//		if(isFromNIT==true) {
//			Student stu = new Student(10, "sab", "hyd");
//			stu.setCollageName("NIT");
//			return stu;
//		}
//		
//	}
	
	

}
