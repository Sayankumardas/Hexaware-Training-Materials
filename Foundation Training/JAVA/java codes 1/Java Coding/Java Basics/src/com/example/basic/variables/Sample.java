package com.example.basic.variables;

/*
 * Inside static we cannot call non-static directly and vice versa
 * 
 * */

public class Sample {

	private String name = "James"; // instance variable
	private int sampleAge = 25;
	private final int DAYS_IN_YEAR = 365;

	private static int id = 10; // class/static variable

	private void hello() {
		int sample_id = id + 100; // local-variable

		System.out.println("Hello " + this.name + " your id is : " + sample_id);
	}

	public void display_normal() {
		
		System.out.println("Display Normal");

		Sample smp = new Sample(); // reference variable

		smp.hello();

		System.out.println(smp.name);

		System.out.println(Sample.id); // since id is static it can be access through class name
	}

	public static void display_static() {
		
		System.out.println("Display Static");

		Sample smp = new Sample(); // reference variable

		smp.hello();

		System.out.println(smp.name);

		System.out.println(id); // since id is static and method is also static we can directly call it
	}

	public static void main(String[] args) {

		Sample reference = new Sample(); 
		reference.display_normal();
		
		
		System.out.println("Inside main method Id "+id);
		System.out.println("Inside main Method Name "+reference.name); //inside static method I cannot call non-static varibales directly

		display_static();
		
		for(int i=0;i<10;i++) {
			
		}
		
	//	reference.DAYS_IN_YEAR = 366; -> throw error

	}

}
