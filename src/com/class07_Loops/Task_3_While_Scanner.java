package com.class07_Loops;

import java.util.Scanner;

public class Task_3_While_Scanner {

	public static void main (String[]args) {
		
//		asuk user it it is raining or not true false
//		as long as there is rain lets tell user to take an umbrella
//		as long as there is rain you can got o work
		
		// if we dont know number of itetations while loop is best chice for the loop
		
		
		Scanner scan;
	
		boolean isRain;   //true false
		scan=new Scanner(System.in);
;		
		do {
			System.out.println("is it raining?");
			isRain=scan.nextBoolean();
			
			
		}while(!isRain);
		
		System.out.println(("go to the park"));
		
	}
}
