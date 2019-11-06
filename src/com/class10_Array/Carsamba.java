package com.class10_Array;

import java.util.Scanner;

public class Carsamba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		
//		int[] b = {4,5,7,2,9};
//		
//		int sumB=0;
//		
//		for(int i = 0; i<b.length; i++) {
//			
//			sumB += b[i];
//		}
//			
//			System.out.println(sumB);
//	}
////////////////////////////
//			
//			
//
//	        String[] s = { "dog", "cat", "mouse", "bird", "donkey", "horse" };
//	        
//	        for (int i = 0; i < s.length; i++)
//	        {
//	            System.out.println(s[i]);
//	        }
//
//	        
//////////////////////////////////
		

		    // read the array size from the scanner
		    // create an array of integers
		    // insert values of integers from the scanner
		    // print the sum of all elements
		   
		Scanner scan;
		
        scan = new Scanner(System.in);
        
        System.out.println("How many numbers do you want to enter?");
        int size = scan.nextInt();
        
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number:");
            array[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        System.out.println("The sum is " + sum);
        
        
  //////////////////////////////////////////////////////////////
        
    
        
        
        
        
    }
			
}
	    


