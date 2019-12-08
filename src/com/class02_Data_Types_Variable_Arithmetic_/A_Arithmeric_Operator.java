package com.class02_Data_Types_Variable_Arithmetic_;

public class A_Arithmeric_Operator {

	public static void main(String [ ]args) {
		
		// assignment operator:  =
		// arithmetic operators: +, -, / *. %   4 islem yaparken bunlari kullaniyoruz
		// % bunu for reminder olarak kullancagiz bolumden kalani veriyor
		
		
		/* declare 2 variables and initialize them
		 * display resultof addition, substraction, multiplication and division
		 * 
		 */
		
		int num1, num2;
		
		num1 = 20;
		num2 = 10;
		
		System.out.println(num1 + " " + num2);   // toplama yapnmadi bak simdi
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
	
		
		///////////////////////////////////////////////////
		
	int sum = num1 + num2;
	int sub = num1 - num2;
	int mult = num1 * num2;
	int div	= num1 / num2;
	
	//the addition of 2 numbers is _________
	
	System.out.println(sum);   // most useful way then yukardaki
	System.out.println(sub);
	System.out.println(mult);
	System.out.println(div);
	
	
	
	
	
	
	
		
	}
	
}
