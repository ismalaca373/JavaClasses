package com.class19_Return;

public class Method_With_Return_Value {  // AllMethods la calisiyor

	public static void main(String[] args) {
		
//**	// declare a String and if String has more than 10 characters
		// we will say string is large
		// otherwise --> String is small
		
		String str = "Welcome Home";
		
		int num = str.length();
		
		if (num>10) {
			
			System.out.println("it is large"); // it is large
		}else {
			
			System.out.println("it is small");
		}
		
		char ch = str.charAt(4);
		
		System.out.println(ch); 
		
		

		//////////////////////////////
		
		
		
		
	
	// create an object of class of class where method is defined
		
		
		
		Method_With_Return_Value obj1 = new Method_With_Return_Value();
		
// 1.
		
		int sum = obj1.num(60,50);  //bunu 52 dan aldi
		
		System.out.println(sum); // 110
		
		////////////////
		
// 2.
		
		int large = obj1.findLargest(20, 40);
		
		System.out.println("largest number is " + large);
}

/////// burdan sonrasi main in disi ///////////////////////////////////////////////////
	
// 1.
	
	int num (int num1,int num2) {
		
		int c = num1+num2;
			
		return c;	//  curly braket icinde olmali ve en son bu olmali
	}
	
//////////////////////////
	
	
// 2. method to find largest number
	
	int findLargest(int num1, int num2) {  // void iken retun kullnamiyoruz bundan dolayi voidi int yap bastaki
		
		int largest;
		
		if (num1>num2) {
			
			largest =num1;
		}else {
			
			largest=num2;
		}
		return largest;
	}
	
}
		