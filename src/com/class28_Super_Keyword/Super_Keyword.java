package com.class28_Super_Keyword;

/////////////   Parent class    ////////////////

public class Super_Keyword {
	
	// Super keyword is used to refer immediate parent class
	
	//* super. can be used invoke immediate parent class instance variable and  method // same name olmalilar // super.color
	
	//* super() can be used to invoke immediate parent class constructor
	
	//	can be used to refer immediate parent class instance variable.
	//	can be used to invoke immediate parent class method.
	//	can be used to invoke immediate parent class constructor.
	
	// super(); compiler will add by default to make a call to super class sen eklemesende var orda
	
	// using super we create an object of a child class, constructor of a parent class is getting executed with help of super keyword
	
	// super(); her zaman method icinde birinci yazilir. this. ile ayni yerde olamaz. cunku thiste birinci olmali comple error verir
	
	// public class parent{
	
//		Parent(){
//			
//			super(); // compiler adds that code if you do not create your 
//		}
	
//		Parent(String str){
//		this.str=str;
//	}
//	
//		public class child extends parent{
//			child(String str){
//			super(str);.
	

	// This vs Super
	
	// this refers current-class instance as well as static members
	
	// super refers super-class instance as well as static members.
	
	
	
	String make,model;
	
	Super_Keyword(){
		
		System.out.println("I am non argument constructor");
	}
	
	Super_Keyword (String make, String model){
		
		this.make = make;
		this.model = model;
	}

}

/////////////    SUB class 1   ////////////////////////////////////////////

class Tesla extends Super_Keyword {
	
	boolean autopilot;
	
	Tesla(){
		
	//	super();  // deault olarak compiler bunu ekler sen Cartestte Superkeyword classida excute eder.
		
		System.out.println("I am child");
	}
	
	
		// String make, String model,
	Tesla (boolean autopilot){
		
		super("Tesla","S6");  // pareameteli const super const cagirdik
// ****		// Super_Keyword gider ve onun constructorini kullanir.
			//yazmazsan null cikar displaydekilerde
		
		this.autopilot = autopilot;
		System.out.println("parametreli super");
	}
	
	public void display () {		// make from parent, model from parent, autopilot form child 
		
		System.out.println("Car "+ make +" "+ model +" has an autopilot " + autopilot);
	}
	
	
}

