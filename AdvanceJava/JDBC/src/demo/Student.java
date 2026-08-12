package demo;


import java.sql.Date;

public class Student {

	private int rollno;
	private String name;
	private double marks;
	private long mobile;
	private String city;
	private Date dob;

	// Default Constructor
	public Student() {

	}
	
	

	// Parameterized Constructor
	public Student(int rollno, String name, double marks, long mobile, String city, Date dob) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.mobile = mobile;
		this.city = city;
		this.dob = dob;
	}

	public Student(int rollno, String name, int marks, long mobno) {
	    this.rollno = rollno;
	    this.name = name;
	    this.marks = marks;
	    this.mobile = mobno;
	}
	// Getters and Setters

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long string) {
		this.mobile = string;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", mobile=" + mobile
				+ ", city=" + city + ", dob=" + dob + "]";
	}
}