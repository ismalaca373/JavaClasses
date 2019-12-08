package com.class26_Polymorphism_Overriding_Run_Time;

public class Bank {   //child class asagida
	
	double money;
	
	public double chargeFee() {
		
		double fee = 0;
		
		if (money<1000) {
			
			fee = money*0.1;
			
		}else {
			
			fee=0;
			
		}
		return fee;  // return type da ayni olmai
	}
}

class PNC extends Bank {  // diger class bu ama only one class can be public 
	
	@Override // optinanal to verify that you are actually 
	
	public double chargeFee() { // ayni ismi kullaniyor ama asagidaki logic degistirebilirsin
	  
		double fee;
		
		if (money<1000) {
			
			fee = money*0.05;
			
		}else {
			fee=0;
			
		}
		return fee;
	
	}
}

