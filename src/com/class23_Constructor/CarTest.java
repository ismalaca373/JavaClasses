package com.class23_Constructor;

public class CarTest { // car la baglantili
	

	public static void main(String[] args) {
		
		Car.make = "Toyota"; // staticlari class adiyla cagiriyoruz
		
		Car car1 = new Car(); 
		
		car1.model = "Camry";  // instance variablelar icin obj create etmen lazim.
		
		car1.color = "Red";  
		
		car1.speed = 200;
		
		car1.doors = 2;
		
		car1.getdetails();
		
		
		Car car2 = new Car(); // digerleri icin obj create etmen lazim.
		
		car2.model = "Corolla";
		
		car2.color = "Blue";
		
		car2.speed = 150;
		
		car2.doors = 4;
		
		car2.getdetails();
		
		/////////////////////
		
		
		
		
		

	}

}
