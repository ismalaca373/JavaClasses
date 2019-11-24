package com.class22_Variables;

public class Local_Variable {

//	- local    methodun icindeki varible, it is avaible only during execution,  calss ve method icin de ayni
//	 local methodda var
	
	
	public static void main(String[] args) {
		
		
		Local_Variable obj = new Local_Variable();                // burda objti alttaki method icine cagiramazsin
		
		obj.sayName();
		
		obj.createEMail("John", "Smith", "outlook");    // bu variable bu methoda ait.
		
//		System.out.println(userEmail); bu calismaz burda cunku calisti methodun icine gitti.
		
	}
////////////////////////////////////////////////////////////////

//** Local variable
	
	void sayName() {
		
		String myName ="John";
		
		System.out.println(myName);
		
//		System.out.println(obj);// wont be accessible
	}
	
	
	String createEMail(String name, String lastName, String email) {
		
		String userEmail = name+lastName+ "@"+ email+ ".com"; // burdaki methoda ait. this is local variable 
		
		return userEmail;
	}
	


/////////////////////////


//**instance varibale	
	
//	asagidakiler instanse bunlarin altinda istedigin kadar object olustur asagidakileri onun icinde kullna 
//	bunlar degismez.
	
	String name;  // no starting word
	String lastName;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}