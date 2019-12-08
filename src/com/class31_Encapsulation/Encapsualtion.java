package com.class31_Encapsulation;

public class Encapsualtion {
	
// Encapsulation is for wrapping the data (variables) and code acting on the data (methods) together as a single unit.
// Combining of state and behavior in a single container is known as encapsulation. 
	
// In encapsulation, the variables of a class will be hidden from other classes and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.
// The main advantage of using of encapsulation is to secure the data from other methods, when we make a data private then these data only use within the class, but these data not accessible outside the class.	
	
// Encapsulation is achieved in java in class concept.
// A class can have total control over what is stored in its fields.
	
// To achieve encapsulation in Java
//	1. Declare the variables of a class as private.
//	2. Provide public setter and getter methods to modify and view the variables values.
	
	
//	Encapsulaton  - process of wrapping variable and method in a single unit (Class)
//	Best example of Encapsulation is a class
//	To create a tighlty encapsulated class we need
//	1. create a private data memebers (variables)
//	2. create public methods to access those variables (getters and setter)

	
class Employee { 
 
		private String name;    // private kesinlikle 
		
		public String getName() {   // getter ile return yapiyoruz.
			
			return name;          
		}
		
		public void setName(String name){ // setter ile cagirttiriyoruz.
			
			this.name=name;     // this burda super this gibi hareket eder
			
			}
		} 
	
	
 class Demo { // 
		
//		public static void main(String[] args) {
//			
//			Employee e=new Employee(); 
//			
//			e.setName("Harry");             
//			
//			System.out.println(e.getName());        
			
		} } 

