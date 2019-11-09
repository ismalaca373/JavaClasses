package com.class12_String_Manupilation;

public class H_String_Equality {

	public static void main(String[] args) {
	

		// using string litteral ilk 2 si gibi farkli variable nameler ayni objecte assign edilebiliyor. 
		// new String ile her defasinda yeni bir memory aciyor istenmeyen birsey ve degistirilemiyor 
		// bunlar birbirime esti mi sorusunun cevabi hayir memoryde hepsi farkli objecler
		
		// == bu sadece esit mi diye bakar 
		// .equals icindekinin esit olup olmadigina bakar bunu kullanalim 
		
		String str = "Hello";  
		
		String str1 = "Hello"; // bu heap memoryde ayni objeye farkli variabllari esitliyebiliyorsun
		
		String str2 = new String("Hello");
		
		String str3 = new String("Hello"); // bu heap memoryde her defasinda ayri yer kapliyor
		
		
// 1 .	.equals()  true or flase
	
		
		System.out.println(str.equals(str1)); // true
		System.out.println(str.equals(str2)); // true
		
		System.out.println("--------");
		
		System.out.println(str==str1); // true
		
		System.out.println(str==str2); // false  yukardaki aciklamalara gore bu false cikiyor
		
		
	}

}
