package com.class25_Polymorphism_Overloading_Compile;

public class CanWeOverLoad {
	
	// can we overload a private method? YES
	// can we overload a static method? YES
	// you can overload constructor, method and main method by chaging parametr saysi ve typs
	// execute etmek icin sadece main method (herzamanki) icinde olur. digerleri methoda donmus oluyor
	
	
	private void methodOne() {
		
		System.out.println("I am method one");
	}
	
	private void methodOne(String str) {
		
		System.out.println("I am method one with " + str);
	}

	
	//////// main methodu overload yapamayiz.
	
	public static void main (String str) { // methoda doner ve 44 te yazdir dersin
		
		System.out.println("I am a main method with String argument");
	}
	
	public static void main (String str, String[] args ) {
		
		System.out.println("I am a main method with 2 parametrs");
		
		// can we overload a main method? no methoda doner
		
	}
	
	////////////////////////////////
	
	public static void main(String[] args) { //sadece burda yazidrip cagirabiliriz degisiklik yaptikalrimiz normal methoda dondular
		
		System.out.println("I am a main method with String array");

		
		CanWeOverLoad.main("String"); // static methodlari class + adi ve parameterlariyla cagirabiliriz baska main method icinde
		
		String [] array = {"A", "B"};
		
		main("Hello",array);
	}
}
