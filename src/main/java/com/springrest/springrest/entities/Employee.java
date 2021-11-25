package com.springrest.springrest.entities;

public class Employee {
	private long id;
	private String fullName;
	private String designation;

	public Employee(long id, String fullName, String designation) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.designation = designation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", title=" + fullName + ", designation=" + designation + "]";
	}

}
