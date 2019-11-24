package com.class20_Access_Modifiers;

public class Tasks {
	

	public static void main(String[] args) {
		
		Tasks task = new Tasks(); 

//Task 1 
		
		String str = "Anna";

		String result = task.reverseString("Syntax");
		
		System.out.println(result);

//Task 2
		
		boolean result2 = task.isPalindrome(str);
		
		System.out.println("Is \"" + str + "\" Palindrome? " + result2);	
	
//Task 3
		
		String[] strArray = task.arrayOfWords("What a beautiful day is today!");
		System.out.println("The length of the array is: " + strArray.length);
		
		for( String word : strArray) {
			
			System.out.println(word);
		}
	}
	
	/////////////////////////////////////////
	
// Task 1 method
	
//	 	Create a method that will take 1 parameter as a String and return reversed String. 
//		Method should be visibly only within same package.

	public String reverString (String param) {  // string olsun diyor Stringle basla, sonra reverString diyor reveString dedik
	
		String result = "";

		char[] charArray = param.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			
			result += charArray[i];
		}

		return result;
	}

//Task 2 method

//		Create a method that will take a String and return whether String is palindrome or not. 
//			Method should be available to all classes within your projects.


	public boolean isPalindrome(String param) {
		
		boolean result = false;

		String reverse = reverseString(param);

		if (param.equalsIgnoreCase(reverse)) {
			
			result = true;
			
		} else {
			
			result = false;
		}

		return result;
	}

//Task 3 method

//			Create a method that will take a string and return an array of words from that string. 
//			Method should be available only within same class.
			
		private String reverseString(String param) {
			
	return null;
}



public  String [] arrayOfWords(String sentence) {
	
//long way		String[] stringArray = sentence.split(" ");
	
	return sentence.split(" ");
	
	
	
	
}



}
