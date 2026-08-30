package com.fbs.demo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="SM")
public class SalesManager extends Employee {
	
	
	public SalesManager()
	{
		
	}
	
	
	
	public SalesManager(int id, String name, double salary, int target, double incentive) {
		super(id, name, salary);
		this.target = target;
		this.incentive = incentive;
	}



	int target;
	double incentive;
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	
	

}
