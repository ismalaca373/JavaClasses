package com.class17_Objective_Oriented;

public class Computer_Object {
	
	// bu Computer classla baglantili silme

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Computer comp1 = new Computer();
		
		comp1.brand = "Apple";
		comp1.memory = 16;
		comp1.screen = 13;
		comp1.color = "white";
		
		comp1.compute();
		
		Computer comp2 = new Computer();
		
		comp2.brand = "HP";
		comp2.screen = 17;
		comp2.color = "white";
		
		comp2.play();
		
		System.out.println("I have a "+comp1.color+" "+ comp1.brand+" "+ comp1.screen);
		
		
		
		
	}

}
