package com.class7_Loops;

public class F_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for (initialization, condition, increment/decrement)
		//      syso print
		
		
			
			
			
			// say good morning 5 times
	        // initialize; test condition; increment
	        
//			
//	        for(int i=0; i<=4; i++) {
//	            System.out.println("Good morning");
//	        }
//	    
		
		
		////////////////////////////
		
		
////	        //print numbers from 1-10
//	        
//	        for(int i=1; i<=10; i++) {
//	        	System.out.println(i);   
//	        	
//	        }
//	      
//	//////////////////////////        
////	        
//	        //print 10-1
//	        for(int i=10; i>=1; i--) {
//	        	System.out.println(i);   
//	        }
//	        
	    /////////////////////////
	        
	      //  print numbers from 1 to 100 1 line with soace
	        
//	        for(int i=1; i<=100;i++) {
//	        	
//	        	System.out.print(i);
//	        }
//	        
	       // print numbers from 100 to 1
//	        
//	       for(int i = 100 ;i>=1; i--) {
//	    	   
//	    	   System.out.println(i);
//	       }
	        
	       //print even numbers 20 to 2 way
		
		for(int i =20; i>=1;i--) {
			
			if(i%2==0) 
			
			System.out.println(i);
		}
		
//		2nd way
		
//		for (int i =20; i>=1;i-=2) {
//			
//			System.out.println(i);
//		}
//			
	//////////////////////////////////
		
		//print odd numbers 20-50
//		
//		for (int i=20; i<=50;i++) {
//			
//			if(i%2==1)
//				
//			System.out.println(i);
//		}
///////////////////////////////////////
		
		// what it he output
		
//		int sum=0;				
//		for (int i=1; i>=5; i++) {
//			sum=sum+1;  // burda ortadaki kondution dogruysa increment yapmadan bunu isleme koyuyor going iside the loop  ve increment yapiyor
//			
//		}
//			System.out.println(sum);
//			//System.out.println();
//		
//////////////////////////////////
		
//		int sumAll=0;
//		 
//		for(int i=0; i<=20; i+=5) {       // 5 sonra 10 sonra 15 sonra 20 == 50
//			sumAll=sumAll+i; // o iken icerdeki dogru asagidakini calistir sonra increment yap 5 oluyor yeniden i=5 simdi 20 den kucuk islemi yap 10 sonra increment oldu 10 sonra devam     
//			
//			
//		}
//		System.out.println(sumAll);
	
///////////////////////////////////////
//			
//		int total=2;
//		
//		for (int y=1; y<=3; y++) {
//			
//			total=total*y;   // 2=2*1; 4=2*2;
//			
////		}
////			System.out.println(total);
//			
////////////////////////////////////
////			
////			write tato find the sum of even and odd numbers
////			from range 1 to 20
////			expecting 2 outputs
////			sum for odd num=
////			sum or even num=
////			
//			
//			int sumEven=0;
//			int sumOdd=0;
//			
//		for (int i=1; i<=20; i++) {
//			
//			if (i%2==0) {
//				
//				sumEven=sumEven+i;
//				
//			}else {
//				
//				sumOdd = sumOdd+i;
//			}
//			
//			//syso buraya yazarsan 20 kere yazar printi 20 kere yazar cunku loop icinde disina koyman lazim
//		}
//		System.out.println("the total of all even numbers"+ sumEven);  
//		System.out.println("the total of all even numbers"+ sumOdd);
//
//		///////////////////////////////////
//		
//		int x=0;
//		
//		   for(int even=0;even<=20;even+=2) {
//			   
//		       x=x+even;
//		       
//		   }    System.out.println(x);
//		   
//		int y=0;
//		
//		   for (int odd=1;odd<=19;odd+=2) {
//			   
//		       y=y+odd;
//		       
//		   }System.out.println(y);
//		   
//		   System.out.println(x+y);
//		   
	//////////////////////////
		   
//		   int sumEven=0;
//		   
//	        int sumOdd=0;
//	        
//	        for(int i=2;i<=20;i+=2) {
//	        	
//	            sumEven=sumEven+i;
//	        }
//	            System.out.println(sumEven);
//	            
//	            for(int i=1;i<=20;i+=2) {
//	            	
//	                sumOdd=sumOdd+i;
//	                }
//	            System.out.println(sumOdd);   
}}