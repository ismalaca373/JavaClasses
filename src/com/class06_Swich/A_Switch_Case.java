package com.class06_Swich;

public class A_Switch_Case {

	
	public static void main(String[]args) {
		
		/* checks only equality
		 *  or , and ve esitdegildir seyleriyle kullanamazsin
		 * limitiation
		 * strign manupilusyon ile lower upper yaparsin sannerla aldigini
		 * works with only only only byte, short, char, int, string // you can not use double, boolean, long vs
		 * no relational and logical operators kullnaamazsin
		 * dublicate cases are nto allowed
		 * data type of variable must be same
		 * Buda diger conditional durum
		 * swicth cade is a value base, if else is a 
	execute one statement from multiple conditions
	
			Else if ne yapıyorsa onu yapiyor aslında ve ondan daha hizli
			Bu daha sade ve readable
			Multipla actionsa bakıyor 
			sona yazilan Default da else ile ayni isi yapiyor
			Break yazarsan meatching olan bulunca daha asagiya gitmiyor
			
			icine if koyabilirsin veya nested yapabilirsin. tersi de olur
		 */
		
		// break stop out of the swich block. 
		// else gibi if there is no case match. last case 
		
		/*
		 * 7 weekdays if day==1--> Monday if day==2 --> Tuesday
		 */

		int day = 6;
		String weekDay;

		if (day == 1) {  // day==1
			weekDay = "Monday";					// else
		} else if (day == 2) {
			weekDay = "Tuesday";
		} else if (day == 3) {
			weekDay = "Wednesday";
		} else if (day == 4) {
			weekDay = "Thursday";
		} else if (day == 5) {
			weekDay = "Friday";
		} else if (day == 6) {
			weekDay = "Saturday";
		} else if (day == 7) {
			weekDay = "Sunday";
		} else {
			weekDay = "Invaid";
		}
		System.out.println(weekDay);

		day = 3;

		switch (day) {
		case 1:// day==1
			weekDay = "Monday";
			break;
		case 2:        			// : kullaniliyor dikkat et
			weekDay = "Tueday";
			break;
		case 3:
			weekDay = "Wednesday";
			break;                  //yazmassan asagi dogru devam eder cevabi bulsada sonra defoult yazar
		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
			break;
		case 6:
			weekDay = "Saturday";
			break;
		case 7: 
			weekDay = "Sunday";
			break;
		default:                 // sona koyulan else ile ayni
			weekDay = "Invaid";
		}
		System.out.println(weekDay);
	}
}



