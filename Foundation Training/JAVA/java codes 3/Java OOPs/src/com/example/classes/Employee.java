package com.example.classes;


public class Employee {
	
	private String name;
	private int id;
	private double salary;
	
	
	
	
	/**
	 * @param bonus -> bonus received
	 * @return -> total salary after adding bonus
	 */
	public double getSalary(int bonus) {
		return bonus+this.salary;
	}
	

}
