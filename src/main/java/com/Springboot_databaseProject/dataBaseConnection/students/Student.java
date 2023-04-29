package com.Springboot_databaseProject.dataBaseConnection.students;

public class Student {

	private int id;

	private String name;

	private float Perctage;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float Perctage) {
		super();
		this.id = id;
		this.name = name;
		this.Perctage = Perctage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Perctage=" + Perctage + "]";
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

	public float getPerctage() {
		return Perctage;
	}

	public void setPerc(float Perctage) {
		this.Perctage = Perctage;
	}

}
