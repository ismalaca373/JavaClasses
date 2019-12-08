package com.class30_Interface;

// Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter . 
// Create 2 child classes: Circle & Square that should have an implementation of area and perimeter calculation.
// Test your code.

public interface Shape {
	
	    double pi = 3.14;
	    double calculateArea(double radius);
	    double calculatePerimeter(double radius);
	}
	class Circle implements Shape {
	    double area;
	    double perimeter;
	    @Override
	    public double calculateArea(double radius) {
	        area = pi * radius * radius;
	        System.out.println("The area of circle: " + area);
	        return radius;
	    }
	    @Override
	    public double calculatePerimeter(double radius) {
	        perimeter = 2 * pi * radius;
	        System.out.println("The perimeter of circle: " + perimeter);
	        return radius;
	    }
	}
	class Square implements Shape {
	    double area;
	    double perimeter;
	    @Override
	    public double calculateArea(double side) {
	        area = side * side;
	        System.out.println("The area of circle: " + area);
	        return side;
	    }
	    @Override
	    public double calculatePerimeter(double side) {
	        perimeter = 4 * side;
	        System.out.println("The perimeter of square: " + perimeter);
	        return side;
	    }
	}



