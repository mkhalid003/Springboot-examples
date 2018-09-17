package com.demo.vo;

public class Employee {

	private String name;
	private String age;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, String age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
}
