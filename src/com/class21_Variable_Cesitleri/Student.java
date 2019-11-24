package com.class21_Variable_Cesitleri;

public class Student{
	
	// local variabllar bulunduklari block of code icinde gorulebilinirler sadece
	
	// asagidakilerin ve schooldaki object ve variabllarin hepsi instance variable
	//methodun icindeki variabl ise locak baska yerde gorup degistiremezsin
	
	
	public String studentName; // bunlar glabol variabla also
							// 
	
	public double GPA;
	
	public static String school; 
	
	// static yaparsan obur tarata iki object olustursan ve 
	// colori print etmek istesen en son hangi objenin colorini yaz dediysen
	// hepsini o colorda print eder.
	// once en osn obj ve color dan yazdirmaya baslamalisin. 
	// islem yukardan asagiya cunku
	
	//yukardakileri printin icinde de kullanabilirsin
	// local variables are declared inside methods,
	//instance variables are declared inside a class but outside methods
	
	public void displaInfo() {
		
	System.out.println(studentName + " attending " + school + " and has GPA of "+ GPA );

	}
	
	public void study(int hours) { //parameterslar also local variable
		
		int localVariable= 4; // sadece burda ulasilabilir method icinde oldugundan
		
		System.out.println(studentName + " studying for "+ hours + " hours");
	}
	
	
	}
	
	
	
}