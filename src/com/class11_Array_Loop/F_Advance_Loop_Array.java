package com.class11_Array_Loop;

public class F_Advance_Loop_Array {

	public static void main(String[] args) {
		
		 int [][] intArray = {{2,3,4},{4,5,6},{6,7,8},{8,9,0}};
	        
	        for(int row=0; row< intArray.length; row++) {
	        	
	        	for (int col = 0; col<intArray[row].length; col++){
	        		
	        		System.out.print(intArray[row][col]+ " ");
	        		
	        	}
	        	
	        	System.out.println();
	        }
	        
	        System.out.println("using advanced for loop");
	        
	        // bur da nested advance loop gorecegiz
	        
	        for(int [] row: intArray) { // her rowu aliyoruz row un arrayinin icine 
	        	
	        	for (int number:row) { // burda da her rowdaki elementi yazdiriyor
	        		
	        		System.out.print(number + " ");
	        	}
	        	System.out.println();
	        }
	}

}
