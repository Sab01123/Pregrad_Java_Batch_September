package relationship;

public class Address {
	
	int pinCode;
	String country;
	String state;
	String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int pinCode, String country, String state, String city) {
		super();
		this.pinCode = pinCode;
		this.country = country;
		this.state = state;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", country=" + country + ", state=" + state + ", city=" + city + "]";
	}
	
	

}
