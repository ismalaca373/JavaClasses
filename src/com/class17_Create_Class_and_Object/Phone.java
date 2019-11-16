package com.class17_Create_Class_and_Object;

public class Phone { // adini degistirme 

	
		String brand, model,color;  
		
		int year,screen,pixel;
		
		
		void playGames() {
			//method body
			System.out.println("I can play on my "+brand);
		}
		
		void calender() {
			System.out.println("I can check the Calender on my "+model);
		}
		
		void map() {
			System.out.println("I can use the map on "+brand);
		}
		
		
	public static void main(String[] args) {
			
		Phone ph = new Phone();
		
		ph.brand = "Iphone";
		
		ph.model = "x10";
		
		ph.screen = 10;
		
		ph.pixel = 2600;
		
		System.out.println("I have a "+ph.brand+ " model is "
							+ph.model+ " and "+" ph.screen is "
							+ph.screen+ " has "
							+ph.pixel +" pixel");
		
		
		System.out.println("******************");
		
		
		ph.playGames();
		ph.map();
		ph.calender();
			
		
			
		}
		

}
