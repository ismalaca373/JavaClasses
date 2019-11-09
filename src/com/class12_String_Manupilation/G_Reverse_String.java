package com.class12_String_Manupilation;

public class G_Reverse_String {

	public static void main(String[] args) {
	
// 1.		// en kolayi
		System.out.println("----StringBuilder______");
		
		String str1 = "Hello";
		
		StringBuilder sg = new StringBuilder(str1);
		
		System.out.println(sg.reverse());
		
// 2. // enkolayi
		
		System.out.println("----StringBuffer______");
		
		StringBuffer s = new StringBuffer(str1);
		
		System.out.println(s.reverse());
		
// 3.	
		//charAt()
		
		System.out.println("----charAt______");
		
		String str = "Hello world";
	     
	       for (int i = str.length() - 1; i >= 0; i--) {
	           System.out.println(str.charAt(i));
		
//  4.	
		//char Array()
		
		//split to array of the string
		//loop decrement --
		//print
	           
	    System.out.println("----charArray______");
	    
		
		String given ="Welcome to the java";
		
		String [] str11 = given.split("\\s");
		
		for (int j=str11.length-1;j>=0;j--) {  // j>=0 olmali 
			
			System.out.println(str11[j]);
		}
		
		
// 5.		
		//substring()
		
		

		
	       }}}
		
	
		
	
	


