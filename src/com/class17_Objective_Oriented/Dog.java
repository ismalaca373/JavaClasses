package com.class17_Objective_Oriented;

public class Dog {  // adini degistirme

	String name, type, size, color;
	
	boolean trained;
	
	
	void barks() {
		
		System.out.println("when " + name+  " see the bad men " + name + " barks when he is trained? \n" +trained);
		
	}
	
	void run () {
		
		System.out.println("when I call " + type + " "+name+ " run arround ");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Dog Lessi = new Dog();
		
		Lessi.name = "Tony";
		Lessi.type = "Anadol";
		Lessi.size = "Large";
		Lessi.trained = true;
		
		System.out.println("I have "+Lessi.name+" is a "+Lessi.type +" "+ Lessi.size);
		
		System.out.println();
	
		Lessi.run();
		
		System.out.println();	
		
		Lessi.barks();
		
		
		
	}

}
