package com.class12_String_Manupilation;

public class F_Replace_ReplaceAll_ {

	public static void main(String[] args) {
		

//****  // .replace() only accept int = numbers
		// biseyi/karakteri or kelime digerine degistirir
		//This method returns a new string resulting from replacing all 
		//occurrences of oldChar in this string with newChar.
		
//**
		String str = "Hello Dear, how are you, Have you been?";
		
		System.out.println(str.replace('n', 'z')); // n lkarakterini z ye ceviriri
		
		// daha fazla karacter varsa hepsini degistitir
		
		System.out.println(str.replace("Dear","Respected Ben"));
		
		
///////////////////////////////////////
		
//****
		// .replaceFirst() ise birden fazla varsa ilkni degisirir
		
//		String replaceFirstl(String regex, String replacement)Description: 
//			
//		The Java String replaceFirst() method replaces the first substring
//		'regex' found that matches the given argument substring 
//		(orregular expression) with the given replacement substring.
		
		
		System.out.println (str.replaceFirst("H", "ZZ")); // ilk H i ZZ yapar sadece
		
		String str6 = "Java says hello world. Java String tutorial";
		//Replace first occurrence of substring "Java" with "JAVA"
		String newStr = str6.replaceFirst("Java", "JAVA");
		//Replace first occurrence of substring "a" with "A"
		String regexResult = str6.replaceFirst("[a]", "A");
		System.out.println(newStr);
		System.out.println(regexResult);}
		
///////////////////////////////////////
		
		
//****	//regular expression ile replace all
		//This method replaces each substring of this string that 
		//matches the given regular expression with the given replacement.
		
		//public String replaceAll(String regex, String replacement) 
		// replaceAll ama bu karisik bir method dikkat!!!!!!!
		
		// inrterview question /   junlari ve numaralari verir bana numaralari ver der
		
//		A regular expression defines a search pattern for strings.
//		The search pattern can be anything from a simple character,
//		a fixed string or a complex expression containing special characters describing the pattern. 

//		[A-Z] will look for all character from A-Z in the string
//		[a-z] will look for all character from a-z in the string
//		[0-9] will look for all numbers from 0-9 in the string
//		[^abc] will look for any character except a, b, or c in the string
		
//**   
		String mix="3213Hello 89 World354545 *&***^&*^&*";
		
		System.out.println(mix.replaceAll("[0-9]", ""));
		
		 System.out.println(mix.replaceAll("[a-z]", ""));
		 
		  System.out.println(mix.replaceAll("[a-z A-Z]", ""));
		  
		   System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""))	;	
		
//**		
		String str3 = "12334Hel23454lo76432";
		
		System.out.println(str3.replaceAll("[0-9]", "")); 
		// Hello // regex icindeki 0 ile 9 arasindaki nolari cikar diyoruz geriye hello kaldi
		
		System.out.println(str3.replaceAll("[a-zA-Z]", "")); // sadecee numaralari yazar
					//123342345476432
		
		String str4 = "Hi45How*%$%^4565645";
		
		System.out.println("       ");

		// remove everything except text and numbers. find the characters demek
		
		System.out.println(str4.replaceAll ("[^a-zA-Z0-9]",""));  // ^ not demek burda, bunlarin sisinda kalani boslukla degistir diyor
																// bunlari cikarirsan karakterler kalir
		
		//Hi45How4565645
				
		
		System.out.println(str4.replaceAll ("\\w",""));	
		
 // *%$%^  //	bu da sadece chracterleri verir.
		
//****	 "[^a,e,i,o,u]","") will print only vowels
/////////////////////////////////////////
//		package com.class13;

		String str5="Today is our java class";
				
				System.out.println(str5.replace(" ", ""));
				System.out.println("***************");
				System.out.println(str5.replaceAll("\\s", ""));
				
				String doc="Video provides a powerful way to help you "
						+ "prove your point. When you click Online Video,"
						+ " you can paste in the embed code for the video you "
						+ "want to add. You can also type a keyword to search "
						+ "online for the video that best fits your document.";
				
				System.out.println(doc.toLowerCase().replace("video", "Audio"));
				System.out.println(doc.replaceAll("powerful(.*)", ""));
				
	
		​}
		}

