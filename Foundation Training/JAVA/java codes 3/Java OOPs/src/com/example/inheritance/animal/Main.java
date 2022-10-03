package com.example.inheritance.animal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal("ABC",4,"XYZ");
		Bird b = new Bird("Parrot",2, "Inscects", 12, 15);
		System.out.println(a.hasWings()+" "+b.hasWings());
		System.out.println(Bird.getExtinctAnimals()+" "+Animal.getExtinctAnimals());
		
		
		//Polymorphism example
		Bird b1 = new Bird();
		Animal a1 = new Bird(); // I can instantiate a child class through parent class
		System.out.println(b1.hasWings()+" "+a1.hasWings());
//		Bird b2 = new Animal(); //I cannot instantiate my parent class through child class
		
		
		System.out.println(sum(1));
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));

	}
	
	//We cannot overload a method that differs only by static keyword
/*	public int sum(int a) {
		return 0;
	}
*/	
	//We can overload static methods
	public static int sum(int a) {
		return a;
	}
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	//We can over-load our main method -> but it wont get executed
	public static void main() {
		System.out.println("Hello");
	}

}
