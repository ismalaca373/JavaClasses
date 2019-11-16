package com.class17_Create_Class_and_Object;

public class Repl {  // bu sorularda hepsini ir arada calistiramazsin ona gore
	
// 105 repl
	
	
//		Create a class named 'Main' with String variable 'name' and integer variable 'roll_no'. 
//
//		Creating an object of the class Main and assign value of 2 to roll_no and name as "John"
//	
//		Your program should print the following:
//		Name is John and roll number is 2
	
	
///////////////////////////////////	
	
//	106 repl 
	
//		create a class named 'Main' with specific attributes.
//
//		For you to do:
//
//		Create two objects in which you will be assigning the following values.
//		carColor='Black'
//		carModelYear=2019
//		carName='BMW'
//
//		carColor='White'
//		carModelYear=2018
//		carName='Toyota'
//
//		Car color is Black and car model year is 2019 and car name is BMW
//		Car color is White and car model year is 2018 and car name is Toyota

	
	
//		  String name;
//		  int roll_no;
//		  
//		  public static void main(String[]args){
//		    
//		    Repl a = new Repl();
//		    
//		    a.name = "John";
//		    a.roll_no = 2;
//		    
//		    System.out.println("Name is "+ a.name + " and roll number is "+a.roll_no);

///////////////////////////////////	
	
// 107 repl
	
//		Create a Class Main that should be a template for the DogClass. 
//		In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
//		Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
//
//		The output of the program should be as following:
//	 
//		Husky can bark
//		Husky can run
//		Husky can play
//		Bulldog can bark
//		Bulldog can run
//		Bulldog can play
//		Labrador can bark
//		Labrador can run
//		Labrador can play
		    
//		    String Color,Name;
//		    int ModelYear;
//		    
//		    public static void main (String[]args){
//		      
//		      Repl car = new Repl();
//		      
//		      car.Color = "Black";
//		      car.ModelYear = 2019;
//		      car.Name = "BMW";
//		      
//		      System.out.println("Car color is "+  
//		      car.Color +" and car model year is "+ 
//		      car.ModelYear + " and car name is "+ 
//		      car.Name );
//		      
//		      Repl car2 = new Repl(); 
//		        
//		      car2.Color = "White";
//		      car2.ModelYear = 2018;
//		      car2.Name = "Toyota";
//		      
//		      
//		        
//		      System.out.println("Car color is "+  
//		      car2.Color +" and car model year is "+ 
//		      car2.ModelYear + " and car name is "+ 
//		      car2.Name );
		      
// 108 repl
	    
///////////////////////////////////	
	    
//	    1. create method and name as m1. Inside your method body add print statement as "m1 method implementation"
//	    2. create another method and name as m2. Inside your method body add print statement as "m2 method implementation"
//	    3. Call these two methods in the main method

//	    void m1(){
//	        
//	        System.out.println("m1 method implementation");
//	      }
//	      void m2(){
//	        
//	        System.out.println("m2 method implementation");
//	        
//	      }
//	      
//	      public static void main(String[]args){
//	        
//	        Repl met = new Repl();
//	        
//	         met.m1 ();
//	        
//	         met.m2 ();
	        
///////////////////////////////////	
	         
// 109 repl
	         
//	      For you to do 
//
//	       1. Create method name it as newLine
//	       2. Add print statement inside method body as "newLine method implementation"
//	       3. Call newLine method three times
//
//	        Expected Output:
//	        newLine method implementation
//	        newLine method implementation
//	        newLine method implementation
	         

//	       void newLine(){
//	           
//	         int i =1;
//	          while (i<4){  // bunun yerine asagida 3 defa yazdirabilirsin
//	          
//	        	  System.out.println("newLine method implementation");
//	           i++;
//	         }
//	     }
//	       public static void main(String[]args){
//	         
//	         Repl ln = new Repl();
//	           
//	         ln.newLine(); //3 defa alt alta yazdirabilirsin
//         
//////////////////////////////////////////
	         
// 110 repl
	         
//	         For you to do:
//
//	        	 1. Create a method name as newLine that should have print statement
//	         inside the method body as "newLine method implementation"
//	        	 1. Create a method name as displayLine that should have print statement
//	         inside the method body as "displayLine method implementation"
//	        	 3. Call both methods
//
//	        	 Expected Output:
//	        	 newLine method implementation
//	        	 displayLine method implementation
	       
//		void newLine(){
//        
//			System.out.println("newLine method implementation");
//		}	        
//		void displayLine(){
//    
//			System.out.println("displayLine method implementation");
//		}	
//
//		public static void main(String[]args){
//
//			Repl ln = new Repl();
//
//			ln.newLine();
//			ln.displayLine();
			
// second way
			
//			public static void main(String[] args) {
//			    Repl mm= new Repl();
//			    mm.newLine();
//			    mm.displayLine();
//			  }
//			   void  newLine(){
//			      System.out.println("newLine method implementation");
//			   }
//			    void  displayLine(){
//			      System.out.println("displayLine method implementation");
			   
// 111 repl
//			  For you to do:
//
//			    1. Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"
//			    2. Create another method as syntaxStudents and write the logic for that method in println statement as "Welcome Syntax Students!"
//			    3. Call both methods
//
//			     Expected Output:
//			     Welcome to Syntax Technologies!
//			     Welcome Syntax Students!    
			      
/////////////////////////////////////
	
// 112 repl
	
//	For you to do:
//
//		1. create a method as forLoop and write the logic in the method body to print numbers from 1 to 10
//		2. Call the method in the main method
//
//		Expected Output:
//		1
//		2
//		3
//		4
//		5
//		6
//		7
//		8
//		9
//		10
	
	 void forLoop(){
		    
		    int i=1;
		    
		    while (i<=10){ // for looplada olur
		
		      System.out.println(i);
		      
		      i++;
		    }
		  }

		  public static void main (String[]args){
		    
		    Repl print = new Repl();
		    
		    print.forLoop();
		  }
			
}
		



	
	
		    
	  
		  

		
		

