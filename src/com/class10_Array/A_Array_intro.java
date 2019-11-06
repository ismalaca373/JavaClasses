package com.class10_Array;

import java.util.Scanner;

public class A_Array_intro {

	public static void main(String[] args) {
		

	
// **** Intro
		
//		array is a collection of simillar typ of data ve her data olabilir ama ayni olacak.
//		array is container objective 

//		eger we store more values than actual size  we ill get runtime execution ??????

//		int a = 1; // sadece bir tane value tutuyor

		// int[]b = 10,20,30; // bu rakamlarin hepsine element diyoruz ve b[1], b[2]
		// diye isimlendiriyoruz.

		// burda 3 elemnts store ediyoruz.

		// any type can be stored
		
		// icineki islemi bir for da yazdirmayi ikinci forda yapmali
		
		
		
	
// **** Declaration and Assigning
		
//   first way

//		int [] b; // declare an array --> preferred way
//		int c []; // bua da olur
//		
//		b = new int[4]; // icine 4 element koyacagiz
//
		
//   second way
		
//		
//		int [] array = new int[4]; // bu yontemi kullan
//		
//		array[0]=10;  // elementlerde herzaman 0 dan baslar saymaya
//		array[1]=20;
//		array[2]=30;
//		array[3]=40;
//		
//		System.out.println(array[2]);

		// 2nd way;

// **	String[] array = { "Winter", "Fall", "Summer", "Spring" }; // , ile ayiriyoruz icerdekileri dikkat

//		System.out.println("I was born in " + array[2]);
		
		/////////////////////////////////
		
// **	int[] arr = {2,3,5,7};
	
//		for (int g=0; g<arr.length;g++) {
//			
//			System.out.println(arr[g]);
//		}
//
		
// **** How to print all values from an Array
		
		//to print all values from an array we can use advanced for loop using following syntax		
		
		// String[] names= {"Anna", "John", "Sasha", "Alex"};
		
		// for (String name: names)
		
		//   {System.out.println(name);}
		
		
// **	int[] arr = {2,3,5,7};  
	
//		for (int array:arr) {         // reassigning arr to array // this advance for loop 
//			
//			System.out.println(array);
//		}
		
//////////////////////////////////////////
		

// **	// lets create an array that will store classes

//		String []classes=new String[4];
//		
//		classes[0]="Java";		
//		classes[1]="SDLC";
//		classes[2]="Manual Testing";
//		classes[3]="GIT";
//		
//		//today we have java class
//		
//		System.out.println("Today we have "+ classes[0]+"class");
		
		
// ****	int y[],n; // dikkat burda y array olur n ise int n gibi olur array degil
		
///////////////////////////////////////////

// ****	int[] nums = new int[3]; // 3 tane deyip 4 koyamazsin. // adsagiya dorduncuyu eklersin problem olmaz ama yazdir dersen yazdirmaz

//		nums[0] = 1;
//		nums[1] = 2;
//		nums[2] = 3;    
//
//		// how to change 1 to 100
//
//		nums[0] = 100; // nums[0] artik 100
//
//		System.out.println(nums[0]);
//		
	
////////////////////////////////////////
		
// **		int[]numbers = new int [4];   	
		
//		numbers[1]= 100;
//		numbers[3]=	200;
//		
//		System.out.println(numbers[0]); // numbers[0] yazdir deyince 0 verir. // arrayde 4 tane olacak dedigin icin [0]in yerini 0 olarak tutuyor. yazdirabilirsin.
		// type double yaparsan 0.0 olur.

/////////////////////////////////////////

// **	int[] nums = new int[5];
		
//		nums [0]=12;
//		nums [1]=13;
//		nums [2]=14;   // nums[0]=14 dersen length yine 5 olur ve yazdir dediginde bunun degerini yazar 0 in degil cunku yeniden deger vermis oldun.
//		nums [3]=15;
//		
//		System.out.println(nums.length); // arrayin uzunlugunu yaz dedin. 5 tane koyacagim dedigin icin 5 olur declare etmezse o degeri 0 goruyor


// **** To find the length of an array, we can use the following syntax:
		
//			arrayName.length();
//			
//			
//			String[] names=new String[5];
		
//			names[0]="John";
//			names[1]="Anna";
//			names[2]="Michael";
//			names[3]="Donald";
//			names[4]="Omar";
		
//			System.out.println(names.length); output->5
		
///////////////////////////////////
							// 0		// 1	// 2	// 3
// **	String[] array = { "Winter", "Fall", "Summer", "Spring" }; // , ile ayiriyoruz icerdekileri dikkat
//
//		System.out.println("I was born in " + array[2]);
//
//		int arraySize = array.lenght; 
//		
//		System.out.println(arraySize);
		
//////////////////////////////////////////
		
// ****	index o dan basladiginda loop kullanirken buna dikkat et
	
		// 0<=lenght -1
		//0< lenght
		//0<= lengh
		
//////////////////////////////////////////////////////////
		
// ****  how to print all values
		
//		To print all values from an array we can use advanced for loop using following syntaxfor
//		( type variable : array ) {System.out.println( variable );}String[] names= {"Anna", "John", "Sasha", "Alex"};
//		for (String name: names) {System.out.println(name);}

		
		
		
///////////////////////////////
		
// **** Scannerla array beraber
		
		        int[] arr=new int[3];
		        
		        Scanner scan=new Scanner(System.in);
		        
		        
		        for(int i=0;i<arr.length;i++) {
		            arr[i]=scan.nextInt();
		        }
		        
		        for(int i=0; i<arr.length;i++) {
		            System.out.println(arr[i]+" ");
		        }
		        
//////////////////////////////////////////////////		
		        
//		       
//				for(int[] is:array) {
//		            for (int is2:is) {
//		                System.out.print(is2+" ");
//		            }System.out.println();
//		        }
//		        
		    }
}
