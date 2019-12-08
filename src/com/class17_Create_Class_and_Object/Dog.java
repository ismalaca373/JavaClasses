package com.class17_Create_Class_and_Object;

public class Dog {  // adini degistirme main asagida

	String name, breed, size, color;
	
	boolean trained;
	
	
	
	void barks() {
		
		System.out.println("When " + name+  " see the bad men, " + name + " barks if he is trained? \nIs he trained? " +trained);
		
	}
	
	void run () {
		
		System.out.println("When I call " + breed + " "+name+ " runs around ");
		
	}
	
////////////////////////////////////////////////
	
	
	public static void main(String[] args) {
		
		Dog Lessi = new Dog();
		
		Lessi.name = "Tony";
		Lessi.breed = "Anadol";
		Lessi.size = "Large";
		Lessi.trained = true;
		
		System.out.println("I have "+Lessi.name+" is a "+Lessi.breed +" "+ Lessi.size);
		
		System.out.println();
		
	
		Lessi.run();
		
		System.out.println();	
		
		Lessi.barks();
		
		
		
	}

}
