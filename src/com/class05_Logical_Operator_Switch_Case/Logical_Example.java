package com.class05_Logical_Operator_Switch_Case;

public class Logical_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * 7 day a week if days is 
		 * Tue or Thu --> SDLC class 
		 * if day sat  or sun -> Java class
		 *  if day wed review day
		 *  digerleri not a validday
		 * 
		 * 
		 * 
		 */
		
		
		String weekDay = "Tue";   //spelle dikkat et direk else verir
		
		
		if (weekDay.equals("Tue") || weekDay.equals("Thu")){	
			
			System.out.println("SDLC");
			
		}else if (weekDay.equals("Sat") || weekDay.equals("Sun")){
			
				System.out.println("No Class");
			
		}else if (weekDay.equals("Wed")) {
			
			System.out.println("Review Day");
			
		}else {
			System.out.println("Not a valid day");
		}
		
		
	}

}
