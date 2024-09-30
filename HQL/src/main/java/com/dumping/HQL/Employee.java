package com.dumping.HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int	id;
	private String name;
	private double salary;
	private String mail;
	private String address;

//comments in the employee class
	
	public Employee() {

	}

	public Employee(int id, String name, double salary, String mail, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mail = mail;
		this.address = address;
	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mail=" + mail + ", address="
//				+ address + "]";
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
