package com.class4_if_Else_Nested_Scanner;

import java.util.Scanner;

public class wed_If_nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   //Write a program with one int value for salary and four String values for different cars
        //If you make over 50000 a year, you may buy a brand new car otherwise you should buy a used car. For those you can afford a new car there are different price ranges
        //I want anything under 70k to be Audi A5
        //I want anything under 80k to be Mercedes-Benz
        //I want anything under 90k to be Jaguar
        //I want anything under 100k to be Tesla
//        // And if you make less than 60k output to read "Save up money and wait until next year"
//		
//		
		int salary = 60000;
		String mod1= "Audi";
		String mod2= "Benz";
		String mod3= "Jaguar";
		String mod4= "Tesla";
		
		if (salary >50000) {
			
			System.out.println("buy a brand new car");
			
			 if (salary>50000 && salary <60000) {
				
				System.out.println("Save up money and wait until next year");
			
			
			 }else if (salary>=60000 && salary <70000) {
				
				System.out.println("buy " + mod1);
			
			}else if(salary>=70000&& salary <800000) {
				
				System.out.println("buy " + mod2);
				
			}else if(salary>=80000 && salary <90000) {
				
				System.out.println("buy " + mod3);
				
			}else if(salary>=900000 && salary <100000) {
				
				System.out.println("buy " + mod4);
			}
			
			
			
			
		}else {
			
			System.out.println("you should buy a used car");
		}
		
//		
//		
//		
		
//////////////////////////////////////
		
		/*
		 * Write a program that prints out if it is good weather to go for a bike ride. 
		 * The weather is good if the temperature is between 60 degrees and 100 degrees inclusive unless it is raining. 
		 * If temperature is less than 60 program should say
it is too cold, if the temperature is more than 100, program should say it is too hot.
		 */
		
		
//		Scanner scan;
//        boolean snow, rain, sunny;
//        int temp;
//        String activity;
//
//        scan = new Scanner(System.in);
//
//        System.out.println("Please enter a temperature");
//
//        temp = scan.nextInt();
//
//        if (temp >= 40 && temp < 80) {								// if conditionlar hep 
//            System.out.println("Is it raining?");
//            rain = scan.nextBoolean();
//
//            if (rain) {
//                activity = "Watch a movie";
//            } else {
//                activity = "Go hiking";
//            }
//            
//        } else if (temp >= 25 && temp < 40) {
//            System.out.println("Is it snowing?");
//            snow = scan.nextBoolean();
//            if (snow) {
//                activity = "Snowboarding";
//            } else {
//                activity = "Let’s code";
//            }
//        } else if (temp >= 80) {
//            System.out.println("Is it sunny");
//            sunny = scan.nextBoolean();
//            if (sunny) {
//                activity = "Go to the beach";
//            } else {
//                activity = "Do more coding";
//            }
//        } else {
//            System.out.println("Please enter different temperature");
//            activity = "Unknown";
//        }
//        
//        System.out.println("My activity for today is " + activity);
//		
//		
		
	}

}
