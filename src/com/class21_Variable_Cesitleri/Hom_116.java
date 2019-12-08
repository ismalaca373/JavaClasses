package com.class21_Variable_Cesitleri;

import com.class19_Return.AllMethods;

public class Hom_116 {
	
//	 Write a method on line two with the following specs:
//
//		 Returns: a boolean
//		 Method Name: beTrue
//		 Parameters: none
//		 Print: true
//
//		 Please write code under line #2
//
//		 Output:
//		 true

	public static void main(String[] args) {
		
	
	Hom_116 obj = new Hom_116();
	
	
	boolean odd = obj.evenOdd(300); 
	
	System.out.println(odd);
	
	}
	
	
	boolean evenOdd (int number) {

		boolean isOdd;

		if (number % 2 == 0) {

			isOdd = true;

		}else {

			isOdd = false;

		}
		return isOdd;
	}	
	
}

//public static void main(String [] args){
//	System.out.println(beTrue()); 
//}
//	public static boolean beTrue(){
//		return true;
//	}
//}