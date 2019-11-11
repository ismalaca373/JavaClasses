package com.class17_Objective_Oriented;

public class Dog {  // adini degistirme

	String name, breed, size, color;
	
	boolean trained;
	
	
	
	void barks() {
		
		System.out.println("When " + name+  " see the bad men " + name + " barks when he is trained? \n" +trained);
		
	}
	
	void run () {
		
		System.out.println("When I call " + breed + " "+name+ " run around ");
		
	}
	
	
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
