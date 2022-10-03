package com.example.inheritance.animal;

public class Animal {
	
	/*
	 * Fields
	 * */
	private String name;
	private int noOfLegs;
	private String eats;
	
	protected Boolean isMammal=true; //package and child-class
	Boolean isReptile = true; //default -> package
	
	/*
	 * Constructors
	 * */
	public Animal() {
		
	}
	
	public Animal(String name, int noOfLegs, String eats) {
		
		this.name=name;
		this.noOfLegs=noOfLegs;
		this.eats = eats;
		
	}
	
	
	/*
	 * Getters And Setters
	 * */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public Boolean getIsMammal() {
		return isMammal;
	}

	public void setIsMammal(Boolean isMammal) {
		this.isMammal = isMammal;
	}

	public Boolean getIsReptile() {
		return isReptile;
	}

	public void setIsReptile(Boolean isReptile) {
		this.isReptile = isReptile;
	}
	
	
	/*
	 * Extra Methods
	 * */
	
	boolean layEggs() {
		return false;
	}
	
	protected boolean hasWings() {
		return false;
	}
	
	//final methods cannot be overridden
	public final int getAnimalNumbers() {
		return 100000;
	}
	
	public static int getExtinctAnimals() {
		return 2345;
	}
	
	/*Method Overloading-> compile-time-polymorphism*/
	public int getNumber() {
		return 0;
	}
	
	public int getNumber(int num) {
		return num;
	}
	
	public int getNumber(int num1, int num2) {
		return num1+num2;
	}
	
	public void getNumber(float num) {
		System.out.println(num);
	}
	

}
