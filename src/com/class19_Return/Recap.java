package com.class19_Return;

public class Recap {
	
	void sum(int num1, int num2) {
		
		int c =num1+num2;
		
		System.out.println(("The sum of 2 number is = " + c));  // bunu demesende code calsisir ama printed olmaz
	}
	
	/////////////////
	
	
	void sayHello(int times) {
		
		for (int i = 0; i< times; i++) {
			
			System.out.println("Hello"); // 2 defa yazar
		}
	}
	
	/////////////////////
	
	//create method to say something and number of times
	
	void saySomething(String word,int times) {  
	
		for (int i = 0; i< times; i++) {
		
			System.out.println(word); // 
		}
	}
	
	/////////////// burdan asagisi main method/////////////////
	
	public static void main(String[] args) {
		
		Recap obj = new Recap(); 
		
		obj.sum(10, 30);  //The sum of 2 number is = 40
		
		obj.sayHello(2); // Hello
					     // Hello
		
		obj.saySomething("Java", 3); // 3 u once yazamassin sirayi takip etmelisin
		
						//Java
						//Java
						//Java
	}

}
