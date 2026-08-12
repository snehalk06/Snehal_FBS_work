package model;

import java.sql.Date;

public class Student {

    private int rollno;
    private String name;
    private double marks;
    private String mobno;
    private String address;
    private Date dob;

    public Student() {}

    public Student(int rollno, String name, double marks,
                   String mobno, String address, Date dob) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.mobno = mobno;
        this.address = address;
        this.dob = dob;
    }

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

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}