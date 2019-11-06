package com.class6_Swich;

import java.util.Scanner;

public class Hom_39 {
	
	/*
	 * By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.

First Output: "Enter name of the instructor"

case 1: if User provided the name as Shiva as input it should show  "Will take care of Java Assignment"
case 2: if User provided the name as Sandish as input it should show  "Will take care of SDLC Assignment"
case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"

Other than these four names if user provide the name try to give like (James or John ) " Invalid instructor selected"
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter name of the instructor");

		String name = scan.next();

		String show;

		switch (name) {

		case "Shiva":

			show = "Will take care of Java Assignment";

			break;
		case "Sandish":

			show = "Will take care of SDLC Assignment";

			break;
		
		case "Wqas":
			
			show ="Will take care of Selenium Assignment";
			
			break;
		case "Asel":
			
			show = "Will take care of every Assignment";
			break;
			
		default:
			show = "Invalid instructor selected";
			
			
		}
		System.out.println(show);
		
	}

}
