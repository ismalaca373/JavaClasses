package com.class03_If_else;

public class A_If_Else_Realational_Operators {   //conditional statement if-else

	
	public static void main (String[]args) {
		
		/*
		 * 
		 * If (boolean expression) {
Code of is block
}else{ 
Code of else block
}
Else is optional block

		 */
		int num;
		num = 23;
		num = 90;   // nurda yeni deger vedik. 
		num -= 200; //-110=90-200  
		num -= 110; // -220=-110+-110 // en son cikan sonuctan isleme devam ediyoruz
		num += 220; // 0 = -220+220
		
		if (num > 0) {

			System.out.println(num + "is a positive number");
		} else if (num==0) {
			
			System.out.println("Value of num is " + num);
		}else {

			System.out.println(num + "is a negative number");
		}
		
		
		System.out.println("********************");
		
		int num1=20;
		int num2=19;
		
		
		System.out.println(num1>num2);
		System.out.println("******************");
		
		double d=1.99;
		double d1=2.99;
		
		boolean b= d>d1;
		
		System.out.println(b);
		
		boolean b1= d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1; // != not equel demek
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("********************");
		
		int a= 90;
		int c= 300;
		
		// if number a is bigger then number 2
		// i want to print a is larger then b
		
		if (a>c) {      ///dogruysa execute alttakini
			
			System.out.println("a is larger then c");
			
		} else {   // degilse unu execute diyoruz
			
			System.out.println("a is smaller then c");
			
			
		}
		
		System.out.println("********************");
		
		
		
		
		int expectedHours= 15;
		int actualHours= 20;
		
		//if expected hours are more then actual --> you will succeed
		// otherwise, please study more
		
		if (expectedHours<actualHours) {    // if condition is true print inside if {} if not print else{} icindekini
			
			System.out.println("you will succeed");
			
		}else {
			
			System.out.println("study more");
			
		}
		
		
		System.out.println("****************");
		
		
		
		double teaPrice=4.99;
		double allowPrice=3.99;    // if price is more that i can afford i will noy buy
								  // if price is less or match what i can afford i will buy tea
		
		if(allowPrice>=teaPrice) {   // if (condition) 
			
			System.out.println("I will by tea");  // {} icine istedigin kadar cumle yazabilirsin
			
			System.out.println("I will by");
			
		}else {
			System.out.println("I cant afford");
			
			System.out.println("I wont by ");
		}
		
		System.out.println("buraya da yazabilirsin. if else {} icinde degil ama main icinde yazar");
		
	}
	
}
