package com.class21_Variable_Cesitleri;

public class Employee {
	
	//notlara bakmalisin bunlar icin 
	//variable yada method static olunca ayni sinfin icinde direct cagirirsin ayri sinftaysa CLASS la cagirirsin. 
	
	static String CEO;
	
	String eID;
	
	int salary;
	
	public void dispayInfo() {
		
		System.out.println("Patron is "+ CEO + " eID is "+ eID + " and his slaary is " + salary);
	}
	
/////////////////////////////////////////////////////////

	public static void main(String[] args) {
	
	
	Employee eleman1 = new Employee();
	
	eleman1.eID = "Ibrahim";
	
	eleman1.salary =500;
	
	CEO = "asdddsad"; // ayni classta oldugunda direct cagirabilirsin.  eleman1.CEO da diyebilrsin calisir
	
	eleman1.dispayInfo();
	
	
	Employee eleman2 = new Employee();
	
	eleman2.eID = "Asim";
	
	eleman2.salary =300;
	
	CEO = "abd"; // CEO is static yani ben bu ismi degistirirsem sonrakiler bundan sonra bunla ayni olur.
							// ama eleman1 inkinin degismesini istiyorsan  bu line nin asagisina koymalisin. islem yukardan asagiya gidiyor
	eleman2.dispayInfo(); 
	
//	eleman1.CEO = "Ibo"; // buraya yazman lazim bunu degismesi icin
	
	
	}

}
