package com.class04_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//2.soru
		
		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver licence to them, otherwise you will
		 * offer them to get a learners permit.
		 * 
		 */
		

				Scanner age = new Scanner(System.in);
				
				System.out.println("What is your age?");
				
				int n = age.nextInt();
				
				if (n>=18) {
					
					System.out.println("you are elligible");
				}else {
					
					System.out.println("buyu de gel");
	}

}
}

