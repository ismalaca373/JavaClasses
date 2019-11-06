package com.class5_Logical_Operator_Switch_Case;

import java.util.Scanner;

public class D_Logical_And_Scanner_Togetter {

	
	public static void main(String[]args) {
		
		/*
		 * ask user
		 * if age is from 1-3 -> babay
		 * if age frem 3-5 -> toddler
		 * if age 5-12 -> kid
		 * if ager from 12-19 -> 
		 * if age > 20 -> adult
		 * 
		 */
		
		Scanner yas = new Scanner (System.in);
		
		System.out.println("enter your age");
		
		int a = yas.nextInt();
		
		//String human;		// eger sadece bir tane syso out print kullanacaksan alttaki gibi yapabilirsin
		
		if (a>=1 && a<=3) {
			
			System.out.println("baby");
			//human="baby";
			
		}else if(a>=4 && a<=5){
			
			System.out.println("toddler");
			
		}else if (a>=6 && a<=12){
			
			System.out.println("kid");
			
		}else if (a>=13 && a<=19) {
			System.out.println("teenager");
			
		}else{
			
			System.out.println("adult");
		}


	}
}
