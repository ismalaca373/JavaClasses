package com.class12_String_Manupilation;

public class Wednesday {
	 
	 public static void main(String[] args) {
		 
		 // String is a class has methods
		 
		 String str = "Hello";  
		 
		 // bunlari degistir sonuclar degissin
		  
		System.out.println(str.length());   // 5
		
		System.out.println(str);  // hello
		
		System.out.println(str.toLowerCase()); // hello
		 
		System.out.println(str.toUpperCase()); //HELLO
		
		System.out.println(str.substring(4)); // 5inci indexten oncesini atiyor ve geri kaalni yaziyor
		
		String c = (" merhaba arkadas "); // basta sonda bosluk var
		
		System.out.println("bas ve sonundaki bosluk gittimi"+c.trim()); // yok bastaki sondaki boslugu alir
		
		char result = str.charAt(0); // char kullanabilirsin bura sadece. you can not concanate it
		System.out.println(result); // H gelir index 0 dakini getiriyor. degistir dene
		
		System.out.println(str.indexOf('l')); // hangi indexte oldugunu verir
		
		String d = "klmhjn";
		
		System.out.println(d.indexOf("h", 4)); // start looking after 4th letter demek burdaki yazim
		
		System.out.println(d.indexOf("p")); // -1 cikar harf yoksa 
		
		//bunlari birbirine baglayabilrsin. lowercase yapip bosluklari keser ilk harfini verirsin
		
		
		
		System.out.println(str.equals("hello")); // false gelir boolean
		
		System.out.println(str.equalsIgnoreCase("hello"));  // true gelir
		
		System.out.println(str.contains("ll")); // true  
		
		System.out.println(str.startsWith("H" )); // true
		
		System.out.println(str.startsWith("ll", 2)); //true   ("ll", 2)) burda 2nci indexten ll ile mi basliyor diyor 
		
		System.out.println(str.endsWith("r" )); // false
		
		String str2=" "; // kapali olursa bos olur burda bosluk var dolu yani
		System.out.println("Empty ? "+ str2.isEmpty()); // true
		
		String str4 = str.concat(" ").concat("World ");   //??????????????????/
				
		System.out.println(str4);
		
		
		
		
	}

}
