package com.class24_Inheritance;

public class Inheritance { // bu sayfayi Parent olarak dusun bu child classlarla irtibatli
	
	// extends is the keyword to make relationship
	
	// Inheritance in java is a mechanism in which one object acquires all the properties and behaviors of parent object.
	// there is a parent and child. Child has all properties of parent and also may have same more
	// you are copying  constructros, methods of the base class and you can also create new methods in your sub class
	// biz parenttan aliriz bazi seyleri ama onlar bizden alamaz.
	// cocuklar birbirinden alamaz
	// multilevel inheritance var oda grandparents gibi yani
	
	// Default variables and methods are avaible to the child class that is defined only with in same package
	// protected variables and methods are avaible to the child classs defines in different package
	// 
	// Whenever we develop any inheritance application first create an object of bottom most derived class
	

//	1. Private members of the superclass are not inherited by the subclass and can only be indirectly accessed.
//	2. Members that have default accessibility in the superclass are also not inherited by subclasses in other packages, 
//	as these members are only accessible by their simple names in subclasses within the same package as the superclass.
//	3. Since constructors and initializer blocks are not members of a class, they are not inherited by a subclass.
//	4. A subclass can extend only one superclass
	
	public static String race = "Asian";
	
	public String hairColor = "Black";
	
	public String eyeColor = "Brown";
	
	
	public void sing() {
		
		System.out.println("I can sing");
	}

}