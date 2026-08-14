package Hibernatemapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
@Id
    private String houseno;
    private String laneno;
    private String city;
    private String state;
    private int pincode;

    public Address(String houseno, String laneno, String city, String state, int pincode) {
        this.houseno = houseno;
        this.laneno = laneno;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

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

    public String getCity() {
        return city;
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

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public Address() {

    }
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", laneno=" + laneno + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
    
}