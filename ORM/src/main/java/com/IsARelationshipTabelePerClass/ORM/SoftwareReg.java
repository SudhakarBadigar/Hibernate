package com.IsARelationshipTabelePerClass.ORM;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@Entity
//@DiscriminatorValue("SE")
public class SoftwareReg extends Employee{
	
	private String tools;

	public SoftwareReg() {
	}

	

	public SoftwareReg(int id, String name, String email, double salary, String tools) {
		super(id, name, email, salary);
		this.tools = tools;
	}



	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}
	
}
