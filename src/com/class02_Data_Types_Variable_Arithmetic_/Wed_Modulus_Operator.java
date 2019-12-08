package com.class02_Data_Types_Variable_Arithmetic_;

public class Wed_Modulus_Operator {

	public static void main(String [ ]args) {
		
		float num1 = 12.5f;              // divide yaparken float veya double kullan cunku int whole numaraya yuvarliyor
		float num2 = 3.5f;
		
		float div = num1 / num2;
		
		System .out.println(div);
		
		int number1 = 13;
		int number2 = 2;
		
		int divofIntegers = number1 / number2;
				
		System.out.println(divofIntegers);
		
		double d=12;
		
		System.out.println(d);
		
		//modulus gives remaining of the division: % iki rakamin bolunmesinden artan rakami veriyor
		
		
		int a = 15; // 15 ikiye boldugunde whole numberlari cikariyorsun kalan 1 
		int b = 2;
		
		int remainder = a%b;   //kalan 1 oluyor
		
		System.out.println(remainder);
		
		// any aritmetic operation in Java will follow  rule paranteiez/ division/multiplication, addition/ subtruction asagida
		
		int myNumber = 8+8*2;      // islem sirasina dikkat etmeli diyor 
		int myNumber2 = (8+8)*2;
		
		System.out.println(myNumber);
		System.out.println(myNumber2);
		
		
		
	}
	
	
	
	
}
