package com.class3_If_else;

public class C_Double_Comparison {

	public static void main(String[] args) {

		double num8 = 100;
		double num9 = 60;

		if (num8 > num9) {
			System.out.println("Double value " + num8 + " is larger than " + num9);

		} else {

			System.out.println("\"Double value " + num8 + " is less than " + num9);

		}
		System.out.println("****************");
		
		
///////////////////////////////////////////////
		
		
		int num1 = 99;
		int num2 = 100;

		if (num1 == num2) {
			System.out.println("Number are equal");
		} else {
			System.out.println("Number are not equel");

		}

		System.out.println("******************");
		
///////////////////////////////////////////////
		
		boolean val = true;

		if (val) { // arka planda burda compoler check val==true. if conditionda herzaman ne
					// yazarsan onu true ile karsilastiriyor. boolean ne yazarsan onu true ile
					// karsilastiiirr yazmasanda

			System.out.println("Hello");

		} else {

			System.out.println("bye");
		}

		System.out.println("******************************");
		
		
///////////////////////////////////////////////
		
		
		boolean isRain = true;

		if (isRain) {
			System.out.println("i will take an ambrelle");
		} else {
			System.out.println("i go for a walk");
		}

		System.out.println("******************************");
		
		
///////////////////////////////////////////////
		
		int num5 = 100;
		int num6 = 99;
		if (num5 > num6) {

			System.out.println("Num1 is larger than num2");

		} else if (num5 == num6) { // else if for ikinci condition icin //burda ikinci bir condition yazdik

			System.out.println("num1 is equal num2");

		} else { // ektra condititon eklersen herzaman en son else olur

			System.out.println("num1 is smaller then num2");
		}

		System.out.println("******************************");
		
		
		
//////////////////////////////////////////
		
		
		int day = 3;
		if (day == 1) {

			System.out.println("Today is Monday.I have to go to work");
		} else if (day == 2) {

			System.out.println("Today is Thuesday. I have SDLC class");
		} else if (day == 3) {

			System.out.println("Today is Wedensday. I have a Java class");

		} else { // butun optionlardan sonra else yazabilirsin
			System.out.println("sleep all day");
		}
		// command+ shit+f  yazdigin kodlari guzellestiriyor

		System.out.println("I am done with if statement");

	}

}
