package com.class26_Polymorphism_Overriding_Run_Time;

public class Polimorphism_Run_Time {
	
	
	// methodla alakali // child class icinde ayni isim ve ayni parameter olmali parent classla
	
	// without inheiritance method overriding mumkun degil
	
	// Run time polymorphism or dynamic binding or Late binding
	
	// employee classtan gelen getPaid SOP in icinde degisiklik yapman. plus extra bonus almani yazdiriyorsun.
	
	// child classta ayni method icinde sen logic olarak ve syso ya biseyler yazabilirsin
	
	// method adi ve aparmetreleri ayni olmali degistiremezsin onlari
	
	// returnle calisiyor. return type da ayni olmali
	
	// public double chargeFee() { // ayn isim ve parameterlar olmali, return typta ayni olmali,  logic degistirebilirsin
							// chargeFee() == buna method signuture diyorlar
//		double fee;    
//		
//		if (money<1000) {
//			
//			fee = money*0.05;
//			
//		}else {
//			fee=0;
//			
//		}
//		return fee; // return type ta ayni olmali deouble yani
//	
//	// child classta overriding yaparken access modifierlari incrice yaparsin ama dicrease yapamazsin.

	// private or protected lari public yaparsin ama publici protected yapamazsin
	
//     Card card2 = new Amex();  her class bir non primitive times. 
	
// 		card2.creditlimit(); // card classin methodunu yaziyorsun ama amexmethodu calisiyor. amex in kendi methodu gelmez mesela burda.
	
	
//	yukarda Card sinifindaki objeyle method cagiriyorsun ama amex classin methodu geliyor
//	buna run time polimorfizim deniyor. caslistir deyince JVM nereye gidecegini biliyor.
// method once amexicindekine bakiyor. orda degismisse onu yazdiriyor. degismemizse ana sinifin icindekini yazdiriyor.
	
	
	// 
	
	
	
	
	
	
	

	public static void main(String[] args) {
		

			
	}

}
