package com.class22_Variables;

public class Instane_Variable {
	
//	instande variable a sadece objectin icinde ulasabilrisin

//	bunlarin icinde name ve last name istedigin gibi degistirirsin asagida degismez
	
//	vairbale declare indet hthe class but outside of any method
//	
//	when yuo create a object variable, you can change it then, onun olur degisirse instante degistirmez
	
// instance methodda var 
	
	String name= "Ibrahim"; // buna sadece obj icinde ulasabilirsin
	

	public static void main(String[] args) {
	
		
		String name = "Burcu";
		System.out.println(name); // burcu gelir cunku bu methoda ait
		
		Instane_Variable obj = new Instane_Variable ();
		
		obj.name = "Ali";
		
		System.out.println(obj.name);
		
		obj.name = "veli"; // yeni seye assign ettim
		
		System.out.println(obj.name);
		
		
		Instane_Variable obj2 = new Instane_Variable ();
		
		System.out.println(obj2.name); // ibrahim geliyor yenden cunku degismedi bu ikinci objedede ayni onun icin instance

		
	}

}


//
//Local_Variable human1 = new Local_Variable();
//
//human1.name = "John";
//human1.lastName = "Smith";
//
//Local_Variable human2 = new Local_Variable();
//
//human2.name = "Jimmy";
//human2.lastName = "Peynir";
//
//System.out.println(human1.lastname);
//System.out.println(human2.lastname);

