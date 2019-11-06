package com.class4_if_Else_Nested_Scanner;

public class B_Nested_If_More {

	public static void main(String[] args) {

		/*
		 * soru 1 check age, if age is less than 16--> you are too young to drive
		 * otherwise --> you are eligible to drive & we will check 
		 * soru:2 if you are
		 * older than 18 you can get driver license and if not you can get driver permit
		 * 
		 * 
		 */
		int age = 35; // degistir bak // 16 deyince if false oluyor sonra else in icindeki if ve lese
						// calsitiriyor

		if (age < 16) {
			System.out.println("you are too young to drive");

		} else { // soruya bakarsan burda else inicine yazdik soru 2yi.

			System.out.println("you are eleigibel to drive");

			if (age >= 18) {

				System.out.println("you can get driver license");
			} else {
				System.out.println("you need your parents to drive");
			}
		}

		System.out.println("******************");

		/*
		 * write a program a boolean value of whether user has diploma or not has a
		 * diploma, say conguralation otherwise say get a degree sonra gpa cehk et 3,5
		 * dan buyukse eligible for scholarsh degilse degil
		 * 
		 * 
		 */

		boolean diploma = true; // false la dene

		double gpa = 3.5;

		if (diploma) {

			System.out.println("congratulations");

			if (gpa >= 3.5) {

				System.out.println("you are eligible for scholarship");
			} else {

				System.out.println("you should have studied harder");
			}

		} else {

			System.out.println("you should get a degree");
		}
		System.out.println("****************");

		/*
		 * create java prog store value margage rate and morgage price 
		 * if rate is higher
		 * than 4.5 user will buy a house otherwise user will not buy a house ones user
		 * decides to buy a house 
		 * if preice is larger than 200000 user will take a loan
		 * othervise user will pay chash
		 * 
		 * 
		 * 
		 */

		double rate = 4.5;
		int price = 200000;

		if (rate >= 4.5) { // bu deger true degilse elsein altina yaziyoruz

			System.out.println("not buy a house");

		} else {

			System.out.println("buy"); /// eger rate 4.5dan fazlyasa true veriyor demek else ve altini zaten
										/// dusunmuyorum

			if (price > 200000) {
				System.out.println("take a loan");

			} else {

				System.out.println("pay cash");
			}
		}
	}

}
