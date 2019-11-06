package com.class10_Array;

public class C_Reverse_Array {

	public static void main(String[] args) {

		// the maximum index of the array is one less than the length!!! cunku 0 dan basliyor

		String[] animals = { "dog", "bird", "cat" };

		for (int i = 0; i < animals.length; i++) {

			System.out.println(animals[i]);

		}

//		dog
//		bird
//		cat

		////////////

		for (int i = animals.length - 1; i >= 0; i--) { // int i yi length e bagladik ve 1 cikardik cunku

			System.out.println(animals[i]);

//			cat
//			bird
//			dog

		}
		
		
		
//		find the maximum number in the  array
		
//we check the numbers one by one ve en buyugunu buluyoruz
		
		
		
		
		
	}

}
