package com.example.newapplication.access.specifier;

import com.example.newapplication.App;

public class AppAccess {

	
	public static void main(String[] args) {
		
		
		App app = new App();
		app.display(); //non-static methods -> access through object name
		//app.say();
		
		//static method -> accessed through class name
		App.print();
		
	}

}
