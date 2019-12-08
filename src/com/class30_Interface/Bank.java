package com.class30_Interface;

public interface Bank { // interface 1
	
	void haveChecking();
	
	void haveSavings();
	
}

interface Trustable{   // interface 2
	
	void trust();
	
	
}

class Finance { // class olusturabilirsin
	
	public void financing(){
		
		System.out.println("Financial trnasactions must happen");
	}

}
		// boa extends yapar finance oda butun inheritanslere

class BOA extends Finance implements Bank,Trustable{ // you can implement multiple intefacec 

	@Override
	public void haveChecking() {

		System.out.println("BOA has checking account");
	}

	@Override
	public void haveSavings() {

		System.out.println("Boa has savings account");
	}

	@Override
	public void trust() {

		System.out.println("You can trust BOA");
	}
}

class CapitalOne extends Finance implements Bank, Trustable{

	@Override
	public void haveChecking() {

		System.out.println("Capital has checking account");
		
	}

	@Override
	public void haveSavings() {

		System.out.println("Capital has savings account");
	}

	@Override
	public void trust() {

		System.out.println("You can trust BOA");
		
	}
	
}

