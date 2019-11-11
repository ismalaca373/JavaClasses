package com.class7_Loops;

public class Hom_59_60_61_62_63_64_65_66 {

	public static void main(String[] args) {
		
		
//		For you to do: 
//			Create a for loop that prints out even numbers from 10 to 0
//
//			Must not include the number 0 in the output 
//
//			Output:
//			10
//			8
//			6
//			4
//			2

		    
		/////////////////////////
	
//		int a= 10;
//		
//	    for(a=10;a>0;a-=2)
//	    	
//	    System.out.println(a);
//	    
	    
   ///////////////////////////////////////////     
		
		
        	
//        	for(int i =10; i>=1;i--) {
//    			
//    			if(i%2==0) 
//    			
//    			System.out.println(i);
			
		
	////////////////////////////////////	
		
	//	60.
//		
//		Create a for loop that prints out even numbers from 2 to 14
//
//		Increment by 1 ONLY
//
//		Must include the number 14 in the output 
//
//		Output:  
//		2
//		4
//		6
//		8
//		10
//		12
//		14
		
		
		
//		 int a = 0;
//		  
//			for(a=0;a<=14;a+=2){
//
//			 System.out.println(a);
//	    }
//			
			/////////////////////////////////////
			
			//61
//			
//			Create a for loop that prints out odd numbers from 5 to 22
//
//			Increment by 1 example(i++)
//
//			Must not include the number 22 in the output 
//
//			Output:  
//			5
//			7
//			9
//			11
//			13
//			15
//			17
//			19
//			21
			
//			int a = 22;
//			for(int i=5; i<a; i++) {
//				
//				if(i%2==0) { 
//				continue;
//			
//				}System.out.println(i);
//	  } 
    
////////////////////////////////////////
		
		//63
		
//		Write a program that use for loop to prints multiples of 3 between 1 and 20 on one line.
//
//		Must not include the number 20 in the output 
//
//		Hint :
//		3*1=3 
//		3*2=6
//		3*3=9
//		3*4=12
//		3*5=15
//		3*6=18
//
//		Output:
//		3 6 9 12 15 18
	
		
		
//		
//		public static void main(String[] args) {
//		    
//		    
//			
//			for(int i=3; i<20; i++ ) {
//				
//				if(i%3!=0) 
//					continue;
//				
//				System.out.println(i);
//				
//			}
			
////////////////////////////////////////////////			
			
//			63
			
//		Write a program that greets students in the morning using a for loop.
//
//		Hint: You have 20 students to be greeted (print "Good Morning!" 20 times)
		
		
//		for(int i =0; i<20;i++) {
//			
//			System.out.println("Good Morning!");
//		}
//		
	/////////////////////////////////////////	
//		
//		64
//		Write a program that prints the string "It is year: " and the years between 2010 and 2019.
//
//		Must not include year 2019 in the output 
//
//		Hint: 
//
//		It is year 2011
//		It is year 2012
//		It is year 2013
//		.
//		.
//		.
//		It is year 2018
//
//		Output:
//		It is year 2011
//		It is year 2012
//		It is year 2013
		
	
//		for(int i=2011; i<2019;i++ ) {
//			
//		
//			System.out.println("It is year:"+ i );
//		}

//////////////////////////////////
		
	//	65
		
//		Write a program that prints the string "Hey, it is year: " and the years between 2011 and 2019.
//
//		Must include year 2019 in the output 
//
//		Output:
//		Hey, it is year:
//		2011
//		Hey, it is year:
//		2012
//		Hey, it is year:

//		for(int i=2011; i<2019;i++ ) {
//			
//		
//			System.out.println("Hey, it is year:\n"+ i );
//		}

	//////////////////////////////
		
		// 66
		
//		Write a program that prints the count down from 10 up to 1 and string "Happy New Year!".
		
//		for (int i=10; i<=10; i--) {
//			
//			 System.out.println(i);
//			 
//			if(i==0) {
//			break;
//			
//  }
//}System.out.println("Happy New Year!");

//////////////////////////////////////////

//2nd way

for(int i = 10; i>=0; i--){
    
    if(i==0){
            System.out.println("Happy New Year!");

    }else{
      
            System.out.println(i);

}}}}