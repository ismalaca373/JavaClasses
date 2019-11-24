package com.class21_Variable_Cesitleri;

public class Hom_121 {
	
	//
//	Create a method with following specification:
//
//		Return Type: char
//		Method Name: getChar
//		Parameters:
//		String called "word"
//		Integer called "index"
//
//		Then write your logic on getChar method to Find the character in given String at given index number 
//
//		Examples:
//		getChar("hello",1) ==> 'e'
	
	
	static char getChar(String word,int index) {  
		
		char b = word.charAt(index);
		
		return b;
		}	
			
		
	
	
	
		
	public static void main(String[] args) {

		Hom_121 a = new Hom_121();
		
		char b = a.getChar("hello",2);
		
	System.out.println(b);	
			
			
		}
		
	

}


//
//	public static char getChar(String word,int index) 
//	{
//		for(int i =0;i<word.length();i ++) {

//		word.charAt(i);
//	}
//	return word.charAt(index);
//	}
//
//
//	public static void main(String[] args){
//	System.out.println(getChar("hello",1)); //should be 'e'
//	}
//	}