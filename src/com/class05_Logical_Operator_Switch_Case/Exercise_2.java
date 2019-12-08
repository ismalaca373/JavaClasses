package com.class05_Logical_Operator_Switch_Case;

public class Exercise_2 {

	public static void main(String[] args) {
		/*
		 * declare the time 1-24
		 * based on time identify whether it morning afternoon night
		 * if 1-11 morning
		 * if 12-15 noon
		 * if 16-20 evenin
		 * if >20 night
		 * 
		 */

		
		int time= 16;
		
		String zaman;    // bunu boyle acik birakip herseyden sonra syso yazdirmayip bunun valuesini yaziyoruz en son print
		
		if(time>1 && time <+11) {
			
			zaman = "Morning";
			
		}else if (time>= 12 && time<=15) {
			zaman= "Noon";
					
		}else if (time>= 16 && time<=20) {
			
			zaman = "Night";
			
		}else { 
			
			zaman = "Late night";
					
		}
		System.out.println("the time of the day is "+ zaman);
		
		if (zaman.equals("Morning"));    // bunu da boyle yazabilrisin 
		
		System.out.println("Good morning");
		
		
	}
	
	

}
