package com.class7_increment_for;

import java.util.Scanner;

public class D_Scanner_And_Whole {

	public static void main(String[] args) {
		
		
		//ask user to enter name 5 time
		//output "good afternoon

		Scanner scan = new Scanner (System.in);
		
		int i=1;
		
		
		
		while(i<=5) {			//neyi tekrar etmek istiyorsan while icine kyman lazim
			
		System.out.println("Please enter your name");
		
		String name= scan.nextLine();
		
		System.out.println("Good afternoon "+ name);
		  												// 5 defa sorar condition mach etmezse bunu verir
		i++; //bu herzaman loop icinde olmali
	}
//		
		
		
		
	}
}
