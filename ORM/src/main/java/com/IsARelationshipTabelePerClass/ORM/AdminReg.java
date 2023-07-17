package com.IsARelationshipTabelePerClass.ORM;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ar")
public class AdminReg extends Employee{
	private String branchname;

	public AdminReg() {

	}

	public AdminReg(int id, String name, String email, double salary, String branchname) {
		super(id, name, email, salary);
		this.branchname = branchname;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	
	
	

}
