package com.example.custom.cue;

public class CueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cue c = new Cue(20,true);
		Retention r = new Retention(c);
		
		System.out.println(r.playGame(20));

	}

}
