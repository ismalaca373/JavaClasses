package com.class29_Abstraction;

public class TaskTest {

	public static void main(String[] args) {

		
//		substract super classi direct cagiramazsin. subclasslari cagirabilirsin.
		
		Task obj = new JavaFile();  
		
		obj.close();
		obj.edit();
		
		obj.open();
		
		System.out.println();
		
		Task obj2 = new WordFile();
		
		obj2.close();
		obj2.edit();
		
		obj2.open();
	} 
}
