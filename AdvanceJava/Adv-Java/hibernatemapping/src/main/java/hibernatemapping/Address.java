package hibernatemapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	
	String houseno ;
	String laneno ;
	int pincode ;
	String city ;
	String state ;
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getLaneno() {
		return laneno;
	}
	public void setLaneno(String laneno) {
		this.laneno = laneno;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", laneno=" + laneno + ", pincode=" + pincode + ", city=" + city
				+ ", state=" + state + "]";
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(String houseno, String laneno, int pincode, String city, String state) {
		super();
		this.houseno = houseno;
		this.laneno = laneno;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}
	
	
	public Address() {
		
	}
	
	

}
