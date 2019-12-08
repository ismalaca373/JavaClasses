package com.class25_Polymorphism_Overloading_Compile;

public class Task {
	
	
	public void area(int a) {
		
		int  area = a*a;
		
		System.out.println("square " + area);
	}
	public void area(int a, int b) {
		
		int  area2 = a*b;
		System.out.println("box " + area2);
	}
	
	public void area(int a, int b, int c) {
		
		int area3 = a*b*c;
		System.out.println("box " + area3);
	}
	
	public static void main(String[] args) {
		
		Task obj = new Task ();
		
		obj.area(5);
		obj.area(4, 5);
		obj.area(2, 3, 5);
		
	}

}
