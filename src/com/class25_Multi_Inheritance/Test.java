package com.class25_Multi_Inheritance;

public class Test {
	
	public static void main(String[] args) {
		
	System.out.println("Creating  an object of Employee class ");	
		
		Employee emp = new Employee();
		emp.salary = 70000;
		
		Employee.companyName = "Syntax";
		
		emp.work();
		emp.getPaid();
		
		System.out.println("Creating an onbject of  ");
		
		////////////////////
		
		ScrumTeam sm = new ScrumTeam();
		
		sm.salary= 90000;
		Employee.companyName = "Syntax";
		sm.getPaid();
		sm.work();
		sm.artifacts = "Product backlog, BurnDown";
		
		Developer dev = new Developer();
		
		dev.salary = 130000;
		
		dev.getPaid();
		dev.work();
		
		Employee.companyName = "Syntax";
		
		System.out.println("I am developer");
	
	}

}
