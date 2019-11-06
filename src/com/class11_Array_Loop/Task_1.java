package com.class11_Array_Loop;

public class Task_1 {

	public static void main(String[] args) {
		
		//even numberlari yazdir
//
//		int [][] numbers= {
//	            {3,5,7,9},
//	            {2,4,6,8},
//	            {11,13,15,17},
//	    };
//	    
//	    for(int a[]: numbers) {
//	        for(int b: a) {
//	            if(b%2==0) {
//	                System.out.println(b);
//	            }
//	        }} 
	  
		
///////////////////////////////////////
		
	//	aynisini yazdir
//		
//		int[][] numbers = { {3,5,4,1},
//                		    {54,32,12,45},
//                		    {9,56,45,33}    };
//		
//		for(int arr[]:numbers ) {
//			for(int nums: arr) {
//				System.out.print(nums + " ");
//			}
//			System.out.println();
//			}}
		
//////////////////////
		
		// toplamlari
		
		 int sum=0;
	        int[][] allNumbers= {
	                {3,6,8},
	                {2,45,67},
	                {67,6,5},
	        };
	        for(int a[]:allNumbers) {
	            for(int b: a) {
	                sum=sum+b;
	                
	            }
	            
	        }
	        
	        System.out.println(sum);
	        
	        
	}  

	}

