package com.class22_Static_Variables;

public class Accessing_Static_Variable {

	public static void main(String[] args) { // onemli
		
//****		static can NOT access to instance variable ve butun staticlare ulasir
// 			non static can access  all		
		
		
//****		how to access static members
//	 		they can be accessed by className	
		
//			public static void main(String[] args) {
//			
//			System.out.println(Static_Vs_Non_Static.school); // deiger classin adiyla static variable ulasabilirsin.
//			
//			Static_Vs_Non_Static.getInfo1();   //static methoda ulasma diger classtan
//			
//			
//****		 how to access non static members
//			// they can be accessed by creation an Object of class
//			
//			Static_Vs_Non_Static obj = new Static_Vs_Non_Static();
//			
//			obj.name= "Iso"; 
//			
//			obj.grade = 4; // unstatic variable cagirma obj ile olur
//			
//			obj.getInfo();  // unstatic method yine objectle cagirilir.
//			
		////////////////////////
		
		// accessing static members within class 
		// use name for a variable
		// or call method with its name only
				
//		System.out.println(school); // bunlar ornek  Static vs non static classtan
//		getInfo1();
		
		Static_Husky obj = new Static_Husky();
		
		System.out.println(obj.name);  // variable name i static_huskyden cagirdi
		
		System.out.println(Static_Husky.breed); // Static_Husky classtan buna ulasabildim. classin icndekini alir methodun icindekini degil
												// onun icin husky cikiyor/ main methodun icinde degistirmistik.
		
		// bu sayfaya instancelari cagirabilirsin ama assign etmen lazim bir de access modifier onemli
		
		
	}	

}
