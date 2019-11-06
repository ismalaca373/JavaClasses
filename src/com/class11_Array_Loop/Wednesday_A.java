package com.class11_Array_Loop;

public class Wednesday_A {

	public static void main(String[] args) {
		
//		int [][] a=new int[3][4];  // there is 3 arrays and 4 elements demek bu
//		
//		a[1][2] = 3;  // lenthf of array = how many array
//		a[2][1] =5;	
//		
//		for (int row = 0; row <a.length; row++) {	//kac row varsa yazar rowlar sabit		// a.lenght burda a nin propertisi
//		
//			System.out.print("row "+ row + " --> ");
//			
//			for(int col = 0; col< a[row].length; col++) {  // a[row] row in index i demek. index sabit olmayabilir
//				
//				int value = a[row][col]; // birlesiminde ne varsa onu yazar
//				
//				System.out.print(value + " ");
//				
//			}
//			System.out.println();
//			
//			
//		}
//		
//		row 0 --> 0 0 0 0 
//		row 1 --> 0 0 3 0 
//		row 2 --> 0 5 0 0 


//////////////////////////////////////////////
		
//		int[][] b = {
//				
//				{7,3,5},
//				{9,4,2},
//				{8,1,0,8,4,5},
//				{3,5,1}
//		};
//		
////		System.out.println(b.length); // 4 cikar 4 row var 
//		
////		System.out.println(b[0].length); // birinci row uzunlugu 3 tane ama degisebilir onun icin ikinci for da b[i] kullandik
//		
//	for (int i =0; i<b.length; i++) { // 4 row var
//		
//		for (int j = 0; j< b[i].length; j++) {
//			
////			if (j==1) {   // j==index 1 // burda (j!=1) dersen else de gerek yok tek sarta baglamis oluyor direk
//				// yukarda or ile birkac cesit sey yapabilirsiin
//				
////				System.out.print("s "); ikinci col atlattik
////			}else
//			
//			System.out.print(b[i][j] + " ");
//		}
//		System.out.println();
//		
//	}
//	
	
//	7 3 5 
//	9 4 2 
//	8 1 0 8 4 5 
//	3 5 1 		
		
////////////////////////
	
	
//	scanner ile
	
//	
//	        Scanner scan = new Scanner(System.in);
//	        System.out.println("Body, how many rows do you want?");
//	        int rows = scan.nextInt();
//	        System.out.println("Body, how many columns do you want?");
//	        int cols = scan.nextInt();
//	        String[][] names = new String[rows][cols];
//	        // names.length = rows
//	        // names[0].length = cols
//	        // Entering into array
//	        System.out.println("Body, enter all the names!");
//	        for (int i = 0; i < rows; i++) {
////	          System.out.println("Body, we are at row index " + i);
//	            for (int j = 0; j < cols; j++) {
//	                if (j != 1) {
//	                    names[i][j] = scan.next();
//	                } else {
//	                    scan.next();
//	                }
//	            }
//	        }
//	        System.out.println("Let's print the names!");
//	        for (int i = 0; i < rows; i++) {
//	            for (int j = 0; j < cols; j++) {
//	                System.out.print(names[i][j] + " ");
//	            }
//	            System.out.println();
//	        }
//	    }
//	
//	
	
//	max number bulma
	
		
//		        int[][] b = { { 2, 3, 5 }, { 2, 4, 7 }, { 8, 1, 9 }, { 3, 5, 1 } };
//		        int max = b[0][0];
//		        for (int i = 0; i < b.length; i++) {
//		            for (int k = 0; k < b[i].length; k++) {
//		                if (b[i][k] > max) {
//		                    max = b[i][k];
////		                  System.out.println(max);
//		                }
//		            }
//		        }
//		        System.out.println("maximum is " + max);
//		    
	
//	}
	
/////////////////////////////////////////
	 
//	 find the sum
	
		
		        int[][] b = { { 2, 3, 5 }, { 2, 4, 7 }, { 8, 1, 9 }, { 3, 5, 1 } };
		        int sum = 0;
		        for (int i = 0; i < b.length; i++) {
		            for (int k = 0; k < b[i].length; k++) {
		                sum += b[i][k];
		            }
		        }
		        System.out.println("sum in all rows is " + sum);  // sum nulfuktsn sonra 0 a estileyip for yaziyorsun sonra
		        sum = 0;
		        int row = 1; // row bulmak icin numberlari degistir dene // row toplamini da bulursun
		        for (int k = 0; k < b[row].length; k++) {
		            sum += b[row][k];
		        }
		        System.out.println("sum in row " + row + " is " + sum);
		    }
	
	
//////////////////////////////////////
	
//	homeworks
	
	
	//Extra (work) create a 1-D array
	//enter the sum of each column into one element of the array


	}