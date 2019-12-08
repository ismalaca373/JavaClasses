package com.class04_if_Else_Nested_Scanner;
import java.util.Scanner;

public class Scanner_4 {

	/*credit card var mi yok mu sor
	 * if does not have, offer it
	 * if they have ask them balancce
	 * if balance of the card is larger then 1000 tellthem pay it
	 * if below, they can spend more.
	 * 
	 * 
	 */
	
	
	public static void main(String []args)	{
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you have a cc?");
		
		boolean cc= input.nextBoolean();
		
		if (cc) {
			
			System.out.println("What is the balance on your card?");
			int balance= input.nextInt();
				
				
				
			if (balance>1000) {
				System.out.println("Please pay off your balance");
				
				
			}else { 
				
				System.out.println("You can spend more money");
				
			
			
		}}else {
			
			System.out.println("Would you like to apply for credit card");
		}
		
		
		
		
		
	}
	
}
