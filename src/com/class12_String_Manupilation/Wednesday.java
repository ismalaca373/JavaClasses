package com.class12_String_Manupilation;

public class Wednesday {
	 
	 public static void main(String[] args) {
		 
	// String is a class has methods
//		 
//		 String str = "Hello";  
//		 
//	// bunlari degistir sonuclar degissin
//		  
//		System.out.println(str.length());   // 5
//		
//		System.out.println(str);  // hello
//		
//		System.out.println(str.toLowerCase()); // hello
//		 
//		System.out.println(str.toUpperCase()); //HELLO
//		
//		System.out.println(str.substring(4)); // 5inci indexten oncesini atiyor ve geri kaalni yaziyor
//		
//		String c = (" merhaba arkadas "); // basta sonda bosluk var
//		
//		System.out.println("bas ve sonundaki bosluk gittimi"+c.trim()); // yok bastaki sondaki boslugu alir
//		
//		char result = str.charAt(0); // char kullanabilirsin bura sadece. you can not concanate it
//		System.out.println(result); // H gelir index 0 dakini getiriyor. degistir dene
//		
//		System.out.println(str.indexOf('l')); // hangi indexte oldugunu verir
//		
//		String d = "klmhjn";
//		
//		System.out.println(d.indexOf("h", 4)); // start looking after 4th letter demek burdaki yazim
//		
//		System.out.println(d.indexOf("p")); // -1 cikar harf yoksa 
//		
//	//bunlari birbirine baglayabilrsin. lowercase yapip bosluklari keser ilk harfini verirsin
//		
		
		
//		System.out.println(str.equals("hello")); // false gelir boolean
//		
//		System.out.println(str.equalsIgnoreCase("hello"));  // true gelir
//		
//		System.out.println(str.contains("ll")); // true  
//		
//		System.out.println(str.startsWith("H" )); // true
//		
//		System.out.println(str.startsWith("ll", 2)); //true   ("ll", 2)) burda 2nci indexten ll ile mi basliyor diyor 
//		
//		System.out.println(str.endsWith("r" )); // false
//		
//		String str2=" "; // kapali olursa bos olur burda bosluk var dolu yani
//		System.out.println("Empty ? "+ str2.isEmpty()); // true
//		
//		String str4 = str.concat(" ").concat("World ");   //??????????????????/
//				
//		System.out.println(str4);
		
////////////////////////////////////////////////
		
		// substring
		 
//		 String longStr = "I am very happy today, because today is not Monday.";
//		 
//		 String anotherStr = longStr.substring(10);
//		 
//		 System.out.println(anotherStr);
//		                
//		 anotherStr = longStr.substring(10, 15);
//		 
//		 System.out.println(anotherStr);
		        
//		 System.out.println(longStr.substring(20, 10));
		 
//       longStr.substring(10, 56);
		   
//////////////////////////////////////////////////
		        
//		        
//		//	empty is string so karakterde da kullanamazsin
//		 
//		 // relcaseFirst("today", "tomorrow")  // cumlede iki tane today varsa sadece birinciyi degistirir
//		 
//		 // two chars da sadce charlari kullanabilrisin stringle mix edemzsin
//		 
//		// replaceAll da qotation icie de tek karakter yazabiliriz
//		 
//		 // replaceAll([aA], "e") dersen buyuk kucuk hepsini e yapar
//		 // ([a-z],"123" dersen degistirir, 
//		 // [a-z ,] = a-z bosluk ve kamayi replace eder.
//		 // [a-zA-Z] dersen buyuk kucuk hepsini
//		 // [^a-z] ^ dersen a-z haric hepsini move
//		 
//	        String longStr = "I Am very happy today, because today is not Monday.";
//	        String anotherStr = longStr.replace('a', 'e');
//	        System.out.println(anotherStr); // I Am very heppy todey, beceuse todey is not Mondey.
//	        
//	        anotherStr = longStr.replace(',', ';');
//	        System.out.println(anotherStr); // I Am very happy today; because today is not Monday.
//	        
//	        anotherStr = longStr.replace('a', 'e').replace('A', 'E');
//	        System.out.println(anotherStr); // I Em very heppy todey, beceuse todey is not Mondey.
//	        
//	        System.out.println("-----------------");
//	        
//	        anotherStr = longStr.replace("today", "tomorrow");
//	        System.out.println(anotherStr);
//	        anotherStr = longStr.replace(",", "");
//	        System.out.println(anotherStr); //  I Am very happy tomorrow, because tomorrow is not Monday.
//	        
//	        System.out.println("-----------------");
//	        
//	        anotherStr = longStr.replaceAll("a", "e");
//	        System.out.println(anotherStr); // I Am very happy today because today is not Monday.
//	        
//	        anotherStr = longStr.replaceAll("today", "tomorrow");
//	        System.out.println(anotherStr); // I Am very happy tomorrow, because tomorrow is not Monday.
//	        
//	        anotherStr = longStr.replaceAll("[aA]", "e");
//	        System.out.println(anotherStr); // I em very heppy todey, beceuse todey is not Mondey.
//	        
//	        anotherStr = longStr.replaceAll("[a-zA-Z ,.]", "1");
//	        System.out.println(anotherStr); //  111111111111111111111111111111111111111111111111111
//	        
//	        longStr = "!{}#%$#!@!{}";
//	        anotherStr = longStr.replaceAll("[!{}@#$%]", "");
//	        System.out.println(anotherStr); // bosluk cikar
//	        
//	        longStr = "my social security is 232-34-3423";
//	        anotherStr = longStr.replaceAll("[0-9]", "*");
//	        System.out.println(anotherStr); //  my social security is ***-**-****
//	        
//	        longStr = "I want to learn Java. And I want to learn more! Is this OK?";
//	        anotherStr = longStr.replaceAll("[^a-zA-Z]", "+");
//	        System.out.println(longStr); // I want to learn Java. And I want to learn more! Is this OK?
//	        
//	        System.out.println(anotherStr); // I+want+to+learn+Java++And+I+want+to+learn+more++Is+this+OK+
//	        
//	        System.out.println("-----------------");
//	        
//	        longStr = "I Am very happy today, because today is not Monday.";
//	        anotherStr = longStr.replaceFirst("today", "tomorrow");
//	        
//	        System.out.println(longStr); // I Am very happy today, because today is not Monday.
//	        System.out.println(anotherStr); // I Am very happy tomorrow, because today is not Monday.
	
/////////////////////////////////////////////
//	        
//		        String longStr = "I Am very happy today, " + "because today is not Monday.";
//		         
//		        char[] charArray = longStr.toCharArray();  // char array e donusturuyoruz
//		        
//		        System.out.println(longStr.length()); //51
//		        System.out.println(charArray.length); // 51
//		        
//		        for (int i = 0; i < charArray.length; i++) {
//		        	
//		            System.out.print(charArray[i]);
//		        }
//		        System.out.println();
//		        
////		      for (int i = charArray.length - 1; i >= 0; i--) {
////		          System.out.print(charArray[i]);
////		      }
//		        // ya da boyle print eebilirsin
//		        for (char element : charArray) {
//		            System.out.print(element);
//		        }
//		        
//		        System.out.println();
//		        System.out.println("-->\tReplace \"a\" with \"e\"");
		        
//****		    // \t = tab key 
//		        // \"and\" bu da iki seyin arasina almak demek "and" yazar
//		        // \n = nextline demek
		        
		        
/////////////////////////////////////////

//****		       
//		      String anotherStr = "";
//		        
//		      anotherStr += 'A';
//		      anotherStr += 'B';
//		      anotherStr += 'C';
//		      
//		      System.out.println(anotherStr); // ABC cikar
		      
		       
////////////////////////////////////////////////		            
		            
//		        
//		        System.out.println(anotherStr);                            ????????????????????????????????????????????
//		        
//		        System.out.println("-->\nReplace \",\" with \";\" ");
//		        anotherStr = "";
//		        for (int i = 0; i < charArray.length; i++) {
//		            char element = charArray[i];
//		            if (element == ',') {
//		                anotherStr += ';';
//		            } else {
//		                anotherStr += element;
//		            }
//		        }
//		        System.out.println(anotherStr);
		    

//////////////////////////////////////////////////
		 
//			
//			String longStr = "I Am very happy today, because today is not Monday.";
//			
//	        String[] stringArray = longStr.split("today"); 
//	        
//	        System.out.println(stringArray.length); // 3 cikar
	        
	        // her todayde bolunce kac tane olur diyor 
			// vevap 3 element var diyor bosluk seseydin 
			// 10 element var der yazardi. kestigi yerlerden sayiyor elementleri
	        
	        
//	        for (int i = 0; i < stringArray.length; i++) {
//	        	
//	            if (i == stringArray.length - 1) {
//	            	
//	                System.out.print(stringArray[i]);
//	                
//	            } else {
//	            	
//	                System.out.print(stringArray[i] + "today");
//	            }
//	        }
//	        
//	        System.out.println();
//second way
	        
//	        System.out.println("---For each---");
//	        
//	        for (String str : stringArray) {
//	            System.out.print(str);
//	        }
//	        System.out.println();
//	        System.out.println("-----------------");
//	        
//	        stringArray = longStr.split(" "); // her boslukta split et dedik. 
//	        System.out.println(stringArray.length); // asagidaki cikar
//	        I
//	        Am
//	        very
//	        happy
//	        today,
//	        because
//	        today
//	        is
//	        not
//	        Monday.
	        
//	        for (String str: stringArray) {
//	            System.out.println(str);
//	        }
//	        
//	        System.out.println();
//	        System.out.println("-----------------");
//	        
//	        longStr = "I like number 3 and 4 because 7 ate 9.";
//	        
//	        stringArray = longStr.split("[0-9]");
//	        
//	        for (String str : stringArray) {
	        	
//	            System.out.println(str);  // asagidaki cikar
//      	 }   
//	            I like number 
//	            and 
//	            because 
//	            ate 
//	           .

	        

/////////////////////////////////////////	        
	        
	       
	
	 }
		 
}
