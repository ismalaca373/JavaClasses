package com.class20_Access_Modifiers;

class USA {  // canada ile baglantili
	
	
	private String capitalCity = "Washington DC";
	
	public String mainState = "New York";
	
	protected String school = "Syntax Technologies";
	
	public static void main(String[] args) {
		
		USA us = new USA();
		
		System.out.println("Access from inside USA class");
		
		System.out.println(us.mainState); // public zaten
		
		System.out.println(us.school); // ayni paketteyse gorursub
		
		System.out.println(us.capitalCity); // private burda yazar only same class
		
	}

}
