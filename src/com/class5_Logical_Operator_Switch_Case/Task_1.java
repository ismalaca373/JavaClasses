package com.class5_Logical_Operator_Switch_Case;

public class Task_1 {

	public static void main (String []args) {
		
		
		/*
		 * print wethaer it is a weekend or weekday. i fany day 1-5 -> out put it is a weekday
		 * anyday from 6-7 output is it is aweekend any other day out put invalid day
		 * 
		 */
		
		int day= 75;
		
		if ((day>=1) && (day<=5)) {
			
			System.out.println("it is a weekday");
			
		}else if (day==6 || day==7){
			
			System.out.println("it is a weekend");
		}else {
			
			System.out.println("Invalid day");
		}
		
		
	}
}
