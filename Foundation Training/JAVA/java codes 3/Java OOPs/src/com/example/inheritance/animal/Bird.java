package com.example.inheritance.animal;

public class Bird extends Animal {
	
	/*
	 * Fields
	 * */
	private int sizeOfWings;
	private int flightTime;
	
	/*
	 * Constructors
	 * */
	public Bird() {
		super();
	}
	
	//when we write parameterized constructor we need to writes fields of parent class also
	
	public Bird(String name, int noOfLegs, String eats,int sizeofWings, int flightTime) {
		
		super(name, noOfLegs, eats);
		this.sizeOfWings = sizeofWings;
		this.flightTime = flightTime;
	}
	
	
	/*
	 * Getters And Setters
	 * */
	public int getSizeOfWings() {
		return sizeOfWings;
	}

	public void setSizeOfWings(int sizeOfWings) {
		this.sizeOfWings = sizeOfWings;
	}

	public int getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(int flightTime) {
		this.flightTime = flightTime;
	}
	
	
	/*Override Methods -> Runtime Polymorphism*/
	
	@Override
	public boolean layEggs() {
		return true;
	}
	
	@Override
	public boolean hasWings() {
		System.out.println("Parent Class -> Super -> "+super.hasWings());
		return true;
	}
	
	//On static methods I cannot use @Override -> method hiding
	public static int getExtinctAnimals() {
		return 10;
	}
	

}
