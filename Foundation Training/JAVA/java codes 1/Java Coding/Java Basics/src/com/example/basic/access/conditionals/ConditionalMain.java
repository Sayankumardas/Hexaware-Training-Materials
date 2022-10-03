package com.example.basic.access.conditionals;

public class ConditionalMain {
	
	public static void main(String[] args) {
		
		checkValue(67);
		checkPost("SDE");
		breakAndContinueExample();
		loopsExample();
		
	}
	
	
	private static void checkValue(int num) {
		
		if(num>=0 && num<10)
			System.out.println(num + "is Single Digit");
		else if(num>=10 && num<100)
			System.out.println(num+ " is Double Digit");
		else
			System.out.println("Number entered is either negative or >= 100");
		
	}
	
	
	private static void checkPost(String post) {
		
		
		switch(post) {
		
		case "TL":
			System.out.println("Team Lead");
			break;
		case "SDE1":
		case "SDE2":
		case "SDE3":
			System.out.println("Developer");
			break;
		case "HR":
			System.out.println("HR");
		case "Head HR":
			System.out.println("Head HR");
			break;
		default:
			System.out.println("It will get executed when no case matches");
		
		}
		
	}
	
	
	private static void breakAndContinueExample() {
		
		System.out.println("----------BREAK------------");
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("-------------CONTINUE-----------");
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}
	
	private static void loopsExample() {
		
		
		System.out.println("-----------FOR LOOP------------");
		
		for(int i=1;i<=10;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("---------------WHILE LOOP-----------");
		
		int counter=1;
		
		while(counter<=10) {
			System.out.print(counter+" ");
			counter++;
		}
		
		System.out.println();
		
		System.out.println("-----------DO WHILE LOOP----------");
		
		int flag=9;
		
		do {
			System.out.print(flag+" ");
			flag--;
		}while(flag>10);
		
		
	}

}
