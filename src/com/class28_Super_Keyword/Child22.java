package com.class28_Super_Keyword;

public class Child22 extends Parent {

	
String name = "James";
	
	public void callName() {
		
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
public static void main(String[] args) {

		
		Child22 obj = new Child22();
		
		obj.callName();
	
}
}
