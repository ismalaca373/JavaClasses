package com.class05_Logical_Operator_Switch_Case;

public class B_Logical_Opreator_Or {

	public static void main(String[] args) {

		/*
		 * 7 day a week if days is 2 or 4 --> SDLC class i day 6 or 7 -> Java class if
		 * day 1 or 5 -> no class if day -3 -> review class
		 */

		int day = 7;					// or da biri dogru olsa yeter. hepsi false olurda else yazar

		// false or false -> false
		if (day == 2 || day == 4) {

			System.out.println("SDLC Class");
			// true or false -> false
		} else if (day == 6 || day == 7) {     //&& dersen == not a valid cikar cunku andde ikisi de true olmali
			System.out.println("Java class");
			// false or false -> false
		} else if (day == 1 || day == 5) {

			System.out.println("No class");
		} else if (day == 3) {

		} else {
			System.out.println("not a valid day");
		}

	}

}
