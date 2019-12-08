package com.class24_This_Keyword;

public class WithConstructor {

	WithConstructor()
	{
		
		System.out.println("I am non argument constructor");
	}
	
	WithConstructor(String str){
		
		this(); // used to call current class constructor  
		
		// this(); yukardaki constructori cagirir
		
		System.out.println("I am constructor with 1 Sting parameter");
		
		// this(); buraya yazarsan yazdirmaz / this is a rule once bunlari yazman lazim yukari
	}
	
		
	WithConstructor(String str, String str1){
		
		this("Hayat"); // bir parametreli constructori cagiriyor once
		
		System.out.println("I am a constructor 2 parameters");
		
	}
		
	
	
	public static void main(String[] args) {
		
		
		WithConstructor obj = new WithConstructor("Hayat", "Mayat"); // run dersen I am non argument constructor yazar. 
		
		// yukarda soyle oluyor 2 paremtreli objeyi create edince
		// iki parametreli const giriyor orda this("Hayat"); gorunce bunun icine giriyor orda this(); gorunce paremtresize giriyor ve sysout yazdiriyor.
		//donuyor this("Hayat"); ve onun sysout yazdiriyor sonra kendine geliyor ve sysout yazdiriyor.
		
		
// 		can we execute 2 constructors at the same time
//		yes - this() kullanarak. 
		
		// once parantez burda parantez icinde parameters varsa ana bakar yazdirirken onun icindeki blocak bakar 
		// orda this(); gorunce o zaman classin parantezi bos olan constructorini bulup yazdirir
		
	}

}

////////////////// constructora return type koymaya calismak

class Const {

	// return typse (void or variable ) koymaya calisirsan ne olur
	// void koyarsan methoda doner contructor
	
	void Const(int a, int b){
		
		System.out.println("Hello");
		
		int c = a+b;
		
	}
	
	
	public static void main(String[] args) {
		
		
		Const obj = new Const();
		
		obj.Const(4, 5);

	}

}

