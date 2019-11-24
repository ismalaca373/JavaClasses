package com.class20_Access_Modifiers;

public class Canada { // usa ile baglantili
	
	public static void main(String[] args) {
		
		USA us1 = new USA();
		
		System.out.println("Access from Canada class"); 

		System.out.println(us1.mainState);  // USA classda public oldugundan getirebilirsin
		
		System.out.println(us1.school); // ayni paketteyse gorursun
												
//		System.out.println(us1.capitalCity); //capitalCity is private so cagiramazsin
		
		
	}
}
