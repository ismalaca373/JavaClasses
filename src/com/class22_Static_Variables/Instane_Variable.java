package com.class22_Static_Variables;

public class Instane_Variable {
	
//	vairbale declare inside the class but outside of any method
	
//	instande variable a sadece objectin icinde ulasabilrisin staticse ulasirsin

//	bunlarin icinde name ve last name istedigin gibi degistirirsin asagida degismez
	
//	when you create a object variable, you can change it.her yeni object olusturdugunda instance varibale yine ayni olur
	
// instance method da olur.
	
	String name= "Ibrahim"; // buna sadece object icinde ulasabilirsin cunku statik degil
	

	public static void main(String[] args) {
	
		String name = "Burcu";
		System.out.println(name); // burcu gelir cunku bu methoda ait
		
		Instane_Variable obj = new Instane_Variable ();
		
		obj.name = "Ali";
		
		System.out.println(obj.name); // ali gelir yniden assign ettin
		
		obj.name = "veli"; // yeniden assign ettim veli gelir
		
		System.out.println(obj.name);
		
		
		Instane_Variable obj2 = new Instane_Variable ();
		
		System.out.println(obj2.name); // instance variable oldugundan ibrahim geliyor cunku degismedi, bu ikinci objedede ayni 

		
	}

}



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

