package com.class26_Polymorphism_Overriding_Run_Time;

public class Animal {  // animal testle baglantili
	
	public void sleep() {
		System.out.println("Animal Sleep");
	}
	
	public void eat() {
		
		System.out.println("Animal eat");
	}

}




class Cat extends Animal{  //  bu ayri class
	
	public void sleep() {
		
		System.out.println("Can Sleep all day");
	}
	
	public void eat() {
		
		System.out.println("I meow when eat balik");
	
	}
public void meow() {
		
		System.out.println("I meow all time");
	
}}