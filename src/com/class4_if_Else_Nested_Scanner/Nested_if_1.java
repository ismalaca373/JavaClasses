package com.class4_if_Else_Nested_Scanner;

public class Nested_if_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * soru 1 we need to check if student completed the quiz if yes --> good job, if
		 * not --> not good soru 2
		 * 
		 * if they completed we will check score: if more than 90--> you got an A if
		 * more then 80--> you got a B 3.soru anything below-> you should study more
		 * 
		 */

		boolean quiz = true; // false dersen not
		int score = 85;

		if (quiz) {
			System.out.println("good job");

			if (score >= 90) {
				System.out.println("you got an A");
			} else if (score > 80 && score <90) {
				System.out.println("you got a B");
			} else {
				System.out.println("you should study more");
			}

		} else {

			System.out.println("not good");

		}
		
		
		
		
		
	}

}
