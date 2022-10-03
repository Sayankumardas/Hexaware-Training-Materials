package com.example.constructors;

public class PersonMain {

	public static void main(String[] args) {
		
		
		Person person = new Person(1,"James",23);
		System.out.println(person);
		
		Person p1 = new Person();
		Person p2 = new Person(23,2);
		System.out.println(p1+" "+p2);
	}

}
