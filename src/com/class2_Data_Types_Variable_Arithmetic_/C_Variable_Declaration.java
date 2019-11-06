package com.class2_Data_Types_Variable_Arithmetic_;

public class C_Variable_Declaration {
	public static void main (String []args) {
		
		//1. declaring variable num1 that will hold value of int and assigning value of 123 to it projede hersey belliyken
		
		// assignin/initializing value of 123 to it
		int num1 = 123;
		int num2 = 6767;
		int num3 = 788838;
		char num4= 'A';

		
		// 2.declare variable first then value projede isimler belli ama value belli degil onceden yazmis oluyorsun value belli olunca griiyorsun
		
	
		
		int n1;           // bu sekilde declare ediyorsun sonra
		int n2;
		int n3; 			// 
		
		n1=5;
		n2=7676;			// burda da assigning ediyorsun valueyi
		n3=767;
		
		// 3.declare all variable together and then assign value 2 ile ayni ama bu virgullu versiyonu
		
		int number1, number2, number3;
	
		number1 = 12;
		number2 = 15;
		number3 = 676;
		
		int no1 = 123;
				
		System.out.println(n1);  // eger bir defa yaz dersen sonraki variableleri dikkate almiyor artik
		
		
		boolean var=true;
		System.out.println(var);			// you must put values of specified datatype only
											// values of variable can be change later in the program
											
											// you can use values of other variables to initialize another variable
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain;  // isSnow=false
		isSnow=true;
		
		
		System.out.print(isSnow);
		
		char myVariable;
		myVariable='*';
		
		
		
		int nuum = 10;
		int nuum2 = 20;
		
		int nm;
		int nm1;
		int nm2;
		
		number2=number1;   // boyle bisey de yapabilirisin numbr2 yaz dersen number 1 degerini yaza
		
		System.out.println(number2);
	
		
		nm=10;
		nm1=20;
		nm2=30;
		
		
		System.out.println(nm);
		
		int no4, no2, no3;
		
		no4=001;
		no2=002;
		
		System.out.println(no4+no2);
		
		
		
		// number2=false ; --> complie time error asking to change datatype of variable number2 to boolean
		
		
		
		
		
		
	}
	
	
}
