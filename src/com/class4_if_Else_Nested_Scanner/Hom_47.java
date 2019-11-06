package com.class4_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Hom_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Declare boolean variable isSunny, ask user to input boolean value. 
Declare int temperature and prompt user to input any value. 

Your program should check:
if is it sunny weather or not. 
If the weather is sunny output should be "It is a sunny day, I should go somewhere!"
If it is not sunny output should be "I stay home and practice Java"
If the weather is sunny you want to check the temperature. 
If the temperature is higher than 85 then "I am going to the beach"
otherwise, "I am going to the park"

Instruction: after you run your code, start inputing your values without Prompt question to appear. 

Hint: your temperature value should not be equal to 85. 
		 */
	Scanner scan = new Scanner (System.in);
		
		System.out.println("enter 1");

		boolean isSunny = scan.nextBoolean();
		
		if (isSunny){
			
		  
		  System.out.println("It is a sunny day, I should go somewhere!");
		  
		  System.out.println("enter 2");	//	sorluari print ettirmeden de deger girebiliyorsun variable yaz yeter
		  
		  int temp = scan.nextInt();
		  
		  
		  if (temp>85){
			  
		    System.out.println("I am going to the beach");
		    
		  }else {
		    System.out.println("I am going to the park");
		  }
		}else {
		  
		  System.out.println("I stay home and practice Java");
		} 
		}

		

}