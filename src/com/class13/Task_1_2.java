package com.class13;

public class Task_1_2 {

	public static void main(String[] args) {
		
		
//		1.Create a String and print it in reverse order (Sunday → yadnuS).
		
		String day="Sunday";
								// -1 dedik : index uzunlugu 6 ama 5 index sayisi var cunku index saymaya o dan baslar.
		
	    for(int i=day.length()-1 ; i>=0 ; i--)
	    	
	    System.out.print(day.charAt(i));
	    
///////////////////////////////////////////////
	    
	    
	    System.out.println(new StringBuilder(day).reverse()); // bu daha kisa yolu
	
	    
	    //worst way
	    System.out.println(day.charAt(5)+" "+day.charAt(4)+" "+day.charAt(3)+" "+day.charAt(2)+" "+day.charAt(1)+" "+day.charAt(0)) ;
	
	    
////////////////////////////////////////////	    
	    
//		2. Create a String and if the String is not empty perform the following: 
//		if the String has an odd number of characters and has 3 or more characters, 
//		print the character in the middle of the String.
		
	    String str1 = "Hello";
	    
	    int middle = str1.length()/2;
	    
	    if (!str1.isEmpty()) {
	    	
	    	if(str1.length()%2!=0 && str1.length()>=3){
	    		
	    		System.out.println(str1.charAt(middle));
	    		
	    	}
	    }
	}

}
