package com.class11_Array_Loop;

public class Hom_82 {

	public static void main(String[] args) {
	
		
// 82 Write a program to double the values of every element in the array and print it out.
		
//		int [][]a = {{1,2,3,4}, {5,6,7,8,9,10}, {11,12,13,14}};
//		
//		for (int i = 0; i < a.length; i++) {
//		
//            for(int j=0; j<a[i].length; j++) {
//            	
//            System.out.print(a[i][j]*2+ " ");
//            
//         }  System.out.println();
//           
//	}

		
///////////////////////////////////////////////////	

		
// 83	Write a program to double the values of every element in the array and print it out. 
		
//		int[][] a = {
//				{5,2,3,7},
//				{1,5,2,2},
//				{1,2,3,4}
//			};
//			
//	      int sum=0;
//	      
//	      for (int j=0; j<a[2].length; j++) {
//	    	  
//	        sum+=a[2][j];
//	        
//	      } System.out.print(sum);
	      
//////////////////////////////////////////////////////////
	      
// 84	Write a program that prints the highest value in the array.
	      
//	      int[][] a = {
//	  			{5,2,3,7},
//	  			{1,5,1,1},
//	  			{8,3,1,2}
//	  		};
//	      
//	      int max = a[0][0];
//	      
//	          for (int i = 0; i < a.length; i++) {
//	        	  
//	              for(int j=0;j<a[i].length;j++) {
//	                 
//	                   if (a[i][j] >= max) {
//	                	   
//	                  max = a[i][j];
//	              }
//	            }
//	              
//	          }System.out.println(max);
	      
////////////////////////////////////////////////////
	          
// 85	Write a program that checks if a 2-D integer array is a square array, meaning, if its rows and columns are equal.

			//Hint:
			//
			//		int[][] a = {
			//			{1,1,1},
			//			{1,1,1},
			//			{1,1,1}
			//		};
			// //should be true
			//		
			//		int[][] b = {
			//			{1,1,1,1},
			//			{1,1,1,1},
			//			{1,1,1,1}
			//		};
			////should be false
	          
//	      	int[][] a = {
//	    			{1,1,1},
//	    			{1,1,1},
//	    			{1,1,1}
//	    		};
//	      	
//	     boolean flag = false;
//	            
//	            for (int i = 0; i < a.length; i++) {
//	            	
//	                if (a.length == a[i].length){
//	                	
//	                    flag = true;
//	                }
//	                break;
//	            }
//	            System.out.println(flag);

//////////////////////////////////////////////////////
	            
// 86	Write a program that  takes a 2-D array and prints the sums of the rows as an integer array.

		//For example, the if we run rowSums for the following 2D array:
		//{
		//  {1,1,2}, //sum = 4
		//  {3,1,2}, //sum = 6
		//  {3,5,3}, //sum = 11
		//  {0,1,2}  //sum = 3
		//}
		//
		//
		//Then we should get the following array back:
		//4
		//6
		//11
		//3
	    	
//	      int [][] a = {{1,2,3}, {4,5,6},{7,8,9}};
//	      
//	      int rowSums=0;
//	      
//	      for(int i = 0; i<a.length; i++) {
//	    	  
//	    	  rowSums=0;
//	    	  
//	    	  for (int j=0; j<a[i].length; j++) {
//	    		  
//	    		  rowSums+= a[i][j];
//	    	  }
//	      
//	    	  System.out.println(rowSums);
//	      
//	      }
//	            
//	      System.out.println();
		
////////////////////////////////////////////////////
	      
// 87	 Write a program that prints the total number of elements that are negative AND odd 
	      
	     // output=3

	      
//	      int[][] a = {
//	  			{-5,-2,-3,7},
//	  			{1,-5,-2,2},
//	  			{1,-2,3,-4}
//	  		};
//	          int odd = 0;
//	          
//	          for (int i = 0; i < a.length; i++) {
//	        	  
//	              for (int j = 0; j < a[i].length; j++) {
//	            	  
//	                  if ((a[i][j] % 2) != 0 && (a[i][j]) < 0) {
//	                	  
//	                      odd++;
//	                  }
//	              }
//	          }
//	          
//	          System.out.print(odd);
	  	
////////////////////////////////////////////
	          
// 88	Write a program that will print the sum of all elements in column within index 1 in a 2-D int array. 
	          
//	          int [][] a = {
//	        	  	{5,2,3,7},
//	  	  			{1,5,1,1},
//	  	  			{8,3,1,2}
//	  	  			};
//	          
//	          int column = 1; // column number belli oldugundan burda bunu diyebiliriz her zaman 1 olacak 
//	          
//	          int sum = 0;
//	          
//	           for (int i = 0; i < a.length; i++) {
//	        	   
//	           sum += a[i][column];
//	        }
//	           System.out.println( sum );
	        	
/////////////////////////////////////////////
		
// 89			
//		Write a program that sums all numbers that are on even index and on even row and prints it out.
//
//		For example, in the following array, the numbers with parentheses would be summed:
//
//		     0  1  2  3
//
//		0   (4)(6)(3)(2)
//		1   (4) 1 (2) 3
//		2   (1)(2)(6)(9)    
	           
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
	        int even=0;
	        
	        for(int i=0;i<a.length;i++) {
	        	
	            for(int j=0;j<a[i].length;j++) {
	            	
	                if((i%2==0||j%2==0)) {
	                	
	                    even=even+a[i][j];
	                }
	                
	            }
	        }System.out.println(even);
	        
////////////////////////////////////////////////
	        

			 
		
	          }
	          
	}


