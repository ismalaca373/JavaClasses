package com.class12_String_Manupilation;

public class Egzirsayz {
	public static void main(String[] args) {

		String str2 = "It is very hot today";

		System.out.println("Is this string starts with " + str2.startsWith("It"));
		System.out.println("Is this string starts with " + str2.startsWith("It", 1));
		System.out.println("Is this string starts with " + str2.startsWith("It ", 0));
		
		System.out.println();
		
		System.out.println("Is this string ends with " + str2.endsWith("today"));
		System.out.println("Is this string ends with " + str2.endsWith("class"));
		
		System.out.println();
		
		System.out.println("Is this method is empty " + str2.isEmpty());
		
		
		String strEmpty = "";
		
		System.out.println("Is this method is empty " + strEmpty.isEmpty());
		
		if (strEmpty.isEmpty()) {
			
			System.err.println("This is empty String");
			
		} else {
			
			System.out.println("This is not empty String");
		}
		
		
		if (str2.isEmpty()) {
			
			System.err.println("This is empty String");
			
		} else {
			
			System.out.println("This is not empty String");
		}
		
		System.out.println();
		
///////////////////////////////////////////
		
		String sen = "The sun has burst the sky\r\n" + "Because I love you\r\n" + "And the river its banks.";
		System.out.println(sen);

		System.out.println();

		String sen1 = "Hello";
		String sen2 = "World";

		System.out.println(sen1 + " " + sen2);
		System.out.println(sen1.concat(" " + sen2));

		System.out.println();

		String sen3 = "People";

		System.out.println(sen1.concat(" " + sen2).concat(" " + sen3));

		System.out.println();
		String str4 = "How are you? ";

		System.out.println("______"+ str4.trim());

		System.out.println();
		String str5 = "We might be done early today.";
		System.out.println(str5.charAt(7)); // t

		System.out.println(str5.charAt(20)); // l
		System.out.println(str5.indexOf('l')); // 20

		System.out.println();

		// starts after 6 or from index
		System.out.println(str5.indexOf('e', 6)); 

		System.out.println();
		
		
		for (int i = 0; i < str5.length(); i++) {
			
			//for (int j = i + 1; j < str5.length(); j++) {
			
				System.out.println(str5.indexOf('e', i));
			//}
		}

	}
}
