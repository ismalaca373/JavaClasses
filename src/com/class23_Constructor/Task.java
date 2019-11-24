package com.class23_Constructor;

public class Task {
	
	// Task 1
	
//	Write a program that will have a constructor: 
//	one with parameters and second without any parameters.
//	Create a separate Test class where you will execute both 
//	of the constructors.
//
	
	Task(){
		
		System.out.println("Task 1");
		
		System.out.println("Parametersiz");
		
	}

	
	Task (String str){
		
		System.out.println("Parameterli " + str);
		
		System.out.println();
	}
	
	
	
	
//	Task 2

//  Write a java program of Class Students that
//	takes students name and 3 subject grades. 
//	Inside your class also have a method to 
//	Calculate Average Grade. Test Student 
//	class for 5 different students.
//	Your program should print an average grade of each students name.
//	NOTE: please use different names for instance and local variables.
	
	public String name;
	public int grade1,grade2,grade3;
	
	Task (String studentName, int gr1, int gr2, int gr3){
		
		
		name = studentName;
		
		grade1 = gr1;
		
		grade2 = gr2; 
		
		grade3 = gr3;
		
	}
	
	
	
	public void calculateAverage() {
		
		int average = (grade1 +grade2 + grade3)/3;
		
		System.out.println("Student "+ name+ " has an avarage "+ average);
	}
	
////////////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		
// Task 1	
		
		Task obj = new Task();
		
		Task onj1 = new Task("kelime");
		
// Task 2
		
		System.out.println("Task 2");
		
		
		Task student1 = new Task ("John", 90,20,70);
		
		student1.calculateAverage();
		
		Task student2 = new Task ("Can", 100,50,60);
		
		student2.calculateAverage();
		
		
		Task student3 = new Task ("Kemal", 10,30,80);
		
		student3.calculateAverage();
		
		
		
		
	}

}
