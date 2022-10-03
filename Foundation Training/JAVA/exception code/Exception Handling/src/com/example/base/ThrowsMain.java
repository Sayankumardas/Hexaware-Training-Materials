package com.example.base;

import java.io.IOException;

public class ThrowsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			hello();
		}
		catch( NullPointerException | ArrayIndexOutOfBoundsException | IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void hello() throws NullPointerException, ArrayIndexOutOfBoundsException, IOException {
		
		
		Integer a=null;
		int b=a;
		System.out.println(b);
		
		int[] c = {1,2,3,4,5};
		System.out.println(c[5]);
		
	}

}
