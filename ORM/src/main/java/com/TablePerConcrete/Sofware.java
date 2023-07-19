package com.TablePerConcrete;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
@AttributeOverrides({
	@AttributeOverride(name="id",column = @Column(name="id")),
	@AttributeOverride(name="name",column =  @Column(name="name")),
	@AttributeOverride(name="email",column =  @Column(name="email")),
	@AttributeOverride(name="sal" ,column =  @Column(name="sal"))
})
public class Sofware extends AccentureEmployee{
	
	private int wh;

	public Sofware() {
	}

	public Sofware(int id, String name, String email, double sal, int wh) {
		super(id, name, email, sal);
		this.wh = wh;
	}

	public int getWh() {
		return wh;
	}

	public void setWh(int wh) {
		this.wh = wh;
	}
}
