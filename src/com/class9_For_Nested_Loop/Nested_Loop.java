package com.class9_For_Nested_Loop;

import java.util.Scanner;

public class Nested_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// for loop best choise when # of repetation is known
// while and do while if we dont know how many times we want to repeat
// 

// nested loop:

							// itteration
//		for(int i=1; i<=3; i++) {   //outer loop control repetition of inner loop
//			
//			System.out.println("I am outer loop__");   // isleme koyar iceri gider icerdeki 3 defa calisir 
//			
//			for(int j=1;j<=3; j++) {  
//				
//				System.out.println("I am inner loop"); // buraya numara
//			}
//		}

///////////////////////////////////////////////		

//		for(int i=0; i<=5;i++) {
//			
//			System.out.println(i);
//			
//			for (int j=0;j<=5; j++) {  
//				
//				
//				System.out.println(j);
//			}
//			
//		 }

//		0
//		0
//		1
//		2
//		3
//		4
//		5
//		....devam ediyor

/////////////////////////////////////////

//       for(int i=0; i<=5;i++) {
//		
//			for (int j=0;j<=5; j++) {   // bese kadar devam ediyor bu sonra yukari cikiyor
//				
//				System.out.println(i+" "+j);
//			}
//		 }
		
//       0 0
//       0 1
//       0 2
//       0 3
//       0 4
//       0 5
//       1 0

/////////////////////////////

		// saat

//		for (int h = 0; h < 12; h++) { // 12 yap
//
//			for (int m = 0; m < 60; m++) {
//
//				System.out.println(h + ":" + m);
//
//			}
//		}

///////////////////////////////

		// milage
//
//		for(int i= 0; i<10; i++) {
//	
//			for(int a= 0; a<10; a++) {
//		
//				for(int b=0; b<10; b++) {
//			
//					for(int c= 0; c<10; c++) {
//				
//				
//					System.out.println(i+""+a+""+b+""+c);
//		
//					}
//				}					
//			}
//		}

////////////////////////////////////////////

//		****   bu sekli yapalim
//		****
//		****
//		****

		
//		for(int k= 1; k<=4; k++) {     // outer loop controll your rows ***
//			
//			for(int l= 1; l<=4; l++) { // control columns  **
//				
//				System.out.print("*");  // println demedik dikkat
//			}
//			System.out.println(); // bu da alta gecmek icin
//		}

//////////////////////////////////////////////		
//		**********
//		**********
//		**********
//		**********
//		**********
//		**********
//		**********
//		**********
//		
//		for(int i=0; i<10; i++) { //rows
//			
//			for(int y=0; y<10; y++) {  // columns
//				
//				System.out.print("*");
//			}
//			System.out.println();
//		}

////////////////////////////////////

//		012345
//		012345
//		012345
//		012345
//		012345	

//		for(int i=0; i<5; i++) { // row                 //always rows then columns 
//			
//			for(int j=0; j<6; j++) { //column 
//				
//				System.out.print(j);   // 012345 alt alta 5 tane yazar    // i dersen  000000 altina 11111..... devam eder
//			}
//			System.out.println(); 
//		}
//		
///////////////////////////////////		

//		0123456789
//		0123456789
//		0123456789
//		0123456789
//		0123456789

//		
//		for(int i=0; i<5; i++) {   // row
//			
//			for(int k=0; k<10; k++) {  //column
//				
//				System.out.print(k);  
//			}
//			
//			System.out.println();
//		}

		///////////////////////////

//

//		1
//		22
//		333
//		4444
//		55555
//		666666
//		7777777
//		88888888
//		999999999

//		for(int i=0; i<=9; i++) {
//			
//			for(int j=1; j<=i; j++) {  // yarim piramidi yapmak icin j<=i
//				
//				System.out.print(i);
//				
//				
//			}
//			System.out.println();
//		}

/////////////////////		
//		88888888
//		7777777
//		666666
//		55555
//		4444
//		333
//		22
//		1	

//		for(int i=9; i>=1; i--) {     
//			
//			for(int a=1; a<=i; a++) {
//				
//				System.out.print(i);
//				
//				
//			}
//				System.out.println();
//		}
		
//////////////////////////

//		*
//		**					
//		***
//		****					
//		*****
//		****
//		***
//		**
//		*
//
//		for(int i=1; i<=5; i++) {    // incrementing 1-5 *
//		
//	    	for(int j=1; j<=i; j++) {
//		
//	               System.out.print("*");
//	        }
//	           System.out.println();
//		
//	           //devami 
//	        }
		
//	        for(int i=1; i<=5; i++) {
//		
//	           for(int j=4; i<=j; j--) { 
//		
//	               System.out.print("*");
//		
//	           }System.out.println();
//		
//	        }

//		print tra

//		Assume that the int variables i and j have been declared, and that n has been declared and initialized.
//		Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.

//		for(int i=1; i<=5; i++) {
//			
//			for(int j=1; j<=i; j++) {
//				
//				System.out.print("*");
//				
//			}
//			
//			System.out.println();
//			
//		}
//		
//	for(
//
//	int i = 5;i>=i;i--)
//	{
//
//		for (int j = 1; j <= i; j++) {
//
//			System.out.print("*");
//
//		}
//
//		System.out.println();
//	}
		
		
	        // Create a new Scanner object
	        Scanner scanner = new Scanner(System.in);

	        // Get the number of rows from the user
	        System.out.println("Enter the number of rows to print the pattern ");

	        int rows = scanner.nextInt();
	        System.out.println("** Printing the pattern... **");
	        for (int i = 1; i <= rows; i++)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
	
		
	}

