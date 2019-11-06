package com.class4_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Wednesday_Scanner {

	
	public static void main(String[] args) {    //kisayolu ma+control+space+enter
		
	
		
	
		
		
		//scanner is a class present in java.util package
		//which allows us to take user input
		
		String name;
		
		Scanner keyBInput= new Scanner(System.in);  //  kisayolu command+shift+O as orhan
	
		System.out.println("Enter your name");
		
		boolean isMale = keyBInput.nextBoolean();    // next de diyebilirsin ama bosluktan sonrasini almaz
										     //nextLine dersen herseyi alir
		if (isMale) {
			
			System.out.println("you are a male");
		}else
			System.out.println("tou are not a male");
	
		
		
		
		
		
			
		
		
		
		
		
		
	}
}
