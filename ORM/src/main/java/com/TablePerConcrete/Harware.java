package com.TablePerConcrete;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@PrimaryKeyJoinColumn(name="id")
@AttributeOverrides({
	@AttributeOverride(name="id",column =@Column(name="id")),
	@AttributeOverride(name="name",column =@Column(name="name")),
	@AttributeOverride(name="email",column =@Column(name="email")),
	@AttributeOverride(name="sal", column = @Column(name="sal"))
})
public class Harware extends AccentureEmployee{
	
	private String tools;

	public Harware() {

	}

	public Harware(int id, String name, String email, double sal, String tools) {
		super(id, name, email, sal);
		this.tools = tools;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

}
