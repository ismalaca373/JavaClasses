package com.class26_Polymorphism_Overriding_Run_Time;

public class Animal_test extends Animal{

	public static void main(String[] args) {
		
		// creating an object on paretn class
		
		Animal animal = new Animal();
		
		animal.sleep();
		animal.eat();
		
		// creating an object og child class
		
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		
		
		// widening
		double d = 90;
		
		//narrowing 
		
		int i = (int)1.99;

///////////  ONEMLIIIIIIIIIIIIIIIIII   
		
		// cadi hayvan ama her hayvan cedi diyebiliyrosunnuz bunun uygulamasi asagidaki
		
		// non prvitive typecasting
		// widenin -- > creating obj of the class and givin refence to the Parent class
		
		Animal obj = new Cat(); // animal classin parent classin methodlarina acces yapar
		 						// child classta obj olusturup parent classin methodlarina ulasiyorsun
								// ikinci kisim kucuk olan
		//narrowing
		// Animal obj = new Cat(); --> cannot convert from animal to Cat 
					
					// 
		obj.eat();  // Cat class icinde eat emthod olmayinca Animalicindeki eate gider.
		obj.sleep();
//		obj.meow();  compiler error verir method wont be available
		
		
		
	}

}
