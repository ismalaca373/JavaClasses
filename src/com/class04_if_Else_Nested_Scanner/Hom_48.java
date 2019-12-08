package com.class04_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Hom_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Prompt user to input either "M" or "F" as a String "gender" and input any value as int "age". 

You have 2 conditions:
If age is above 25, your inner condition, depending on your gender value, should get either "Woman" or "Man" as an output. 
If age is below 25, your inner condition, depending on your gender value, should get either "Girl" or "Boy" as an output. 

Instruction: after you run your code, start inputing your values without Prompt question to appear. 

Hint: your age should not be equal to 25. 

		 * 
		 * 
		 */
		
		

	
//		
//		 Scanner scan = new Scanner(System.in);
//		 
//		 String gender = scan.next();
//		 
//		 int age = scan.nextInt();
//		 
//		   if( age > 25 ) { // outer if
//		   
//		     if( gender.equals("M")) {
//		    	 
//		               System.out.println("Man");
//		           } else {
//		               System.out.println("Woman");
//		           }
//		   
//		   }else {
//		           if( gender.equals("F"))
//		           {
//		               System.out.println("Boy");
//		           } else {
//		               System.out.println("Girl");
//		           }
//		       }
//		 
		
		
		
		
		
		
		
		
		
		Scanner scan=new Scanner(System.in);
		 String gen;
		 int age;
		  gen=scan.nextLine();
		  age=scan.nextInt();

		 
		 if(gen.equals("F")) {
           if (age>25) {
               System.out.println("Woman");
           }else if (age<25){
               System.out.println("Girl");
           }
           
       }else  {
           if (age>25) {
               System.out.println("Man");
           }else if (age<25){
               System.out.println("Boy");
          }
      }
		 
		 
		 
//		 Scanner scan=new Scanner(System.in);
//		 
//		  String gender=scan.nextLine();
//		 
//		 
//		  int age=scan.nextInt();
//		
//		if (age>25) {
//		
//			if (gender.equals("M")) {
//				   System.out.println("Man");
//				 
//			}else{
//				   System.out.println("Woman");
//			}
//				 
//				   
//		}else  if ( gender.equals("F"))
//				    {
//				   System.out.println("Girl");
//				   
//		 }else  {
//				     System.out.println("Boy");
//				   }
				   
           }}		



