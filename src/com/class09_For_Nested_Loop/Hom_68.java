package com.class09_For_Nested_Loop;

public class Hom_68 {

	public static void main(String[] args) {
		
//		
//		Note: You may also place the switch case statement inside a for loop. In each iteration 
//		of the for loop, the switch case can be executed for each value in the range of for loop. 
//
//		The x variable is incremented by 5 in each iteration. In the body of for loop, 
//		the switch statement with five cases and a default label. For every loop, 
//		the expression in the switch is matched, and the matched case statement will 
//		display a message. 
//
//		Hint: always watch output mismatch in case of an error while submitting, it will show the difference between your and expected answers. 

		
//		
//		for (int x = 5; x <= 25; x=x+5) {
//			 
//		    // Switch on number.
//		   
//		    switch (x) {
//		   
//		    case 5:
//		   
//		      System.out.println("The case 5 is true");
//		   
//		      break;
//		      
//		      case 10:
//		   
//		      System.out.println("The case 10 is true");
//		   
//		      break;
//		      
//		      case 15:
//		   
//		      System.out.println("The case 15 is true");
//		   
//		      break;
//		      
//		      case 20:
//		   
//		      System.out.println("The case 20 is true");
//		   
//		      break;
//		      
//		      case 25:
//		   
//		      System.out.println("The case 25 is true");
//		   
//		      break;
//		      
//		      default:
//						System.out.println("The loop is finished!");
//		    }
//		  
//		   }
//		
		
		///////////////////////////////////////////////
		
// 69
//		
//		Write a program to print out the pattern: 
//
//	    1
//	   22 
//	  333 
//	 4444 
//	55555
//
//	Hint: For loop can have more than one loop nested in it. 
//		
//		
			for (int i = 1; i <= 5; i++) {
			
			for (int k = 5-i; k >= i; k--) {   // bosluk birakmak icin 5-i yazdik bak 
				
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
			}

			System.out.println();
		}
			
///////////////////////////

// 70

//Write a program to print out the pattern: 
//
//	 
// $$$$
// $  $
// $  $
// $$$$


//////////////////////////////


// 71

//Write a program to print out the pattern: 
//
//1 2 3 4 5 6 7 8 9 10 
//2 4 6 8 10 12 14 16 18 20 
//3 6 9 12 15 18 21 24 27 30 
//4 8 12 16 20 24 28 32 36 40 
//5 10 15 20 25 30 35 40 45 50
		

		
//		
//		 for (int i = 1; i <= 5; i++) {
//			 
//		       for (int j = 1; j <= 10; j++) {
//		    	   
//		      System.out.print((i * j) + " "); 
//		      
//		       }
//
//		    System.out.println(); 
//		    
//		 }
//		    
		   
	
///////////////////////////
		 
		 // 72
	
//		 for (int i = 1; i <= 3; i++) {
//			 
//		 
//			 for (int j = 1; j <= 2; j++) {
//				 
//				 System.out.println("syntax");
//				 
//			 }
//		 }	


		    
		
	}
	
	
		
 }
	


