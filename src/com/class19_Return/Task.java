package com.class19_Return;

public class Task {
	
// Task 1
	
	//Create a method createEmail(). Based on provided users name, lastName and email type, your method
	//should return complete email Address. Example: johnsnow@gmail.com or johnsnow@yahoo.com*

	String createEmail(String userName, String lastName, String emailType) {
		
		String eMail = userName + lastName + "@"+ emailType+ ".com";
		
	return eMail;
		
	}
	
	
// Task 2	
	
	//Write a method to return whether given number is prime or not?
	
	
// Task 3
	
	//	Create  class Student that will have a method getGrade. 
	//	Your method should accept the score of a student and return a grade:
	//	score > 90 - A
	//	score >80 - B
	//	score >70 - C
	//	score > 50 - D
	//	anything else - F
	
	
	public static void main(String[] args) {
		
		
//Task 1
		
		Task obj = new Task();
		
		String eMail = obj.createEmail("Ali", "Yilmaz", "gmail");
				
				System.out.println(eMail.toLowerCase());
				
//Task 2
				
//Task 3

		}
		
}
