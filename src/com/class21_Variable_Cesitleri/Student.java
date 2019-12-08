package com.class21_Variable_Cesitleri;

public class Student{ // schoolla baglantili
	
	
	// local variables are declared inside methods,
	// local variablar bulunduklari block of code icinde gorulebilinirler sadece
	// methodun icindeki variabl ise local baska yerde gorup degistiremezsin
	
	// instance variables are declared inside a class but outside methods
	// asagidaki  variabllarin hepsi instance variable
	
	
	
	public String studentName; // bunlar glabol variable also
							
	public double GPA;
	
	public static String school; 
	
	// static yaparsan obur tarata iki object olustursan ve 
	// colori print etmek istesen en son hangi objenin colorini yaz dediysen
	// hepsini o colorda print eder.
	// once en son obj ve color dan yazdirmaya baslamalisin. 
	// islem yukardan asagiya cunku
	
	//yukardakileri printin icinde de kullanabilirsin
	
	
	public void displaInfo() {
		
	System.out.println(studentName + " attending " + school + " and has GPA of "+ GPA );

	}
	
	public void study(int hours) { //parameterlar also local variable
		
		int localVariable= 4; // sadece burda ulasilabilir method icinde oldugundan
		
		System.out.println(studentName + " studying for "+ hours + " hours");
	}
	
	
	}
	
	
	
