package com.class23_Constructor;

public class Constructor {
	
	
	// constractor special method.
			// instance variablleri initialize ediyor
			// is a special method that is used to initialize objects
			// black of code that is being executed when we create an Object/ an Istance of the class.
			// Car car1 = new Car(0) en sondaki  Car() is constructor ve bastaki ile ayni olmalidir.
			// we can create as many as constructors
			// birkac cesidi var. kendin olusturursun, compiler olusturur
			// How can we create a Constructor:
			// 1. it should have exact name as your class name
			//2. it cannot have return type, not even void
			// How constructor is executed: everytime when we creat an object 
			// we call a constructor and entire block code od constructor execudted first
			// why we use it:
//	**** 	   constructor initialize OBJECT
// 	****       
			// parameter alir 
	
	// metodla farklari
	
			// does not have return type, method can ahve any return type
	
			// constructor must be same name with class, method can have any name
	
			// can not use any non access modifieirs (static, final, abstruct olamaz) , method can be static final abstract
	
			// call happens automaticly when object od the class is  created, method must be colled,
	
			// initializes the Object, while method perform some specific functionalities, by using method we describe behavior of object
	
			// constructor has highest prioriy
	
	// methodla benzerlikleri
	
			// get parameters or not get prameters
			// they can use accesss modifiers
//			
//	Constructor will be called automatically when the object is created.
//	2.Constructor should not return any value even void also. Because basic aim is to place the value in the object.
//	(if we write the return type for the constructor then that constructor will be treated as ordinary method).
//	3.Constructor definitions should not be static. Because constructors will be called each and every time,
//	whenever an object is creating.
//	4.Constructor should not be private provided an object of one class is created in another class 
//	(Constructor can be private provided an object of one class created in the same class). 
//	5.Constructors will not be inherited from one class to another class
//	(Because every class constructor is create for initializing its own data members).
	
	
	
	Constructor(){											// created constructor for this class
		
		System.out.println("this is constructor");  // istedigni yaparsin
		
	}
	
	Constructor(String str){ // parametir da alir icine 
		
		System.out.println("bir tane daha var " + str); // bunu yazdirman icin asagida parameter yazman lazim
	}
	
	Constructor(int num, String str){											// created constructor for this class
		
		System.out.println("this is constructor");  // istedigni yaparsin
		
	}
	
////////////////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		

		Constructor obj = new Constructor(); // yandaki ConstrictoDemo() yukaridaki constructor codu cagisiyor once
		  											//	sonra alttaki normal syso calistitiyor
		
		System.out.println("Code after creating an Object");
		
		obj.hello(); // asagidaki method bu
		
		
		//////////////////////
		
		Constructor obj2 = new Constructor("Parameter"); 

		System.out.println("Parameterli");
		
		///////////////////////
		
		Constructor obj3 = new Constructor(123, "kelimeler"); 

		System.out.println("numaralar var");
	}
	
///////////////////////////////////////////////////////////////////////////
	
	public void hello() {
		
		System.out.println("Hello Class");
		System.out.println("Hello Instructor");
	}
	
	

	
}
