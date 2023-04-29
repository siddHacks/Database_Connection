package com.Springboot_databaseProject.dataBaseConnection.students;

public class Student {

	private int id;

	private String name;

	private float perc;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float perc) {
		super();
		this.id = id;
		this.name = name;
		this.perc = perc;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", perc=" + perc + "]";
	}

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

	public float getPerc() {
		return perc;
	}

	public void setPerc(float perc) {
		this.perc = perc;
	}

}
