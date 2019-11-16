package com.class17_Create_Class_and_Object;

import java.util.Objects;

public class Car { // silme ve degistirme baska classla baglantili

// 		burda main method yok cunku o da bir class
	
// dikkat 
// 		 car class icinde make model color olusturduk car_object classda bunlari cagirdik
	
//	Class nedir?
		
//		Everything in Java is associated with classes and objects, 
//		along with its attributes and methods. 
	
//		For example: in real life, a car is an object.
//		The car has attributes, such as weight and color, and methods, such as drive and brake.
	
//		A Class is like an object constructor, or a "blueprint" for creating objects.
//		
//		A class is a user defined blueprint or prototype from which objects are created. 
	
//		It represents the set of properties or methods that are common to all objects of one type
		
//		behavior is a method &&  attributes are variables
	
//		templete  bakarak baska objectler olusturabiliyorsun
	
//		to print out stuff you must have the main method 
//		and knows where to start which is main method...

// 		variable and methods defined in the class.
	
// 1.	//define arrtibutes/features // burda variables kullaniyoruz
		
	
		String make, model,color;  // car class i define attik
		
		int year,wheels,windows;
		
// 2. 	adding behavior / action ---> methods(); // burda behaviors veriyoruz
		
		// this is one behavior 
		void drive() {  
			
			System.out.println("Car " +make +" can drive"); // obur tarafta car1.drive();
												//	deyince bu orda yaziyor
			// body 
		}
		
		// another behavior
		void start() {
			
			System.out.println("Car " +make +" can start");
			
		}
		
		//print yazsanda bur sayfada print olmaz cunku main method yok
		
	}


