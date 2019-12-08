package com.class26_Polymorphism_Overriding_Run_Time;

public class Degree {
	
	
	void getDegree() {
		
		System.out.println("I got a degree");
	}
}

class Undergraduate extends Degree{
	

	void getDegree() {
		
		System.out.println("I am an Undergraduate");
	}
	
	
	
	
}

//class Postgraduate extends Degree() {
//	
//	
//
//	void getDegree() {
//		
//		System.out.println("I am an postgraduate");
//	}
//	
//	
//}
//
