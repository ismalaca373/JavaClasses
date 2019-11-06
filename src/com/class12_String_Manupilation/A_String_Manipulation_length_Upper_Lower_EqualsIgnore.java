package com.class12_String_Manupilation;



public class A_String_Manipulation_length_Upper_Lower_EqualsIgnore {

	public static void main(String[] args) {

//****	//There are two ways to create string objects.
		//1
		//String Literal
		String name="Jhon";
		
		System.out.println(name);
		
		System.out.println("The length of nameis= "+name.length());  // string name.length = index sayisini verir yani 4 
		
////////////////
		
//****	//2
		//Creating String with new key word
		
		String name1=new String("John1");
		
		System.out.println(name1);
		
/////////////////////
		
//****	Stringin uzunlugunu bulma
		/* 
		//	.length() 
//		 *This method returns the length of this string. 
//		 *The length is equal to the number 
//		 *of 16-bit Unicode characters in the string. 
//		 */

		 
//**	
		int name1Len=name1.length();
		System.out.println("The lenght of name1 is= "+name1Len); // sonuc 5 cikar
		
		System.out.println("=================");
		
		
		
//** 
		String Str1 = new String("Welcome Student");
		String Str2 = new String("Tutorials" );
		
		 System.out.print("String Length :" );
		 System.out.println(Str1.length()); // 15 cikar
		 
		 System.out.print("String Length :" );
		 System.out.println(Str2.length()); // 9 cikar
		
////////////////////////		
		
//****   Lowercase yapma	
		
		/*
		 * toLowerCase();
		 * This method converts all of the 
		 * characters in this String to lowercase 	
		 */
		 
		String str1="HelLo woRld";
		
		System.out.println("Before:: "+str1);
		
		str1 = str1.toLowerCase();
		
		System.out.println("After:: "+str1);   // hello world cikar
		
		System.out.println("=================");

//////////////////////////////////

//****		Uppercase yapma
		/*
		 * toUpperCase();
		 * This method converts all of the characters in 
		 * this String to uppercase
		 */

//**
		String str3="Mohammad";
		
		System.out.println("Before: "+str3);
		
		str3=str3.toUpperCase();
		
		System.out.println("After: "+str3); // MOHAMMAD
		
//**
		
		String Str = new String("Welcome on Board");
			 
		System.out.print("Return Value :" );
		
		System.out.println(Str.toUpperCase() ); // WELCOME ON BOARD
		
//////////////////////////////////////		
		
//****
		
//		.equalsIgnoreCase();
		
//		This method does not care for capitalization and compare the
//		content only
		
//		This method compares this String to another String, ignoring case
//		considerations. Two strings are considered equal ignoring case if
//		they are of the same length, and corresponding characters in the
//		two strings are equal ignoring case.
		
//**	
		String str7="HElLo WoRld";
		String str8 = "HelLo WorLD";
		
		System.out.println(str8.equalsIgnoreCase(str7)); //true
		
		
		
		
	}

}
