package com.class04_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Hom_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* For you to do:

Initialize a scanner object. 
Create an if condition: if user enters a number and it is even, print that "Value is even". 
If the above mentioned statement is true then create a nested if condition to see if the value is greater than 100. 
If the value is greater than 100, then print "Value is too large", else print "Value is just right". 
For the first if condition create an else and if the value is less than 100 then print "Value is just right and is an odd number", else "This is an odd number and value is too high"

Output:

If user enters 2  print"Value is even" and print for the nested if "Value is just right"

If user enters 102 "Value is even" and print for the nested if "Value is too large"

Now try and figure out how you would do the else condition for the first if you created
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		  
		 System.out.println("Please enter a number");
		  
		  int num=scan.nextInt();
		  
		  if(num%2==0) {
			  
			  System.out.println("Value is even");
			  
			  if (num>100) {
				  
				  System.out.println("Value is too large");
			  }else {
				  
				  System.out.println("Value is just right");
				  
				 
			  }
			  
		  }else {
			  
			
			  
			  if (num<100) {
				  
				  System.out.println("Value is just right and is an odd number");
			  }else
				  System.out.println("This is an odd number and value is too high");
				  
			  
			  
			  
		  }
		  
		  
			  
		
	}

}
