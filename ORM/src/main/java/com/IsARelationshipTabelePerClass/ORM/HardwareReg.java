package com.IsARelationshipTabelePerClass.ORM;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@Entity
//@DiscriminatorValue("HW")
public class HardwareReg extends Employee {
	
	private int workingHrs;

	public HardwareReg(int id, String name, String email, double salary, int workingHrs) {
		super(id, name, email, salary);
		this.workingHrs = workingHrs;
	}

	public HardwareReg() {
		
	}

	public int getWorkingHrs() {
		return workingHrs;
	}

	public void setWorkingHrs(int workingHrs) {
		this.workingHrs = workingHrs;
	}
	
	
	

}
