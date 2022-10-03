package com.example.base;

public class TryCatchFinallyMain {
	
	static final int INDEX=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1();
		method2();

	}
	
	
	private static void method1() {
		
		int[] a = new int[] {1,2,3,4,5};
		
		try {
			Integer b=null;
			int c=b;
			System.out.println(c);
			
			System.out.println(a[5]);
		}
		catch(NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This will get executed no matter an exception is caught or not");
		}
		
		
	}
	
	
	private static void method2() {
		
		int[] a = new int[] {1,2,3,4};
		
		try {
			System.out.println(a[INDEX]);
		}
		finally {
			System.out.println("This will get executed no matter an exception is caught or not");
		}
		
		
		
	}

}
