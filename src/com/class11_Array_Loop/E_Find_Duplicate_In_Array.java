package com.class11_Array_Loop;

public class E_Find_Duplicate_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int [] array2= {2,5,4,7,2};
        
        for (int i=0; i<array2.length; i++) { 
            
            for (int j=i+1; j<array2.length; j++) { //  j=i+1;= burda index 0 ile 1 i karsilastiriyor if le esitse yazdir diyor
                
                if (array2[i]==array2[j]) { 
                    
                    System.out.println(array2[j]);
                }
            }
        }
	}

}
