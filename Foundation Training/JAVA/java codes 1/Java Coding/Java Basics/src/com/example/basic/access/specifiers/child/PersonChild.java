package com.example.basic.access.specifiers.child;

import com.example.basic.access.specifiers.*;

public class PersonChild extends Person {
	
	 String id = super.id; //id is protected
	 String getId = super.getId(); //getId() is protected method
	
	public static void main(String[] args) {
		
		PersonChild child = new PersonChild();
		System.out.println(child.id);
		
		child.hello();
	
		
	}
	
	public void hello() {
		super.display(); //display() is protected method
	}


}
