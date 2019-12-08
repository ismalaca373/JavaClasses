package com.class30_Interface;
							// starting with uppercase
public interface Drivable {  // class yerine interface yaziyoruz.
	
//	interface is collection of public static final variables and public abstract methods
//	similar to class but bigger concept
//	All methods in an interface are implicitly public and abstract.
//  we can't create object of interface in main method
//  you can have multiple parents. you can achive multipla inheritance.
//	interface cannot be extended by a classs, implement edilir.
//  inheritance baglanti olmali.
//  methods are implicityl public also
//  iki inheritance birbirine baglamaya calisirsan extends kullanmalisin.
//  each interface has different behaviors, just like classes have different behaviors in them as well that’s why you extends from class to class 
//  An interface is a collection of methods that have no implementation 
//	- they are just created, but have no functionality. 
//	An interface is a bit like a class, except you can only declare methods and variables in the interface. 
//	You cannot actually implement the methods.
//	All the data members of interface are implicitly public static final.
//	Interface can not contain instance fields. Interface only contains public static final variables.
//	The java compiler adds public and abstract keywords before the interface method and public, static and 
//	final keywords before data members.
// can not be extende by a class, it is implemented by a class
//	A class can implement more than one interface at a time.A class can extend only one class, 
//	but implement many interfaces.
//	An interface can extend another interface, similarly to the way that a class can extend another class.
	
//	Interface doesn't contain Constructors
//  An interface cannot have access modifiers by default everything is assumed as public
//  Interface has only final static variables.
	
	
	
	
boolean DRIVE_FAST = true; // constant/static variable nameleri capital yaziyoruz bunu bir daha assign edemezsin
	// constant varibal
	
void drive();                   // by default compiler will add public abstract ki before void drive()
 

}

class Cars{
	
	public void stop() {
		
		
		System.out.println("Car stop by pressing beaks");
	}
	
	
}


class Toyota extends Cars implements Drivable{ // multiple parenti oldu.

	@Override
	public void drive() { // protected yazmaya calisirsan compiler izin vermez gorunurlugu reduce edemezsin

		System.out.println("Toyota can drive");
	}
	
}

