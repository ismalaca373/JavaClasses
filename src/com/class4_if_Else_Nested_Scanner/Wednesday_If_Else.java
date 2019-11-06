package com.class4_if_Else_Nested_Scanner;

public class Wednesday_If_Else {

	public static void main(String[] args) {

		/*
		 * // if (condition) { //codes
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		boolean isRaining = false; // is mi oyle verirsinki soru gibi cevap vermesi kolay olur
									// burdaki gibi
		if (isRaining) {

			System.out.println("I will take the class online");

		} else {

			System.out.println("I wil go to class");

		}

		/////////////////////////////////////////

		/*
		 * i am creating my schedule it it is 7 I study Java otherwise if it is 8 I
		 * study SDLC otherwise if it ( I do my homework otherwise it is not my stufy
		 * time
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println("**********************");

		int time = 9;

		if (time == 7) { // 3 durumu if ile yazabilirsin ama bu uc durumun disinda ne olur
							// derse en son else yazarsin

			System.out.println("I will stiufy java");
		} else if (time == 8) {

			System.out.println("I will study SDLC");
		} else if (time == 9) {

			System.out.println("I will do my homework");
		} else {

			System.out.println("it is not my time");
		}

		System.out.println("**********************");

		/*
		 * i wan to eat if i have money ilk condition if reatauren is near me ikinci
		 * condition
		 * 
		 * i will eat
		 * 
		 * otherwise i willnnot eat ou
		 * 
		 * 
		 */ // nested if

		boolean hasMoney = true; // birinci if yanlissa ikinciye bakmiyor bile else gidiyor
		boolean isRestNear = true;

		if (!hasMoney) {
			// alttakilerin nereye ait olduguna bakmak isterseniz braketlere tikla ve esini
			// bul. arasindaysa onundur

			if (isRestNear) {

				System.out.println("I  I will eat in the restaurant ");

			} else {

				System.out.println("Can not walk long distance");
			}

		}

		
//		System.out.println("**********************");
//
//		boolean isSelected = true;
//
//		if (isSelected) {
//			System.out.println("enter text to text box");
//
//		} else {
//
//			System.out.println("click on the check");
//		}
//
//		System.out.println("**********************");
//
//		// find if the number is 2 digit, 3 digit or 4 digit?
//		
//		int num=3000;
//		
//		if (num<100 && num >9) {
//			System.out.println("2 digit");
//		}
//			
//			
//		 else if (num<1000 && num >=100) {
//			
//				
//				System.out.println("3 digit");
//			
//			
//		}else if (num<10000 && num>999) {
//			System.out.println("4 digit");
//			
//		}else {
//			
//			System.out.println("sdasdadsad");
//		}
		
	}
}

