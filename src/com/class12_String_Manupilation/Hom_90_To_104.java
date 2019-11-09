package com.class12_String_Manupilation;

import java.util.Scanner;

public class Hom_90_To_104 {

	public static void main(String[] args) {
		
		
//	90 	Create a String named "name" and assign the value "Timmy" to it. 
//		Find out how many characters are there in the given String. 
		
//		String name = "Timmy";
//		  
//		System.out.println(name.length()); // 5
		 
///////////////////////////////////////////
		 
// 91 	Create a String named s1 = "hello"  check weather string is empty or not
//		 Create a String named s2 = ""  check weather string is empty or not
		
//		  String s1 = "hello"; // false
//		 
//		  System.out.println(s1.isEmpty());
//		  
//		  String s2 = ("");
//		  
//		  System.out.println(s2.isEmpty()); //true
		  
/////////////////////////////////////////////
		  
// 92	Create first String named str1= syntaxsolutions and convert into SYNTAXSOLUTIONS 
//		Create first String named str2=  SYNTAXSOLUTIONS and convert into syntaxsolutions

//		  String str1 = "syntaxsolutions";
//		  
//		  System.out.println (str1.toUpperCase()); // SYNTAXSOLUTIONS 
//		  
//		  String str2 = "SYNTAXSOLUTIONS";
//		  
//		  System.out.println (str2.toLowerCase()); // syntaxsolutions
		
///////////////////////////////////////
		
//  93	Validate if the string ends with "u" prints the Boolean value accordingly.
//		Validate if the string ends with "world" prints the Boolean value accordingly.
//		Validate if the string ends with "are" prints the Boolean value accordingly.
//		Validate if the string ends with "you" prints the Boolean value accordingly.

//		String s1="hello how are you"; 
//		   
//		System.out.println(s1.endsWith("u" )); //true
//		   
//		System.out.println(s1.endsWith("world" )); //false
//		   
//		System.out.println(s1.endsWith("are" )); //false
//		   
//		System.out.println(s1.endsWith("you" )); // true
		
//////////////////////////////////////////
		
// 	94 	Print out the position of the first occurrence of "c".
//		Print out the position of the first occurrence of " ".
//		Print out the position of the first occurrence of the variable target1.
//		Print out the position of the first occurrence of the variable target2.
//
//		Note: the output should be one per line. 
		
//		String str = "abracadabra alakazam";
//		
//	    String target1 = "dab";
//	    
//	    String target2 = "ABRA";
//	    
//	    System.out.println(str.indexOf('c')); // 4
//	    
//	     System.out.println(str.indexOf(' ')); // 11
//	     
//	      System.out.println(str.indexOf(target1)); // 6
//	      
//	       System.out.println(str.indexOf(target2)); // -1
	    
///////////////////////////////////////////
	    
//  95  Output 1: print str starting at index 5 and going till the end.
//	    Output 2:  print str starting at index 7 and ending at index 10.
//	    Output 3: print "harambe". This must not be a new string, must be from str.
//	    Output 4: print "t f". This must not be a new string, must be from str. 
//
//	    Note: all outputs should be one per line
	    
//	    String str = "laptops out for harambe";
//	    
//	    System.out.println(str.substring(5)); // ps out for harambe
//	    
//	     System.out.println(str.substring(7,10)); // _ou // 10 dahil degil
//	     
//	      System.out.println(str.substring(16)); //  harambe
//	      
//	       System.out.println(str.substring(10,13)); // t_f // 13 dahil degil
	       
	       
/////////////////////////////////////////////////
	       
//  96	Print out the character in the 5th index of the String str.
//	    Print out the character in the 8th index of the String str.
//	    Print out the character in the 1st index of the String str.
//	    Print out the character in the 10th index of the String str.
//
//	    Note: all print statements should be on one line. 
	    
//	    String str = "boopity bop";
//	       
//	    System.out.print(str.charAt(5));    // her harfi yanyana yazdir deyince tbop yazdiriyor
//	    
//	     System.out.print(str.charAt(8));
//	       
//	      System.out.print(str.charAt(1));
//	       
//	       System.out.print(str.charAt(10));
	       
/////////////////////////////////////////////////
		
// 	97	
//		Using Scanner class input string value. 
//		Print out the following: "The first 3 letters of ___ is ___"
//
//		For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".

		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Please In:");
//		
//		String a = scan.nextLine();
//		
//		System.out.println("The first 3 letters of " + a + " is " + a.substring(0, 3));

///////////////////////////////////////
		
//  98 
		
//		You have Scanner class to input string value. 
//
//		If language is Java it should print the: 
//		"Java is a programming language".
//
//		If language is C it should print the:
//		"C is a procedural programming language"
//
//		If language is C++ it should print the:
//		"C++ is a middle-level programming language"
//
//		If any other should print:
//		"Doesn't match any programming language"
		
		
//		Scanner scan1 = new Scanner(System.in);
//		
//		String input = scan1.nextLine();
//		
//		String program;
//		
//		switch (input) {
//		
//		case "Java" : 
//			
//			program = "Java is a programming language";
//			break;
//			
//		case "C":
//			
//			program = "C is a procedural programming language";
//			break;
//		
//		case "C++" : 
//			
//			program = "C++ is a middle-level programming language";
//			break;
//			
//		default:
//			
//			program = "Doesn't match any programming language";
//	
//		}
//		System.out.println(program);

// 2nd way
		
//		Scanner as = new Scanner(System.in); 
//		
//		  System.out.println("Enter any programming language");
//		  
//		   String language = as.nextLine(); 
//		   
//		 if(language.equals("Java")) {
	       
//		    	System.out.println("Java is a programming language.");
//		        
//		 	 } else if(language.equals("C")) {
//		        
//				System.out.println("C is a procedural programming language");
//			        
//			 } else if(language.equals("C++")) {
//		        
//		     	System.out.println("C++ is a middle-level programming language");
//		        
//			 } else {
//		        
//		        System.out.println("Doesn't match any programming language");
//			 }
		
////////////////////////////////////////////////////
		
//   99
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your browser");
		String b=scan.nextLine();
		String c=b.toUpperCase(); // burda herseyi byuku yaptik
		switch(c){
		    case "FIREFOX":
		        
		        System.out.println("your browser is "+ c);
		    break;
		        
		    case "CHROME":
		        
		        System.out.println("your browser is "+ c);
		        break;
		case "ie":
		        
		        System.out.println("your browser is "+ c);
		    break;
		        
		    case "SAFARI":
		        
		        System.out.println("your browser is "+ c);
		        break;
		default:
		    System.out.println("invalid");
		}
		
		
//		If browser is ChRoME it should print the: 
//			"Proceed with Chrome browser"
//
//			If browser is FireFOX it should print the: 
//			"Proceed with Firefox browser"
//
//			If browser is IE it should print the:
//			"Proceed with IE browser"
//
//			If any other browser it should print the:  
//			"Invalid browser"
		
		
//		 Scanner sc = new Scanner(System.in); 
//		 
//		  System.out.println("Enter the browser name to proceed further with execution");
//		  
//		   String browser = sc.nextLine();
//		   
//		   if (browser.equalsIgnoreCase("ChRoME")) {
//			   
//				   System.out.println("Proceed with Chrome browser");
//				   
//			   }else if (browser.equalsIgnoreCase("FireFOX")) {
//				   
//				   System.out.println("Proceed with Firefox browser");
//				   
//			   }else if (browser.equalsIgnoreCase("IE")) {
//				   
//					System.out.println("Proceed with IE browser");
//				   
//			   }else {
//				   
//				   System.out.println("Invalid browser");
//				    
//			   }
		   
///////////////////////////////////////////////////
		   
// 	100 
//		   Create a String named "Welcome To Syntax Solutions".
//		   Convert the String into array and using toCharArray method print all values. 
//		   Output should be like 
		
//		   
//		   String str1="Welcome To Syntax Solutions" ;
//		   
//		    char[] ch=str1.toCharArray();
//		    
//		    for(int i=0;i<ch.length;i++){
//		    	
//		    }
//		    System.out.println(ch[i]);
		    
		    
/////////////////////////////////////////////////////
		    
// 	 101 
//		    Create a String with value "hello how are you". 
//		    Step 1: Replace the  "h" with "t".
//		    Step 2: Replace "you" with "hi".
//		    Step 3: Replace  "hello how are you"  with  "i am fine".
//
//		    Print out all three output.
		
		   
//		   String str = "hello how are you";
//		   
//		   System.out.println(str.replace('h','t'));
//		   
//		   System.out.println(str.replace("you","hi"));
//		   
//		   System.out.println(str.replace(str,"i am fine"));
		   
//////////////////////////////////////////////////////
		   
//   102   
//		   The code provided in your main method will take in five Strings
//		   and save them into an array called arr. 
//		   Print out the first three letters of each element of array, one per line.  
//
//		   Note: every element of array is at least 3 letters long. 
		   
		   
//				Scanner input = new Scanner(System.in);
//				
//				String[] arr = new String[5];
//				
//				for (int i=0; i<5; i++) {
//					
//				
//					arr[i] = input.nextLine();
//				}
//	
//		                for (int i=0;i<5;i++) {
//		                  
//		               System.out.println(arr[i].substring(0,3));
//		               
//		        }   
		                
////////////////////////////////////////////////////////
		                
//  103		Inputs:
//		    String word;

//		    Write a for loop that will loop through every character of a word and print out each character, 
//			each on a separate line 
//
//		    Sample inputs/outputs:
//		    	
//		    In: hello
//		    h
//		    e
//		    l
//		    l
//		    o	
		
//		Scanner inp = new Scanner(System.in);
//	    
//	    System.out.print("In:");
//	    
//	    String word = inp.nextLine();
//	  
//	    String str1=word;
//	        
//	       char[] gfg = str1.toCharArray(); // burda arraya cevirdik harflere bolundu
//	            
//	         for (int i = 0; i < gfg.length; i++) {
//	              
//	            System.out.println(gfg[i]);
//	            
//	            }
		    
////////////////////////////////////////////////////////
	         
// 104  Inputs:
//	      String word;
//
//	      Write a for loop that will print out every other letter in a String, starting with the first letter.  
//	      These letters should be printed all on one line with no space in between.
//
//	      Sample input/outputs
//	      
//	      In: hello
//	      hlo
	         
	      Scanner inp = new Scanner(System.in);
	      
	      System.out.print("In:");
	      
	      String word = inp.nextLine();
	      
	      for (int i=0; i<word.length(); i+=2){
	           
	         System.out.print(word.charAt(i));
	      }             
		   
}}
