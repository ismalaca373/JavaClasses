package com.class22_Static_Variables;

public class Test_Static_Vs_Non_Static { //  Static_Vs_Non_Static ile baglantili

//	how to access static members
//	they can be accessed by className from another class.
	
	
	public static void main(String[] args) {
		
		System.out.println(Static_Vs_Non_Static.school); // static variabla ulasma kendi class ismiyle olur
		
		Static_Vs_Non_Static.getInfo1();   //static methoda ulasma  kendi class ismiyle olur
		
		
		// how to access non static members
		// they can be accessed by creating an Object of class
		
		Static_Vs_Non_Static obj = new Static_Vs_Non_Static();
		
		obj.name= "Iso";
		
		obj.grade = 4; // unstatic varible cagirma boyle
		
		obj.getInfo();  // unstatic method
		
		
		
		
	}

}
