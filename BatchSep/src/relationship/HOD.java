package relationship;

public class HOD {
	
	
	int id;
	String name;
	
	
	Address add;
	
	
	public HOD() {
		// TODO Auto-generated constructor stub
	}


	public HOD(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}


	@Override
	public String toString() {
		return "HOD [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	

}
