package com.class25_Polymorphism_Overloading_Compile;

public class ConstrucotOverOverloading {
	
	ConstrucotOverOverloading(){ // diff amount od parameters
		
		System.out.println("I am non-argument constructor");
	}

	ConstrucotOverOverloading(String str){
		
		System.out.println("I am constructor with 1 string param constructor");
	}
	
	ConstrucotOverOverloading(int num){
		
		System.out.println("I am constructor with 1 int param constructor");
	}



	public static void main(String[] args) { 
		
		
		ConstrucotOverOverloading a = new ConstrucotOverOverloading();
		
		ConstrucotOverOverloading a1 = new ConstrucotOverOverloading("a");
		
		ConstrucotOverOverloading a2 = new ConstrucotOverOverloading(3);
		
		
	}

}
