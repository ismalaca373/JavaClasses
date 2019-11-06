package com.class4_if_Else_Nested_Scanner;

public class Nested_If_Recap {

	public static void main(String[] args) {
		
		
		/*
		 * verify if button is displayed on the page
		 * if button is displayed then we need to verify text on
		 * if text equal to sign to sign in -> test case pass
		 * otherwise -> wrong text is displayed
		 */
		
		boolean isDisplayed=true;
		String buttonText=	"Sign in";
		
		if (isDisplayed) {
			
			System.out.println("button is dipslayed");
			
			if (buttonText.equals("Sign in")) {
				
				System.out.println("Test case pass");
			}else {
				
				System.out.println("Wrong text is diplayed");
			
			}
			
		}else { 
			System.out.println("Button is not displayed");
			
		}
	
		
	}

}
