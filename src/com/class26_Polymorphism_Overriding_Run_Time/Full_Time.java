package com.class26_Polymorphism_Overriding_Run_Time;

public class Full_Time extends Employee {
	
	int bonus;
	
	public void getPaid() { // overriding yaptik
		
		System.out.println("Full time Employee gets paid " + salary + " and bonus "+ bonus);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
