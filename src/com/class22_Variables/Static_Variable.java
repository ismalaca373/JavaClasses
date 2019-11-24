package com.class22_Variables;

public class Static_Variable {
	
	// stattic dersen static olur demezsen instance olarak kabul edilir.
	
	// inside the class but outside method none of the copy is given to 
	
	// CEO ornegi guzel, sirkette CEO ayni calisanlar degisse, slaryleri degisse o degismiyor.
	
	// main methodun icinde yeniden assgin edersen ondan sonrakilerin hepsinde o olur.
	
	// ayni clastaysan sadece variable ismini kullanabilirsin.baska classtan cagiracaksan class ismini de yazman lazim
	
	// static methodda var
	
	String name;   // instance bunlar
	String lastName;
	
	
	static int eyes = 2;
	static int nose= 1;
	static boolean brain=true;
	

	public static void main(String[] args) {
		
		Static_Variable obj = new Static_Variable ();
			
		obj.name = "Ali";
		
		obj.lastName = "Deli";
		
		System.out.println("Printing static variables");
		
		System.out.println(Static_Variable.eyes); // class ismiyle cgiranilirisin
		
		System.out.println(Static_Variable.brain);
		
		
			
		obj.name = "veli"; 
			
		System.out.println(obj.name);
			
			
		Static_Variable obj2 = new Static_Variable ();
			
		System.out.println(obj2.name);
	
	}

}
