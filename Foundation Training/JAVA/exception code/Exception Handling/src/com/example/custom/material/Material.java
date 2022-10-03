package com.example.custom.material;

public class Material {
	
	private int mass;
	private int temperature;
	
	public Material(int mass, int temperature) {
		this.mass = mass;
		this.temperature = temperature;
	}
	
	public String flowOfHeat() {
		
		try {
			this.checkMaterial();
			return "Both in equlibrium";
		}
		catch(MaterialException e) {
			return "Invalid Material";
		}
		catch(Exception e) {
			return "Other Exception";
		}
		
	}
	
	
	private String checkMaterial() throws MaterialException { //we can also write throws Exception i.e. the parent class of MaterialException
		
		if(this.mass<0) {
			//throw exception
			throw new MaterialException("Mass cannot be negative");
		}
		else if(this.mass==0){
			//throw Exception
			throw new MaterialException("Mass cannot be Zero");
		}
		else {
			return "Valid Material";
		}
		
		
	}

}
