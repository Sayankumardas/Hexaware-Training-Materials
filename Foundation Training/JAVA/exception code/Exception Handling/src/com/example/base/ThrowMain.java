package com.example.base;

public class ThrowMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(isEligible(-2));
		}
		catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
			
		}
	}
	
	private static boolean isEligible(int age) {
		
		if(age<0) {
			throw new ArithmeticException("Age cannot be less than 0");
		}
		else if(age<18) {
			return false;
		}
		else {
			return true;
		}
		
		
	}

}
