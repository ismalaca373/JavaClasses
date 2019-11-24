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
		
		this("Hayat");
		
		System.out.println("I am a constructor 2 parameters");
		
	}
		
	
	
	public static void main(String[] args) {
		
		
		WithConstructor obj = new WithConstructor("Hayat", "Mayat"); // run dersen I am non argument constructor yazar. 
		
// 		can we execute 2 constructors at the same time
//		yes - this() kullanarak. 
		
		// once parantez burda parantez icinde parameters varsa ana bakar yazdirirken onun icindeki blocak bakar 
		// orda this(); gorunce o aman classin parantezi bos olan constructorini bulup yazdirir
	
		
		
		
		
	}

}
