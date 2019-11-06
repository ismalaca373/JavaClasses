package com.class10_Array;

public class A_Task_1_2_3 {

	public static void main(String[] args) {
		

//		Task 1
//		Create an array of chars and store grades into it: A,B,C,D,E,F. 
//		Then print a grade B (use 2 different ways of creating an array).
		
		//first way;
		
//		char []grades = { 'A','B','C','D','E','F'};
		
		//second way
		
//		char[] grades = new char[6];
//		
//		grades [0] = 'A';
//		grades [1] = 'B';
//		grades [2] = 'C';
//		grades [3] = 'D';
//		grades [4] = 'E';
//		grades [5] = 'F';
		
//		System.out.println(grades[1]);
		
//////////////////////////////////////
		
		
		
//////////////////////////////////
		
//		task 2
		
//		Create an array of names and store all names of your group. 
//		Then print your name from that array. (use 2 different ways of creating an array).

//		String [] names = { "Ali", "Veli", "Mustafa"};   // 0 dan baslar saymaya
//		
//		System.out.println(names[2]);
		
		//2nd way
		
//		String [] adlar = new String[3];
//		
//		adlar[0] = "Ali";
//		adlar[1] = "Veli";
//		adlar[2] = "Mustafa";
//		
//		System.out.println(adlar[2]);
	
/////////////////////////////
	
	
		
///////////////////////////////////////
	
//		task 3
//		Create an array of words: Java, Saturday, day, coding, is. 
//		Print the following sentence using element of array: “Saturday is Java coding Day”. 

		String[] words = {"java", "Saturday", "Day", "coding", "is"};
		
		System.out.println(words[1]+" "+ words[4]+" "+words[0]+" "+ words[3]+ " "+ words[2]+".");

		
	}

}
