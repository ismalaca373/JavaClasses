package com.class24_Inheritance;

public class Inheritance { // bu sayfayi Parent olarak dusun bu child classlarla irtibatli
	
	// extends is the keyword to make relationship
	// idea behind of that 
	// there is a parent and child. Child has all properties of parent and also may have same more
	// Inheritance is one of the key features of object-oriented programming (OOP)
	// you are copying  constructros, methods of the base class and you can also create new methods in your sub class
	// biz parenttan aliriz bazi seyleri ama onlar bizden alamaz.
	// cocuklar birbirinden alamaz
	// multilevel inheritance var oda grandparents gibi yani
	
	
	public static String race = "Asian";
	
	public String hairColor = "Black";
	
	public String eyeColor = "Brown";
	
	
	public void sing() {
		
		System.out.println("I can sing");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class cocuk { // ayni pakette iki class olusturabiliyorsun
	
	public static void main(String[] args) {
		
		
		
	}
	
}
