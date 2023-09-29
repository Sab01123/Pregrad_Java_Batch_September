package relationship;

public class Teacher {
	
	int id;
	String name;
	int salary;
	
	Address address;    //user defined datatype
	
	
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	

	public Teacher(int id, String name, int salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}



	
	
	
	
	


	
	
	
	

}
