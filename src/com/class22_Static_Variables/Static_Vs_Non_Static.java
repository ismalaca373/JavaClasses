package com.class22_Static_Variables;

public class Static_Vs_Non_Static {
	
	// template for a students (school,name,grade)
	
	static String school = "Syntax";
	String name;
	char grade;
	

	void getInfo() { // bu instance method ve nonstatic
		
		System.out.println("My name is + " +
								name +
								"and I am going to " +
								school + 
								" and my grade is"+ 
								grade);
	} 													// nonstatic method can access to static school daki gibi
	
	static void getInfo1() { // static method oldu
		
		System.out.println("I am attending classes at "+ school); // buraya yukardaki string name; yazarsan kullanamaz
		
		// you cannot access Non static members with in static methods
		// non static can accsess static
		
	}
	
//////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
		// accessing static members within class 
		// use name for a variable
		// or call method with its name only
		
		System.out.println(school);
		
		getInfo1();
		
		// nonstatic methodu cagirmak icin obj olusturman lazim
		
		Static_Vs_Non_Static a = new Static_Vs_Non_Static();
		
		a.getInfo();
		
		
	}

}
