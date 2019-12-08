package com.class30_Interface;

public class DrivableTest {

	public static void main(String[] args) {

		Drivable obj = new Toyota();
		
		obj.drive();
		
//  	Drivable.DRIVE_FAST = false; // CE verir. FInal value can not be reassigned
		
		Toyota toyota = new Toyota();
		
		toyota.drive(); // 
		
		toyota.stop(); // cars dan geliyor.
		
		
		
		
	}
	
	
	

}
