package com.class17_Create_Class_and_Object;

public class Task {
	
	// slayttaki taskler

	public static void main(String[] args) {
		
		
		Task a = new Task(); //bir defa object create etsen yeterli. 
		
//task 1		
		
		System.out.println("task1");
		
		a.isBigger(1, 2);
		
		
		
//task 2
		
		System.out.println("task2");
		
		a.evenOdd(6);
		
		
		
////////////////////////////////	
		
// task 3 
		
		System.out.println("task");
		
		a.palindrome("runnur");
		
		a.palindrome("ali");
	}
	
//task 1
	
		// take 2 parameters as a number and prints which is larger
	
		void isBigger(int a, int b) {
		
		
		if (a>b) {
			
			System.out.println(a + " is bigger then "+ b);
			
		}else {
			
			
			System.out.println(a + " is smaller then "+ b);
		}
		
	}
// task 2
	
		// take a number prints number is even or odd
	
		void evenOdd (int c) {
		
		
		if (c%2==0) {
			
			System.out.println(c + " is a even number");
			
			
		}else {
			
			System.out.println(c + " is a odd number");
		}
	}
	
	
// task 3 
		
		// create a method that will print whether given string is palindrom or not
		
		 void palindrome(String original) { // polindromda iki wordu karsilastiriyorsun yasdirip ayni mi diye bakiyorsu
			 
		//	 first revers then array then karsilastir
			 
		    String reversed="";
		        
		    for(int i=original.length()-1; i>=0; i--) {
		          reversed =reversed+original.charAt(i); // +k=k+a=ka+k..
		            
		       } System.out.println(reversed);
		        
		      if (original.equals(reversed)) {
		            System.out.println("String is Polindrome");
		        }else {
		            System.out.println("String is NOT Polindrome");
			
		        }}	
			
		
	
}
