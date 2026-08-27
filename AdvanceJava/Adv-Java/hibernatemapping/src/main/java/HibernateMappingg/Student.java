package HibernateMappingg;

import org.hibernate.engine.jdbc.batch.spi.Batch;

import hibernatemapping.Address;

public class Student {
	
	int FRN;
	String name;
	int marks;
	Address address;
	Batch batch;
	public int getFRN() {
		return FRN;
	}
	public void setFRN(int fRN) {
		FRN = fRN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	
	
	

}
