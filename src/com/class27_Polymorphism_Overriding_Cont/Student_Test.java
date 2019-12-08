package com.class27_Polymorphism_Overriding_Cont;

public class Student_Test {

	public static void main(String[] args) {
		
		

		
		Student ogr1 = new SyntaxStudent(); // burda sadece student methodlarina ve dolayli olarak override yapilmis child methodlarina ulasirim JVM de
		
											// 
		Student ogr2 = new CollegeStudent();	
		
		Student ogr3 = new SchoolStudent();	
			
		
		Student[] hepsi = {ogr1,ogr2,ogr3};
		
		for(Student myogr: hepsi) {
			
			myogr.run();
		}
		
		
		
	}
}