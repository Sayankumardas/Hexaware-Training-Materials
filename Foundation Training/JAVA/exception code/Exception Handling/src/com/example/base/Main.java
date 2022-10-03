package com.example.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,2,3,4,5};
	//	System.out.println(a[5]); -> This will hinder my program execution and I will not be able to execute any instructions after this line
		try {
			Integer b=null;
			int c=b;
			System.out.println(c);
			
			System.out.println(a[5]);
		}
		
		//One-Way
		catch(NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		//Another Way
		
		/*
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}//will not hinder the program execution the try/ catch block will get executed and after that line 17 will also get executed
		*/
		
		//It will execute no-matter what
		finally {
			System.out.println(a[3]);
		}
		

	}

}
