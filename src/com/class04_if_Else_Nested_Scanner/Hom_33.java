package com.class04_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Hom_33 {

	public static void main(String[] args) {
		/*submit
		Instructions from your teacher:
		For you to do:
		Write a program that shows if you input a number it will display a month with corresponding number, and if you input a number out of bounds (12) it will display invalid. Display the months to be displayed on my output.

		IMPORTANT: use Scanner Class

		Example:
		1 will display January
		2 will display February
		3 will display March
		4 will display April
		5 will display May
		6 will display June
		7 will display July
		8 will display August
		9 will display September
		10 will display October
		11 will display November
		12 will display December
		ANY INPUT outside of 12 should display in output "Invalid"

		
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a number");
		
		int mN = scan.nextInt();
		
		
		if(mN==1) {
			
		System.out.println("January"); 
			
		}if(mN==2) {
				
		System.out.println("February"); 
				
		}if(mN==3) {
					
		System.out.println("March"); 
		
		}if(mN==4) {
			
			System.out.println("April"); 
			
		}if(mN==5) {
				
			System.out.println("May"); 
							
		}if(mN==6) {
				
			System.out.println("June"); 
			
		}if(mN==7) {
				
			System.out.println("July"); 
			
		}if(mN==8) {
				
			System.out.println("August"); 
				
		}if(mN==9) {
				
			System.out.println("September"); 
							
		}if(mN==10) {
				
			System.out.println("October"); 
					
		}if(mN==11) {
				
			System.out.println("November"); 
					
		}if(mN==12) {
				
			System.out.println("December"); 
			
		}if(mN>12) {
				
			System.out.println("Invalid"); 
				
		}				
		
		}
		}

		
	
	
