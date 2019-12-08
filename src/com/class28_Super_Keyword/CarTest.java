package com.class28_Super_Keyword;

public class CarTest {
	
public static void main (String[]args) {
		
		Tesla tesla = new Tesla ();

		//I am non argument constructor obj cagirdiginda otomatic olarak super(), gelir ve yazdirir
		//I am child
		
		Tesla tesla1 = new Tesla (true); // parametreli const cagir dedik. oda parametreli super cagirdi.ve sonra kendini yazdirdi
		tesla1.display(); 

		
		
		
}
}