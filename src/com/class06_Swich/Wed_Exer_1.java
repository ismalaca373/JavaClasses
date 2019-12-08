package com.class06_Swich;

public class Wed_Exer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program that will use a switch statement 
		//to display what month we're in.
		
		
		
		int ay = 2;
		
		String month;
		
		switch (ay){
			
		case 1:
			
			month = "Jan";
			break;
		case 2:
			
			month = "Feb";	
			break;
		case 3:
			
			month = "march";	
			break;
			
		default:
			month = "unknown";
			
		}
		
			System.out.println("ay is "+ month);	
	}

}
