package com.class6_Swich;

import java.util.Scanner;

public class Hom_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
		  Scanner scan = new Scanner(System.in);
		  
		  System.out.println("Is it weekend?");
		  
		  boolean week= scan.nextBoolean();
		  
		  String hafta;
		  
		  if (!week){
		    
		    hafta = "Manual testing";
		    
		  }else{
		    
		    hafta = "Java";
		  }
		  System.out.println("Today you will be learning "+ hafta);
		

/*
 * Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="Manual testing"
Otherwise --> subject="Java"

Output: 
"Today you will be learning ____"
 * 
 */
	
	
	

		
		
		
	}

}
