package com.class22_Variables;

public class Test_Static_Vs_Non_Static {

//	how to access static members
//	they can be accessed by className	
	
	
	public static void main(String[] args) {
		
		System.out.println(Static_Vs_Non_Static.school); // static variabla ulasma
		
		Static_Vs_Non_Static.getInfo1();   //static methoda ulasma 
		
		
		// how to access non static members
		// they can be accessed by creatin an Object of class
		
		Static_Vs_Non_Static obj = new Static_Vs_Non_Static();
		
		obj.name= "Iso";
		
		obj.grade = 4; // unstatic varible cagirma boyle
		
		obj.getInfo();  // unstatic method
		
		
		
		
	}

}
