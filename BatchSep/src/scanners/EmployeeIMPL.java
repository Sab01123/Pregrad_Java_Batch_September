package scanners;

public class EmployeeIMPL implements EmployeeInterface{

	@Override
	public void employeeDetails(int id, String name, Address address) {
		
		System.out.println("Employee id is "+id);
		System.out.println("Employee name is "+name);
		
		System.out.println("Employee Pincode is "+address.getPinCode());
		System.out.println("Employee Country is "+ address.getCountry());
		
	}

}
