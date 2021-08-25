package com.jdbc.model;

public class Circle {

	private int id;
	private String name;
	public int getId() {
		return id;
	}

	public Circle(int id, String name) {
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Circle [id=" + id + ", name=" + name + "]";
	}

}
