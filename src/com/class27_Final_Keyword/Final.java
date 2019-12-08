package com.class27_Final_Keyword;

public class Final {
	
	
	// final is a non access modifier like static
	
	// Final keyword identifies that no further modification can be 
	
	// can be used for variables, methods, classes

	// used to create constant variables, to prevent method overriding, to prevent Class inheritance
	
	// final variable value can not be changed once it got initialized.
		
	// final methods cannot be overriden on subclass Compile error verir
	
	// final methods overload olur. inheritance icinde olmadigindan, ayni classta oldugundan

	// final class yaparsan sub class almaz ve extend de yani inheritance de yapmaz // compiler error verir
	
	// access modifier can not access returnType name(){}
	
	

	public static final String str = "Hello"; 
	
	
	
	public static void main (String[] args) {
		
		String str = "ali";
	
		final String str1 = "Java is easy";
	
		final int age = 120;
		
	//	age = 100; // compiler error verir. cunku yukarda final
		
		

	}

}
