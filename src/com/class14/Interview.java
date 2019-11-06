package com.class14;

public class Interview {

	public static void main(String[] args) {
		
//
//	int x = 10;
//    int y = 5;
//    x = x + y;
//    y = x - y;
//    x = x - y;
//    System.out.println("After swaping:"
//                       + " x = " + x + ", y = " + y);
//		
    String a = "Love";
    String b = "You";
    System.out.println("Before swap: " + a + " " + b);
    a = a + b; // love you
    b = a.substring(0, a.length() - b.length());
    a = a.substring(b.length());
    System.out.println("After : " + a + " " + b);
//    
}

//	2.Write a java program to find the second largest number in the array?
//			Maximum and minimum number in the array?
	

    //Write a java program to find the second largest number in the array? 
    //Maximum and minimum number in the array?
	
//    int[] a= {1,25,6,98,7,545,56};
//    int max=a[0];
//    int secMax=a[0];
//    
//    for(int i=0;i<a.length;i++) {
//        if(max<a[i]) {
//            secMax=max;
//            max=a[i];
//            
//        }else if(secMax<a[i]){
//            secMax=a[i];
//        }
//        
//    }System.out.println(secMax);
//    System.out.println();
//    
//    //max number
//    for(int i=0;i<a.length;i++) {
//        if(max<a[i]) {
//            
//            max=a[i];
//            }
//    }System.out.println(max);
//    System.out.println();
//    
//    //max
//            for(int i=0;i<a.length;i++) {
//        if(max>a[i]) {
//            secMax=max;
//            max=a[i];
//            
//        }else if(secMax>a[i]){
//            secMax=a[i];
//        }
//        
//    }System.out.println(secMax);
//    System.out.println();
//    
//    //min
//            for(int i=0;i<a.length;i++) {
//                if(max>a[i]) {
//                    
//                    max=a[i];
//                    }
//            }System.out.println(max);
//            System.out.println();


// 3  Find out how many alpha characters
//    present in a string?
	

	
	        // Find out how many alpha characters present in a string?
	        String str="Harun abi cok caliskan bir insandir#$@%365746#^$&5";
	        System.out.println(str.length());
	        
	        
	        System.out.println("*****************");
	        
	        
	        String str1=str.replaceAll(" ", "");
	        System.out.println(str1.length());
	        
	        
	        

 ////////////////////////////////////////////////
           
//    4     How to find out the part of the string from a string? What is substring? Find
//		    number of words in string?
	        
	     // How to find out the part of the string from a string?
	        //What is substring?
	        
	        String str="Harun abi cok caliskan bir insandir";
	        System.out.println(str.substring(0,5));
	        System.out.println("********************");
	        
	        //Find number of words in string?
	        String[] str1=str.split(" ");
	        //System.out.println(str1);
//	      for(int i=0;i<str1.length;i++) {
//	          System.out.println(str1[i]);
//	      }
	        System.out.println("********************");
	        System.out.println(str1.length);
	    
	        
	

}

	
	

