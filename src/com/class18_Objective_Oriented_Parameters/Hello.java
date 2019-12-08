package com.class18_Objective_Oriented_Parameters;

public class Hello { // main asagida
	
	// method with parameters
	// (String name) is parameter is value pass it to the method.


////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
// method 1	
		Hello obj = new Hello();
		
		obj.sayHello("Asel");//  syahello parantezi icine yazilan herseyi classs disindaki
									// method icindeki parametira koyuyor
		obj.sayHello("Fatih");
		obj.sayHello("ali");
		System.out.println();
		
// method 2	
		obj.sayHelloDifferentLanguage("USA"); // bunlarin methodu asagida
		obj.sayHelloDifferentLanguage("Russia");
		obj.sayHelloDifferentLanguage("Turkey");
	//	obj.sayHelloDifferentLanguage(123); // error verir cunku asagidaki parameterda sadece string dedik
		System.out.println();
		
// method 3	
		obj.sayNameAndAge("Jack", 30); // 
		System.out.println();
		
// method 4
		
		obj.isSnowing(false);
		obj.isSnowing(true);
	}
	
//////////////////////////// burasi main method disi
	// method 1		
	
		void sayHello(String name){
			
			System.out.println("Hello "+ name); // name yukardaki
		}
	
		
	
// method 2	
		
		// create a method that will say hello in different language
		// that will be passed when user calls a method.
		
	void sayHelloDifferentLanguage(String country) {
		
	//	String country = "USA"; // boyle yazabilirsin ya da yukarda void sayHell... icinde parameter olarak yazarsin
		
		
		switch (country.toLowerCase()) { // yazilan herseyi lower case ceviriyor
		
		case "usa":
			
			System.out.println("Helloooooooo");
			
			break;
			
		case "Russia":
			
			System.out.println("Privet");
			
			break;
			
		case "Paraguay":
			
			System.out.println("Hola");
			
			break;	
			
		default:
			
			System.out.println("I do not how to say hello in your language");
			
		}
	}
//////////////////////////////////////
	
// method 3
	
	void sayNameAndAge(String name, int age) {
		
		System.out.println("My name is "+ name +" and I am "+ age+ " years old.");
		
	}

///////////////////////////////////////
	
	// create a method that will check if it snowing
	// if snow --> stay at home, otherwise go for a walk
	
// method 4
	
	void isSnowing(boolean isSnowing) { // method header 
		
		
		if (isSnowing) {
			
			System.out.println("Stay Home");
			
		}else {
			
			System.out.println("Go for a walk");
		}
		
		
	}
	
}
