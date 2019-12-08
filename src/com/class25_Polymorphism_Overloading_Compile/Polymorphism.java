package com.class25_Polymorphism_Overloading_Compile;

public class Polymorphism {
	
	// methodlarla ilgili,  overloadingte constructor da oluyor
	
	// opearatorlerde olur
	// with string -- behave as concatenation operator
	// with numbers -- behaves as math operator
	
	
	// kisaca insanin hayatta farkli rollere sahip olmasi. 
	// baba, ogretmen, koca, ogrenci, musteri
	
	
	// 2 types of poly
	
//****	//-1 cesidi overLODIing,  compile Time Polymorphysim/ Static binding/early binding 
	
	// occurs with in one class
	
	// name of the methods is same but parameters are different
	
	// compiler biliyor calistirirken ayni isinden hanigisinin calisacagini parametreler belirliyor hangisi
	
	// method overloading is having same method name within Same Class but diffrent type andnumber of parameters
	
	// method overloading ise iki sekilde oluyor. 1. parametre sayisi farkli oluyor . 2. paremtreler farkli oluyor / data type
	
	// return type can be similar or different
	// ornek birisi void hello(){} sonra bunun ustune void hello(String str){} diye ayni isimde baska parameterli bir tane daha yazarsin
	
	// return typla olmaz. DIKKAT!!!!!!!!!!!!!!!!
	
	// we can overload static method ve private methods 
	
	// in method overLODing method signuture must be different
	
	
// **** // -2 run time polymorphism, method overRIDing, dynamic binding , late binding
	
	// Occurs in TWo classess; super class and sub class yani inheritance is involved.
	
	// name and parameters both are same
	
	// amaca; use the method in the child class which is already present in parent class.
	
	// return type always same.
	
	// method call is decided by JVM in run time.
	
	
	// acces modifier,  retun type, name (parameters) (name ve parameterslarin hepsine signiture deniyor
	
	
	
	public void add(int num1,int num2) {   // overloadingde signuture farkli olmali
										
		System.out.println(num1+num2);
		
	}
	
//	public int add(int num1,int num2) {    // compiler error verir
										// parameterlar farkli olmali
//		return num1+num2;
	
	
	public void add(int num1,int num2,int num3) { // parameterin icindekiler farkli sayida
		
		System.out.println(num1+num2+num3);
	}
	
	public double add(int num1, double num2) {  // iki farkli parameter 
		
		double sum= num1+num2;
		return sum;
	}
	
	public static void main(String[] args) {
		
		Polymorphism obj = new Polymorphism();
		
		obj.add(4, 5);		// same method but different 
		obj.add(3, 8);
		obj.add(3, 2.0);
		
		String str = "Hello";
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(1, 3));
		
	}

}
