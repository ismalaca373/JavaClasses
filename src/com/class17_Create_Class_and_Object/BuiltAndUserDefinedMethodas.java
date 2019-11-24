package com.class17_Create_Class_and_Object;

import java.util.Scanner;

public class BuiltAndUserDefinedMethodas {
	

	public static void main (String[] args) {
		
		
		// built in  // sistemin parcasi syso.print gibi

		String str = "Hello";
		str=str.replace("Hello", "Hi");
		
		System.out.println(str);
		
		////////////////////////////
		
		BuiltAndUserDefinedMethodas obj = new BuiltAndUserDefinedMethodas();
		
		obj.myMethod();

		
		}
	// main method un disinda kaldigi icin calisir
	
		void myMethod() {   
		
			System.out.println("This is user defined method that I created");
}
}
