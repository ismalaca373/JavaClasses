package com.class26_Polymorphism_Overriding_Run_Time;

public class Web_Driver_Test {
	
	

	public static void main(String[] args) {
		
		ChromeDrive chrome = new ChromeDrive();
				
		chrome.refresh();
		chrome.open();
		
		FireFox fire = new FireFox(); 
		
		fire.refresh();
		fire.open();
			
		// creating an object of child class and given reference to the super class
		
		WebDriver  driver = new FireFox();
		
		driver.open();
		
		driver.refresh();
		// no access to child spessific class trough Parent type
		// 
		
		
	}

}
