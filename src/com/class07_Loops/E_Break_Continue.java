package com.class07_Loops;

import java.util.Scanner;

public class E_Break_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//break and continues can be usef any loop inside if statement.
//
//		for (int i =0; i<10; i++) {
//			
//			if(i==4) {   // cogu zaman if iin icinde kullanilir ve durdurup disari atar
//				break;
//			}
//			System.out.println(i);
//		} 
//		
//		System.out.println("i am out of the loop");
//		
		
/////////////////////
		
		//continue - it will skip current iteration
//		
//		for(int i=1;i<=5;i++) { 
//			
//			if(i==3) {   //printte 3 u atlayacak ve devam edecek
//				
//				continue;
//			}
//			System.out.println(i);
//		}
//		System.out.println("i am out of the loop");
		
//////////////////////
		
		//i want to print nums from 1 to 20 except 5,6,7
		
//	/////////////////////	

		//print numbers from 1 to 50 except those that re divisible by 3
//		
//		for(int i=0; i<=50;i++) {
//		
//	            if(i%2!=0) {
//	            	
//	                continue;
//	            }
//	            System.out.println(i);
//	        }
//		
	//////////////////////////////
		
		// user will apply a credit car for 10 time
		// when you get an yes from user stop asking
		
		Scanner scan = new Scanner (System.in);
		
		
		for (int a = 1; a<=3; a++) {
		
			System.out.println("you need a credit card");
			
			String answer=scan.nextLine();
			
			if (answer.equals("yes")) {
				
				break;
			
			}
			
		
	    }
			
	}
}

