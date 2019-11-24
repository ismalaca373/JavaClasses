package com.class20_Access_Modifiers;

public class Test {  // bu access le baglantili

	public static void main(String[] args) {
		
		
		Access.hello(); // public bu heryerden ulasirsin
		 

		System.out.println(Access.language); // public bu heryerden ulasirsin
		
		
		Access.hello1(); // 
		Access.hello2(); //
//		Access.hello3(); // bu private ulasmazsin
	}

}
