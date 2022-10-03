package com.example.constructors;

public class Person {
	
	private int id;
	private String name;
	private int age;
	
	//non-parameterized constructor
	public Person() {
		
	}
	
	//parameterized constructor
	public Person(int age,int id) {
		this.age=age;
		this.id=id;
	}
	//parameterized constructor
	public Person(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
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



	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}




	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

}
