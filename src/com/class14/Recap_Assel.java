package com.class14;

public class Recap_Assel{

	public static void main(String[] args) {
		
		
		// String is Class is defind already. has many methods
		
		// 2 ways to create a string
		
		String str = "Hello";
		
		String str1 = new String ("hello"); // second way to creating a String object
		
		System.out.println(str + str1 );
		
//		1. find the number of characters inside the String // int
		
//		.length()
		
		int length = str.length(); //5 
		
		System.out.println(length);
		
//		2. case conversation methods/functions
		
//		.toLowerCase()
		
		System.out.println(str.toLowerCase()); // hello reassigned etmdik bak yazdirdik
		
		System.out.println(str); // hello  onun icin burda hello cikti yine
		
//		3.toUpperCase()
		
		str = str.toLowerCase().toUpperCase(); // loveri uppora degistirip strye yukledik
		System.out.println(str); //HELLO
		
//		4. verify if there is the string is Empty // Boolean
		
//		.isEmpty()
		
		String myString=""; // empty value
		
		boolean isEmpty = myString.isEmpty();
		
		System.out.println(isEmpty); // true
		
		String myString1 = null;  // no value here even empty value. it is = String myString1
		
		System.out.println(myString.isEmpty()); // true
		
//		5. how to verify existence of characters in the string // boolean
		
//		.contains()
		
		String a = "Hi Students";
		
		boolean exist = a.contains("Students");
		
		System.out.println(exist);
		
//		6. neyle basladigini bulma // boolean
		
		System.out.println(a.startsWith("Goood"));
		
//		7. neyle bittigini bulma
		
		System.out.println(a.endsWith("Students")); // true
		
//		8.  retuns char values in the string // character gelir
	
		// .
 		String asd = "Syntax Tech";
		
		char letters = asd.charAt(5);
		
		System.out.println(letters); 
															// 18 gercek uzunlugu -1 ondan diyoruz
		System.out.println(asd.charAt(asd.length()-1)); // direct lenngth dersen out of bond hatasi verir cunku sifirdan basliyot
		
	//	9. get substring from a string
		
	//	.substring()
		
		String sub = asd.substring(0,4); // 
		
		System.out.println(sub);
		
		String sub2 = asd.substring(7);
		
		System.out.println();
		
		
//		10. replace
		
//		.replace()
		
		String zxc = "Java classes at Syntax are soso";
		
		
		zxc= zxc.replace("are", "is");
		System.out.println(zxc);
		
		
//		11.replaceAll()
		
		zxc.replaceAll("[^a-zA-Z0-9]", "");
		
		
//		12. split  // 
		
		String aa = "Java classes at Syntax are soso";
	
		
		String[]array = aa.split("a");
		
		System.out.println(array.length); // 7 verir
		
		
		
		
		
		
		
		
		
	
//				//.replace
//				String str="your Syntax Technologies. is your place to study";
//				System.out.println(str.replace('y', 'i'));
//				
//				System.out.println("**************");
//				System.out.println(str.replace("your", "My"));
//				
//				System.out.println("**************");
//		​
//				//.replaceAll
//				String str2="Video provides a powerful way to help you prove your point. "
//						+ "When you click Online Video, you can paste in the embed "
//						+ "code for the video you want to add. ";
//				System.out.println(str2.replaceAll("to(.*)", ""));
//				
//				System.out.println("**************");
//		​
//				String str3="23423Hell3049o^&*^&*$%$";
//				System.out.println(str3.replaceAll("[0-9]", ""));
//				System.out.println(str3.replaceAll("[^a-zA-Z^]", ""));
//				
//				System.out.println("**************");
//				System.out.println(str2.replaceFirst(" ", ""));
//				
//				
			}
		}
