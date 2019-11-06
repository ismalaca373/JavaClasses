package com.class6_Swich;
import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ask user to enter the month they were born based on the month define the
		 * season if user jan feb dec winter if mar, apr, may -> soring if junjuly aug
		 * _> summer if sep oct nov _> fall otherwise _> unknow at the end of the
		 * program you were born in
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the month you born");

		String ay = scan.nextLine();

		String zaman;

		if (ay.equals("Jan") || ay.equals("Feb") || ay.equals("Dec")) {

			zaman = "ay";

		} else if (ay.equals("Mar") || ay.equals("Apr") || ay.equals("May")) {

			zaman = "ay";

		} else if (ay.equals("Jun") || ay.equals("Jul") || ay.equals("Aug")) {

			zaman = "ay";

		} else if (ay.equals("Sep") || ay.equals("Oct") || ay.equals("Nov")) {

			zaman = "ay";
		} else {

			zaman = "ay";
		}
		System.out.println("You were born in " + ay);

	}
}