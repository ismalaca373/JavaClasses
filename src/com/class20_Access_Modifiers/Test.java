package com.class20_Access_Modifiers;

public class Test {  // bu access le baglantili

	public static void main(String[] args) {
		
		
		Access.hello(); // public bu heryerden ulasirsin static oldugundan kendi class ismiyle cagirabilirsin 
		 

		System.out.println(Access.language); // public bu heryerden ulasirsin static oldugundan kendi class ismiyle cagirabilirsin 
		
		
		Access.hello1(); // static oldugundan kendi class ismiyle cagirabilirsin 
		Access.hello2(); // static oldugundan kendi class ismiyle cagirabilirsin 
//		Access.hello3(); // bu private ulasmazsin
	}

}
