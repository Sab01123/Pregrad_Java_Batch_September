package scanners;
//java bean class
public class Address {
	
	private int pinCode;
	private String country;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}


	public Address(int pinCode, String country) {
		super();
		this.pinCode = pinCode;
		this.country = country;
	}


	public int getPinCode() {
		return pinCode;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", country=" + country + "]";
	}
	
	
	

}
