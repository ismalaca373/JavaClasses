package com.class19_Return;

public class AllMethods { //  Method_With_Return_Value baglantili
	
	// create methods to return value of sum //sub //sum //mult //div //largest //odd or even
	
////////////////////////////////////////////
	
// method to return number is even or odd

	boolean evenOdd (int number) {

		boolean isOdd;

		if (number % 2 == 0) {

			isOdd = true;

		}else {

			isOdd = false;

		}
		return isOdd;
	}	

//////////////////////////

	int findLargest(int num1, int num2) {  // void iken retun kullnamiyoruz bundan dolayi voidi int yap bastaki

		int largest;

		if (num1>num2) {

			largest =num1;
			
		}else {

			largest=num2;
		}
		return largest;
	}

//////////////////////////////


	int sum(int num1,int num2) {

		int sum = num1+num2;

		return sum;

	}

///////////////////////

	int sub(int num1, int num2) {

		int sub = num1-num2;

		return sub;

	}

/////////////////////

	int div (int num1, int num2) {

		int div = num1/num2;

		return div;
	}

//////////////////

	int mult(int num1, int num2) {

		int mult = num1*num2;

		return mult;
	}
	
///////////////////////////

// create method will take a week day number and 
// return a weekday name

	String weekDayName(int weekDay) {

		String weekDayName;

		switch (weekDay) {

		case 1:

			weekDayName = "Mon";
			break;

		case 2:

			weekDayName = "Thu";
			break;	

		case 3:

			weekDayName = "Wed";
			break;

		default:

			weekDayName = "Unknown";

		}
		return weekDayName;
	
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		
		
		AllMethods obj = new AllMethods();
		
		
		boolean odd = obj.evenOdd(300); // burda boolen odd = ob.... diyebilrisin return dedik
		
		System.out.println("is number odd? " + odd);
		
		System.out.println();
		
		//////////////////////
		
		int large = obj.findLargest(300, 500);
		
		System.out.println("largest number is " + large);
		
		System.out.println();
		
		///////////////////////
		
		int top = obj.sum(300, 500);
		
		System.out.println("toplam is " + top);
		
		System.out.println();
		
		///////////////////////
		
		int cik = obj.sub(500, 400);
		
		System.out.println("kalan is " + cik);
		
		System.out.println();
		
		///////////////////////
		
		int bol = obj.div(60, 30);
		
		System.out.println("bolum is " + bol);
		
		System.out.println();
		
		//////////////////////
		
		int carp = obj.mult(300, 500);
		
		System.out.println("carpim is " + carp);
		System.out.println();
		
//////////////////////////////////////
		
		System.out.println("Week days---------");
		
		String day = obj.weekDayName(3);
		
		if (day.equals("Wed") || day.equals("Mon")){
			
			System.out.println("I am learning Java");
		}else {
			
			System.out.println("I am free");
		}

	}
}
	
	

	
