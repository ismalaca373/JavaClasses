package com.class17_Create_Class_and_Object;

public class Recap {

	public static void main(String[] args) {
		
		
		String str = "Hello";
		int num = str.length();
		
//		String str = new String("Hello");
		
		
		Computer comp = new Computer(); // Computer classa gidip ordaki methodlari cagirabiliriz.
		
		comp.brand = "Lenova";
		comp.play(); // burda Computer classina gidip play methodunu cagiriyor

	}

}
