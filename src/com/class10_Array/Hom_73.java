package com.class10_Array;

import java.util.Scanner;

public class Hom_73 {

	public static void main(String[] args) {

		// asagidaki rakamlari olustur ve yanyana yazdir. 45, 78, 12, 67, 55

//		int[] a= new int[5];
//	    
//	    a[0]=45;
//	    a[1]=78;
//	    a[2]=12;
//	    a[3]=67;
//	    a[4]=55;
//	    
//	    int arraySize=a.length;
//	      
//	      System.out.print(a[0]+ " "+ a[1]+ " "+ a[2]+ " "+ a[3]+" "+ a[4]);

///////////////////////////////////////////////

//	      second way
//	      
//	      int[] arr = { 45, 78, 12, 67, 55 };
//
//			for (int i = 0; i < arr.length; i++) {
//
//				System.out.print(arr[i] + " ");
//			}
////	    

//////////////////////////////////////////////

		// 74
//	      For you to do: 
//	    	  Write a program that creates an array of integers that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
//	    	  Print only values that stored with even index including 0.
//
//
//	    	  Output:
////	    	  45 12 55 23 88 
//	      
//		int[] array = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
//
//		System.out.print(array[0] + " " + array[2] + " " + array[4] + " " + array[6] + " " + array[8]);
//		
	//	second way
		
//		int[] arr = {45,78, 12,  67, 55, 89, 23, 77, 88};
//
//		for (int i = 0; i < arr.length; i+=2) {
//
//			System.out.print(arr[i] + " ");
//		}
//    

//////////////////////////////////////////////////	
		
		// 75
		
//		Write a program that creates an array with the following values
//		{s, a, y,  b, n, c, t,  d, a, e, x} and prints the values starting at 
//		index 0 and multiple of 2 using a for loop.
		
		
	//	output= syntax
		
//		
//		String[]arr = {"s", "a", "y",  "b", "n", "c", "t",  "d", "a", "e", "x"};
//		
//		int size = arr.length;
//		
//		for(int i= 0; i<size; i+=2) {  
//			
//			
//			
//			System.out.println(arr[i]);
			
			
//			second way
			
//			char[] array = {'s', 'a', 'y',  'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
//
//			for (int i = 0; i <= array.length-1; i+=2) {
//
//				System.out.print(array[i]);
//	}
//		
/////////////////////////////////////////////		
		
			// 76
			
		
//		Write a program that creates an array of strings with the following values{"This", "is", "array", "of", "strings"} and prints all values in one line.
//
//		Output:
//		This is array of strings
		
		
//		
//		
//			String [] array ={"This", "is", "array", "of", "strings"};
//			
//			
//			for (int i = 0; i <= array.length; i++) {
//				
//				
//				System.out.print(array[i]+ " ");
//			}
//			
			
////////////////////////////////////////////////////////////////
		
		// 77 ????
		
//		Write a program that creates an array of strings with the size being 7. 
//		Ask the user to input Days of a week beginning with Sunday using Scanner class.
//		Add these inputs to your array and then print all values from that array
//
//		Example:
//		Please enter day 1 of the week
//		Sunday
//		Please enter day 2 of the week
//		Monday
//		Please enter day 3 of the week
//		Tuesday
//		Please enter day 4 of the week
//		Wednesday
//		Please enter day 5 of the week
//		Thursday
//		Please enter day 6 of the week
//		Friday
//		Please enter day 7 of the week
//		Saturday
//
//		Hint: you will need 2 for loops but it is not nested loops. 
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Please enter days of a week beginning with Sunday");
//		
//		int size = scan.nextInt();
//		
//		String [] array= new String [size];
//		
//		
		
		   
//	      Scanner scan=new Scanner(System.in);
//	      
//	    String[] day=new String[7];
//	    
//	 for (int d=0; d<=6; d++){
//	   
//	    System.out.println("Please enter day "+(d+1)+" of the week");
//	    
//	    day[d]=scan.nextLine();
//	    }
//	 for (int i=0; i<7; i++){
//	   
//	     System.out.println(day[i]);
//	   
//	   
//	 }

//		
//		
//		Scanner scan;
//		
//        scan = new Scanner(System.in);
//        
//        System.out.println("How many numbers do you want to enter?");
//        int size = scan.nextInt();
//        
//        int[] array = new int[size];
//        
//        for (int i = 0; i < size; i++) {
//            System.out.println("Enter a number:");
//            array[i] = scan.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0; i < size; i++) {
//            sum += array[i];
//        }
//        System.out.println("The sum is " + sum);
//        
/////////////////////////////////////////////
		
//		78
//		Note: Create Scanner class
//
//		Write an array with size of 5. 
//		Use a loop to input values to the array (don't print any prompt message for Scanner).
//		Then print out all the elements you have created in the first loop in reverse order. 
//
//		Example: 
//		Input: 
//		1
//		2
//		3
//		4
//		5
//
//		Output:
//		5
//		4
//		3
//		2
//		1
		
//		 Scanner scan=new Scanner(System.in);
//	        
//	        int[] num=new int[5];
//	                
//	        for(int i=0;i<num.length;i++) {
//	            num[i]=scan.nextInt();
//	            
//	        }
//	        for(int i=num.length-1;i>=0;i--) {
//	            System.out.println(num[i]);
//	        }
//	        
//            
//            
        
        
////////////////////////////////////////////
		
		//79
		
//		Write a program that creates an array of integers of size 11.
//		Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values. 
//
//		Example: 
//		2010
//		2011
//		2012
//		2013
//		2014
//		2015
//		2016
//		2017
//		2018
//		2019
//		2020
		
//		int [] array = {2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020};
//		
//		for(int i = 0; i<array.length; i++){
//			
//			System.out.println(array[i]);
//			
//			
			//2nd way
//		
//			int[] years = new int[11];
//
//			for (int i = 0; i <=years.length-1; i++) {    // bir eksiltiyor
//
//				years[i] = 2010 + i;
//				
//			System.out.println(years[i]);
//				
//			}
	        
//		int[] years = new int[11];
//
//		for (int i = 0; i <=years.length-1; i++) {
//
//			years[i] = 2010 + i;
//		}
//		
//		
//		for (int i = 0; i <years.length; i++) {
//
//			System.out.println(years[i]);
//		}
	       

			
/////////////////////////////////////
		
			 // 81
		
		
//			Write a program that creates an array of integers that stores the following values{45, 78, 12,  67, 55, 89, 23, 77, 88}. 
//			Print the values using a for loop starting at index 1 and increment by 3, and then print value divided by its index.
//
//			Output:
//			78 13 11 
			
			int[] arr = {45, 78, 12, 67, 55, 89, 23, 77, 88};
			
			for (int i = 1; i < 9; i+=3) {
			     
				System.out.print(arr[i]/i + " ");
				
				
				
				
			}
			
		}
		
	}

