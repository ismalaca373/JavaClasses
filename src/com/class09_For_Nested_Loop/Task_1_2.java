package com.class09_For_Nested_Loop;

import java.util.Scanner;

//import java.util.Scanner;

public class Task_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// task 1
//		Write a program that reads a range of integers 
//		(start and end point), provided by a user and 
//		then from that range prints the sum of the even and odd integers.
//
//
//			Scanner sc = new Scanner (System.in);
//			
//		    System.out.print("Enter a start number: ");   
//		    int s=sc.nextInt();
//		    System.out.print("Enter a end number: ");
//		    int e=sc.nextInt();
//		    
//		    int sumEven=0;
//		    int sumOdd=0;
//		    
//		    
//		    for( int i=s; i<=e ;i++) {
//		    
//		      if(i%2==0) {    
//		        
//		      sumEven=sumEven+i;
//		      
//		    
//		    }else {
//		        sumOdd=sumOdd+i;
//		            
//		         }
//		    }    
//		     System.out.println(sumEven);     //eger for conditionuna endnumber < start num yazarsan 0 0 print eder condition tutmadigindan
//		     System.out.println(sumOdd);
//	

////////// 2. yol	
		
//		Scanner scan=new Scanner(System.in);
//		
//        System.out.println("Enter start number");
//        
//        int FirstNumber=scan.nextInt();
//        int SecondNumber=scan.nextInt();
//        int start = 0;
//        int end = 0;
//        
//        if(FirstNumber < SecondNumber)		// if else eger user starta kucuk number girerse diye yazmis. kucuk girerse conditionu degistirp for loopa hazir hale getiriyor
//        {
//            start = FirstNumber;
//            end = SecondNumber;
//        }
//        else
//        {
//            start = SecondNumber;
//            end = FirstNumber;
//        }
//        int even=0;
//        int odd=0;
//        
//        
//        for(int i=start;i<=end;i++)
//        {
//            if(i%2==0)
//            {
//                even=even+i;
//        }
//            else
//            {
//                odd=odd+i;
//            }
//            
//        }System.out.println(even);
//        System.out.println(odd);
//    

////////////////////////////////////////		
		
// task 2
//		Write a guessing game where the user has to guess a secret number between 1 and 20.
//		After every guess input, the program tells the user whether their number was too large or too small.
//		The program will keep asking the user to enter the number until he finds the correct number.
//		When the correct answer is found the system should display “Congratulations!!. You got it!”

//		Scanner scan = new Scanner(System.in);
//		
//		for (int i = 1; i <= 20; i++) {
//			
//			System.out.println("please enter a number between 1-20 to win big suprize");
//			
//			int num = scan.nextInt();
//			
//			if (num == 7) {
//				
//				System.out.println("Congratulations!!! You got it");
//				
//				break;
//				
//			} else if (num > 7) {
//				
//				System.out.println("sorry the number is too big");
//				
//			} else {
//				
//				System.out.println("sorry the number is too small");
//			}
//
//		}

//		
}}
