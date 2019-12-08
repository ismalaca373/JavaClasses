package com.class17_Create_Class_and_Object;

public class EvenOrOdd {
	
	
	
	void evenOdd (int number) {
		
		if (number % 2 == 0) {
		
		System.out.println(number + " is even number.");
		
		}else {
		
		System.out.println(number + " is odd number.");
	}
		
	
}
////////////////////////////////////////////
	
	
	
	public static void main(String[]args) {
	
		EvenOrOdd result = new EvenOrOdd ();
	
		result.evenOdd(6); 
	
		
	}
}