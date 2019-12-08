package com.class23_Constructor;

public class Car { //cartestle baglantili
	
	// we want to build make as Toyota cars
	// that will have differetn models and color
	
	public static String make;    //class adiyla cagirilir 
	
	public String model;
	
	public String color;
	
	public int speed;
	
	public int doors;
	
	
	public void getdetails() {
	
			
	System.out.println("My car has "+ doors + " doors" + " its max speed is "+ speed);
		
		
	System.out.println("I build "+color +" " + make + " "+ model);
	
	System.out.println();

	}
}
	
