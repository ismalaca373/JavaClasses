package com.class04_if_Else_Nested_Scanner;

public class A_Nested_if {

	public static void main(String[]args) {
		
		

		/*
		 * if staement inside another if statement
		 * 
		 * if (boolean expression)    sadece bu dogruysa asagidaki if calistiracak
		 * 
		 * 		system.out.println("hello");
		 * 
		 * 		if boolen expression)	{                        bu yukaridaki if e bagli calisiyor
		 * 			system.out.println("helo my firends");
		 * 
		 * }else{
		 * 
		 * }
		 * 
		 * }
		 * 
		 */
		
		boolean b = true; // false yaz dene
		boolean classToday = true;   /// false yaz dene

		if (b) {                            //burda b true ise alttaki if calisiyor false ise  else gidiyor.

			System.out.println("Hello");

			if (classToday) {

				System.out.println("Hello my friends");   // istedigin kadar if icinde if kullanisin ama 2-3 den sonra ortalik karisir onagore

			}
		} else {

			System.out.println("bye");
		

		}
		
		
		System.out.println("*************");
	
		
		boolean isFriday=true;  // false yaz dene
		
		int day = 13;  //farkli tarih ver dene
		
		//if today is friday only day I want to check if it is 13
		
		if (isFriday) {

			System.out.println("Today is Friday");

			if (day == 13) {

				System.out.println("i will go whach scary movie");
			}else {
				
				System.out.println("i will go watch comedy ");
			}

		} else {

			System.out.println("today is Not friday");

		}
		
		System.out.println("*************");
		
		
		
	}
	
	
}
