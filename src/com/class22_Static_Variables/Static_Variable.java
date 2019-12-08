package com.class22_Static_Variables;

public class Static_Variable {
	
	// variable veya methoda stattic dersen static olur demezsen instance olarak kabul edilir.
	
	// inside the class but outside method none of the copy is given to 
	
	// CEO ornegi guzel, sirkette CEO ayni calisanlar degisse, slaryleri degisse o degismiyor.
	
	// main methodun icinde yeniden assign edersen ondan sonrakilerin hepsin de degisir.
	
	// ayni classtaysan sadece variable ismini kullanabilirsin. baska classtan cagiracaksan class ismini de yazman lazim
	
	// static methodda var
	
	String name;   // instance variable bunlar
	String lastName;
	
	
	static int eyes = 2;
	static int nose= 1;
	static boolean brain=true;
	

	public static void main(String[] args) {
		
		Static_Variable obj = new Static_Variable ();
			
		obj.name = "Ali";
		
		obj.lastName = "Deli";
		
		System.out.println("Printing static variables"); // Printing static variables
		
		System.out.println(Static_Variable.eyes); // 2 gelir // class ismiyle cgiranilirisin
		
		System.out.println(brain); // true gelir // sadece ismiyle de cagirabilirsin ya da classla ustteki gibi
		
		
			
		obj.name = "veli"; 
		System.out.println(obj.name); // veli
			
			
		Static_Variable obj2 = new Static_Variable ();
			
		System.out.println(obj2.name); // null gelir assign edilmedi cunku ilk instance variabla gider yeni objede cagirinca
	
	}

}
