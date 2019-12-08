package com.class29_Abstraction;

public class Abstraction {
	
//	Abstraction- isa a process of hiding implementation details and showing only functionality
//  Abstraction is nothing but the process of giving an set of guidelines to the user, who are going to implement these guidelines based on their needs.
//	Data abstraction can be used to provide security for the data from the unauthorized methods.
// 
//	can be achieved 2 ways;
//	
//	1. Abstract Class
	
	// no private access modifier
	
	// we can have static variable and methods.
	
	// Every abstract class participate in inheritance.super classta methodu yaz cubclassta herkes kendine gore implement etsin.
	
	// sub classlar nonabstract olur. ama subclasin cocugu olursa o zaman sub can be abstruct. superde grandparent olur
	
	// abstract class is defined with abstract keyword. this class means incompleted. defined and undifend methods var icinde.
	
	// you can not create object of abstract class. cunku tamamlanmis degil. 
	
	// abstract constracter direct olmuyor dolayli implicitly cubclass objesiyle cagiriyorsun super(); olarak geliyor
	// Vehicle obj = new Bike(); dersen Vehicle super(). constructori otomatik gelir once. 
	
	// class abstract olmali. 
	
	// abstract class altinda un implemented abstract method olur. subclass ta implement edilir
	
	// private olamaz inheritancedan dolayi. does not prticipate to inheritance
	
	// final olmaz cunku abstract zaten %50 incomplete
	
	// abstract method statitc olmaz cunku override olmasi lazim.
	
	// abstract class icinde icinde impelemented method ve absract (unimplement) method olur. body olmaz. ; ile biter.
	
	// abstract is non access modifier. others :static and final
	
	//  child class super clasin methodlarini alip implement eder. concrete classta diyorlar 
	
	// public abstract class Phone { // abstract demen lazim.
			
	//	public abstract void takePictures();  // implemeny body olmaz.
	
	// particial abstraction : icinde implement and unimplement methodlarin olmasi
	
	// Concrete class:
	// A concrete class is a class that has an implementation for all of its methods that were inherited from abstract or implemented via interfaces. 
	// It also does not define any abstract methods of its own.
	// object of concrete class can be created directly.
	// containning fully defined implemented  methods 
	
	// abstract classlar %50 defined edilmis kabul edilir. abstract methodlarin bodysi yok. mainin altinda yazacaksin.
	
	// Phone phone  = new Phone (); dersen CE compile error verir. // Phone phone =new Iphone(); diyebilirsin super classa referans verecrek create edersin.
	
	
	
//	   class Iphone extends Phone{  // class acip extends yaparsan hata verir. uzerine tiklayip unimplment methodlari getire tikla gelsin
//
	
	
//		@Override
//		public void takePictures() {
			
//	
//	2. Interfaces 30 uncu ders
	
}

