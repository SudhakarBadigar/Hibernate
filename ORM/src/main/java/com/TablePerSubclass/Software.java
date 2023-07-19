package com.TablePerSubclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

//@DiscriminatorValue("soft")
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Software extends CognizantEmployee {
   private String tools;

public Software() {
	super();
}

public Software(int id, String name, String email, String tools) {
	super(id, name, email);
	this.tools = tools;
}

public String getTools() {
	return tools;
}

public void setTools(String tools) {
	this.tools = tools;
}
   
   

}
