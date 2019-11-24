package com.class21_Variable_Cesitleri;

public class Hom_115 {
	
//115 repl

	void add(int num1, int num2) {
		
		int result1 = num1 + num2;
		
		System.out.println("Addition " + result1);
	
	}
	
	void sub(int num1, int num2) {
		
		int result2 = num1 - num2;
	
		System.out.println("Subtraction " +result2);
	}

	void mult (int num1, int num2) {
		
		int result3 = num1 * num2;
	
		System.out.println("Multiplication " +result3);
	
	}
	
	public static void main(String[] args) {
		
		
		Hom_115 obj = new Hom_115();
		
		obj.add(10, 20);
		obj.mult(15, 2);
		obj.sub(40, 20);
		
		
		
	}

}
