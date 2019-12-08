package com.class27_Polymorphism_Overriding_Cont;

public class Student {

	
	public void run (){
		
		System.out.println("run around");
		
		
	}

}

class SyntaxStudent extends Student {
	
public void run (){
		
		System.out.println("walking");
	
	}

public void fly() {
	
	System.out.println("can fly");
}
	
	
}

class CollegeStudent extends Student {
	
public void run (){
		
		System.out.println("flying");
		
	}
	
public void konus() {
	
	System.out.println("cok konusur");
}
	
}

class SchoolStudent extends Student{
	
public void run (){
		
		System.out.println("ucuyor");
		
	}

public void yatis() {
	
	System.out.println("yatar durur");
}
	
	
}
