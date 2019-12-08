package com.class22_Static_Variables;

public class Local_Variable {

//	- local variable methodun icindeki varible, it is avaible only during execution,  class ve method icin de ayni sey gecerli
//	 local method da var
	
		public static void main(String[] args) {
		
		Local_Variable obj = new Local_Variable();                // burda objecti alttaki method icinde cagiramazsin
		
		obj.sayName();
		
		String a = obj.createEMail("John", "Smith", "outlook");    // bu variable bu methoda ait.
		
		System.out.println(a);
		
//		System.out.println(userEmail); bu calismaz burda. main methoda ait degil. objeyle calisir ve methodun icine gider.
		
	}
////////////////////////////////////////////////////////////////

//** Local variable
	
	void sayName() {
		
		String myName ="John";
		
		System.out.println(myName);
		
//		System.out.println(obj);// wont be accessible
	}
	
	
	String createEMail(String name, String lastName, String email) {
		
		String userEmail = name+lastName+ "@"+ email+ ".com"; // burdaki methoda ait userEmail variabli. this is local variable 
		
		return userEmail;
	}
	

/////////////////////////


//**instance varibale	
	
//	asagidakiler instanse bunlarin altinda istedigin kadar object olustur asagidakileri onun icinde kullanabilirsin
//	bunlar degismez.
	
	String name;  // no starting word
	String lastName;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}