package com.class25_Polymorphism_Overloading_Compile;

public class Programming {
	
public Programming(String string) {
		// TODO Auto-generated constructor stub
	}



//	// 1. Create a class named ‘Programming’.
//	While creating an object of the class, if nothing is passed to it,
//	then the message “I love programming languages” should be printed. 
//	If some String is passed to it, then in place of “programming languages” the value variable should be printed.
//	Example, if we pass “Java”, then “I love Java” should be printed.
//	

//	//3
//	Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
	
	

	public Programming() {
		
		System.out.println("I love programming languages");
		
		}
	
	public void Programming(String a) {
		
		if (a.equals("Java")) {
		
		System.out.println(a);
		
		
	}else {
		
		System.out.println("programming language");
	}
	}
	public static void main(String[] args) {

		
		Programming obj = new Programming();
		
		Programming obj2 = new Programming("Java");
	
	}

}
