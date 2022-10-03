package com.example.basic.access.specifiers;

public class DefaultTesting {
	
	public static void main(String[] args) {
		
		
		Person person = new Person();
		
		System.out.println(person.age); //since it has default visibility
		System.out.println(person.id); //since it has protected visibility
		
	}

}
