package com.example.definition.interpreter.jit;

import java.util.Scanner;

public class Addition {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(add(a,b));
		System.out.println(add(2,5));
		System.out.println(add(6,7));
		System.out.println(add(12,34));
		System.out.println(add(89,45));
		System.out.println(add(123,345));
		
		
		
		
		int c = input.nextInt();
		System.out.println(c);
		
		input.close();
		
		
	}
	
	private static int add(int a ,int b) {
		return a+b;
	}

}
