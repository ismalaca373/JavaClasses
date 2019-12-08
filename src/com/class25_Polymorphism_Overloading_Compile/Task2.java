package com.class25_Polymorphism_Overloading_Compile;

public class Task2 {
	
	// 2.
//		Create 1 class with a static method that has 3 overloaded forms. 
//		Then call each overloaded method with specific arguments and observe result.
	//	

		static void ali () {
			
			System.out.println("ali");
			
		}
		
		static void ali(String a) {
			
			System.out.println("veli");
			
		}
		
		static void ali(String a, String b) {
			
			System.out.println("deli");
		}
	
///////////////////////////////////////////////////
		
		
	public static void main(String[] args) {
		
		
		Task2 obj = new Task2();
			
			Task2.ali();
			
			Task2.ali("a");
			
			Task2.ali("c", "e");

	}

}
