package com.class12_String_Manupilation;



public class C_indexOf_Concat_Trim_CharAt_Substring_ {

	public static void main(String[] args) {


//****  String concat(String str)
		
		/* .concat(variable a)
		 * This method appends one String to the end of another. 
		 * The method returns a String with the value of the 
		 * String passed in to the method appended to the end 
		 * of the String used to invoke this method.
		 */
		
//**	
//		String str3="Hello ";
//		String str4="World ";
//		String str5="People";
		
		//first way
		
//		System.out.println(str3+str4+str5);
		
		//second way with concat
		
//		System.out.println(str3.concat(str4).concat(str5));
//		
//		
//		System.out.println("*******************");
		
//****  String trim() 
		
		/* .trim() iki tarafindaki bosluklari altiyor
		 * This method returns a copy of the string, 
		 * with leading and trailing whitespace omitted.
		 */
//**
//		String str6=" How are you? ";
//		System.out.println("Return:"+str6.trim());  // Return:How are you? // : den sonraki boslugu ve sondakini kesti
//		
//		System.out.println("*******************");
		
//****	char charAt(int index):		

		/* .charAt(index number yaz)
		 * This method returns the character located at the String's specified index. 
		 * The string indexes start from zero.
		 */
//**		
//		String str7="We might be done early today";
//		
//		System.out.println(str7.charAt(3));  // 3uncun karakteri getiriyor m // bosluklarda index icinde
//		
//		System.out.println("*******************");
		
//**	
//		 String s = "Strings are immutable";
//		 
//	     char result = s.charAt(8); 
//	       
//	     System.out.println(result);  // a gelir
		
//****   int indexOf(int ch)
		
		/* .indexOf('bisey') harfin index numarasini getiriyor
		 * This method returns the index within this string of the 
		 * first occurrence of the specified character or 
		 * 
		 * if the character does not occur -1 gorulur
		 */
//		String str8="We might not be done early";
//		
//		System.out.println(str8.indexOf('m')); // 3 gelir
//		System.out.println(str8.indexOf('z')); // yoksa karakter yukarda -1 verir. 
		
										// peki yukarda birsuru e var nasil verecek????????????????????????????????
		
		
//**** String substring(int beginIndex)
		
		// .substring(10)  ilk on indexi at diyoruz
		//This method returns a new string that is a substring of this
		//string. 
		//
		
//**
//		String ali = "Welcome to Happy World";
//		
//		System.out.print("Return Value :" ); //Return Value : 
//		
//		System.out.println(ali.substring(10)); // Happy World cika //  indexlerin onunu cikar at diyoruz
		 
		
//****	String substring(int beginIndex, int endIndex)
		
		// iki index numarasi arasi haric at diyoruz 
		// (int beginIndex, int endIndex) 
		//This method returns a new string that is a substring that begins
		//with the character at the specified index and extends to the end of
		//this string 
		// 
		
//		System.out.println("*******************");
		
//**	
//		String Str10 ="Welcome to Happy World";
//		
//		
//		System.out.print("Return Value :" ); //Return Value : Happy World cikar
//		
//		System.out.println(ali.substring(10, 16)); // Return Value : Happy   // 10 ile 16 arasinin disini at dedik

		
//****      array e cevirme
		 // .toCharArray ile cumleyi 
		 // method converts this string into character array.
		
//		Create a String named "Welcome To Syntax Solutions".
//		   Convert the String into array and using toCharArray method print all values. 
//		   Output should be like :
		
		String str1="Welcome To Syntax Solutions" ;
		   
	    char[] ch=str1.toCharArray();
	    
	    for(int i=0;i<ch.length;i++){
	    	
	    	System.out.println(ch[i]);	
	    }
	    	
		
// taski yap		
		
//		Accept username, password and confirm
//		password and check following requirements:
//		1. Username and Password cannot be empty, if
//		so→ message=”Username and Password cannot
//		be empty”.
//		2. Password should be minimum 8 characters, if
//		less → message=”Password is too short”.
//		3. Password cannot contain username if so, →
//		message=”Password cannot contain username”.
//		4. Password should match confirmed password, if
//		not → message=“Passwords do not match”.
//		Only after all requirements met → message
//		“Your username and password has been
//		created
		
	}

}
