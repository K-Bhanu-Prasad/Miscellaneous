package com.swagger.swaggerexample.resources;

import io.swagger.annotations.ApiModelProperty;

public class User {


	@ApiModelProperty(value="Name of the user")
	private String name;

	@ApiModelProperty(notes="Salary of the user")
	private long salary;

	public User(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", salary=" + salary + "]";
	}

}
