package com.example.basic.data.types;

public class DataTypeMain {
	
	public static void main(String[] args) {
		
		/*
		 * Wrapper Class
		 * */
		
		Integer i = new Integer(10);
		Integer j = 10;
		i=null;
		System.out.println(i+" "+j);
		
		
		/*
		 * Normal data
		 * */
		int a = 20;
		int b = 30;
		//a=null; -> throw error
		
		int c = j; //auto-boxing
		
		System.out.println(a+" "+b+" "+c);
		
		
		Integer k = c; //auto-boxing
		System.out.println(k);
		
		
		
		//Non-Primitive
		String s = "Hello I am Non-Primitive";
		
		Person p = new Person();
		
		System.out.println(s+" "+p.personName+" "+p.PERSON_AGE);
	}

}
