package com.class17_Create_Class_and_Object;

public class Car_Object { // bu class car classla beraber calisiyor silme degistirme

	public static void main(String[] args) {		
	
//	class / name = new class(); // create an object in the memory we start building an object
	
	Car    car1 =   new Car(); // asagida objecti tanimliyoruz
	
	// asagidakiler car in attributes/features
	
	car1.make ="Tesla"; // car1. deyince class in icindeki String make, model,color methodlari cikiyor bakarsan
	car1.color = "beyaz";
	car1.year = 2020;
	
	System.out.println();	
	System.out.println("I hava a " +car1.color +" "+ car1.make +" "+ car1.year);
			
	
System.out.println("****************");	
	
	// asagidakiler behaviors

	car1.start(); // obur dosyada ne yazarsak burda cikar System.out.println("car can start");
	car1.drive();
	
///////////////////////////////////////////////		
	
	Car car2 = new Car();
	
	car2.make = "Honda";
	car2.year = 2020;
	car2.color = "Black";
	
	System.out.println("****************");	
	
	car2.start(); // obur dosyada ne yazarsak burda cikar System.out.println("car can start");
	car2.drive();
	
	
////////////////////////////////////////
	
	// hocanin ornegi
	
	//to create an object syntax is
	
		//ClassName variable=new ClassName();
		//Scanner scan=new Scanner(System.in);
		//String str=new String();
	
	
//			Car car1=new Car();
//			car1.make="Tesla";
//			car1.model="S3";
//			car1.color="Black";
//			car1.year=2020;
//			car1.wheels=4;
//			car1.windows=5;
//			car1.speed=200;
//			
//			Car car2=new Car();
//			car2.make="BMW";
//			car2.model="i8";
//			car2.color="Purple";
//			car2.year=2019;
//			car2.wheels=4;
//			car2.windows=6;
//			car2.speed=300;
//			
//			//print features of the car
//			// I have black Tesla
//			System.out.println("I have "+car1.color+" "+car1.make);
//			//I drive bmw 2019
//			System.out.println("I drive "+car2.make+" "+car2.year);
			
	
	
	}

}
