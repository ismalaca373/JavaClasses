package com.class7_Loops;

public class H_Carsamba {

	public static void main(String[] args) {

		// hotel

		for (int floor = 1; floor <= 4; floor++) {
			System.out.print("Floor " + floor + " -> ");
			for (int room = 1; room <= 6; room++) {
				System.out.print(floor + "." + room + " ");
			}
			System.out.println();
		}

///////////////////////////////////

//		yanyana yaziyor 5 e bes 
//
//		for (int row = 1; row <= 5; row++) {
//
//			for (int col = 1; col <= 5; col++) {
//
//				System.out.print(row); // col dersen 12345 altalta // row dersen 11111 altalta
//			}
//			System.out.println(); // bunla adagi iniyor
//		}

//11111
//22222
//33333
//44444
//55555

/////////////////////

//			yarim piramit yapmak icin

//		for (int row = 1; row<=5; row++) {
//			
//			for(int col = 1; col<=row; col++) {  //col<=row dedik
//				
//				System.out.print(col);  // colum yazdirirsan  1 sonra 12...// row yazarsan 1 onun altina 22..
//			}
//			System.out.println();
//		}
//		
//////////////////////////////////
		
//		  	1
//		   12
//		  123
//		 1234
//		12345

		for (int i = 1; i <= 5; i++) {
			
			for (int k = 5-i; k >= i; k--) {   // bosluk birakmak icin 5-i yazdik bak 
				
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println();
		}
		
		
		///////////////////
		
	//	2nd way
		
		
		for (int i = 1; i <= 5; i++) {
	        for (int j = 1; j <= (5 - i); j++ ) { 
	        System.out.print(" "); }
	        
	        for (int k = 1; k <= i; k++) {
	        System.out.print(i);
	        }
	        System.out.println();}
		
///////////////////////////////////////////
		
		

		// 		$$$$$
	    // 		$   $
	    // 		$   $
	    // 		$$$$$
	  
	        
	        for (int i = 1; i <= 4; i++) {
	            for (int j = 1; j <= 5; j++) {
	                if (i == 1 || j == 1 || i == 4 || j == 5) {
	                    System.out.print("$");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	



	}

