package com.class25_Multi_Inheritance;

public class ScrumTeam extends Employee{ // test ve employee ile baglantili
	
	String artifacts;
	String ceremonies;
	
	void attendScrumMeetings() {
		
		System.out.println("I atend" + ceremonies);
	}
}