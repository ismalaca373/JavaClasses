package com.class_A_Interview_Questions;

public class Fisrt_10 {

	public static void main(String[] args) {
		
		
			
// 1. 		 // Write a program to swap 2 numbers without a temporary variable? 
					
			// Swap 2 strings without a temporary variable?
					
			// aritmetic opretaions and assigning value again
						
//				int x = 10;
//			    int y = 5;
//			    x = x + y;
//			    y = x - y;
//			    x = x - y;
		
//			    System.out.println("After swaping:"
//			                       + " x = " + x + ", y = " + y);
//				
		//////////////
		
//			    String a = "Love";
//			    String b = "You";
			    
//			    System.out.println("Before swap: " + a + " " + b);
			    
//			    a = a + b; // loveyou						// boylece dinamik yapmis oldun
//			    b = a.substring(0, a.length() - b.length()); // 0 dan baslayip uzunlukalrinin fark int gore yazar  
//			    							
//			    a = a.substring(b.length());
		
//			    System.out.println("After : " + a + " " + b);
			   

//	//////////////////////////////////			
		
//	2.         Write a java program to find the second largest number in the array?
//			   Maximum and minimum number in the array?

//			int[] array = { 100, -90, 8787, 898, 0, 1, -90, 8787 };
		
//	    // 1 easiest way
		
//			Arrays.sort(array);
		
//			int min = array[0];
		
//			int max = array[array.length - 1];
		
//			System.out.println(min);
//			System.out.println(max);
		
//		// 2 way
		
//			int[] myArray = { 100, -90, 8787, 898, 0, 1, -90, 8787 };
		
//			int largest = myArray[0];
		
//			int smallest = myArray[0];
//			
//			for (int i = 0; i < myArray.length; i++) {
		
//				if (myArray[i] > largest) {
		
//					largest = myArray[i];
//				}
//				if (myArray[i] < smallest) {
		
//					smallest = myArray[i];
//				}
//			}
//			System.out.println("The smallest value in the array is " + smallest);
		
//			System.out.println("The largest value in the array is " + largest);
//			
//		3rd way		
		
//			int[] nums = { 100, -90, 8787, 898, 0, 1, -90, 8787};
		
//			int large=nums[0];
		
//			int secondLarge=nums[0];
//			
//			for(int i=0; i<nums.length; i++) {
//				
//				if (nums[i]>large) {
		
//					secondLarge=large;
		
//					large=nums[i];
		
//				}else if(nums[i]>secondLarge&& nums[i]<large ) {
		
//					secondLarge=nums[i];
//				}
//			}
//			
//			System.out.println("The 2 largest value in the array is " + secondLarge);
		
//			System.out.println("The largest value in the array is " + large);

//////////////////////////////////////////////

//   3  		Find out how many alpha characters present in a string?
				

				
				        
//				 String str="Harun abi cok caliskan bir insandir#$@%365746#^$&5";
		
//				 System.out.println(str.length());
//				        
//				       
//				 System.out.println("*****************");
//				        
//				        
//				 String str1=str.replaceAll(" ", "");
		
//				 System.out.println(str1.length());
//				        

			 ////////////////////////////////////////////////
			           
//	 4     		How to find out the part of the string from a string? What is substring?
//				Find number of words in string?
				        
//				 String str="Harun abi cok caliskan bir insandir";
		
//				 System.out.println(str.substring(0,5));
		
//				 System.out.println("********************");
		
//				        
//				 String[] str1=str.split(" ");
		
//				 System.out.println(str1);
		
		
////			 for(int i=0;i<str1.length;i++) {
		
////				 System.out.println(str1[i]);
////			}
//				   
//					System.out.println("********************");
		
//				    System.out.println(str1.length);
//				    
//				        
//				        }	
				        	
//////////////////////////////////////////////////	
			
// 8    	 // write a program to print first 10 numbers of Fibonacci series
		
		
		
			int a,b,c;
			
			a = 0;
			b = 1;
			
			for (int i=0; i<10; i++) {
				
			System.out.print(a + " ");
				
			c = a+b;
			a = b;
			b = c;
						
			
				
			}
	}
	

}


