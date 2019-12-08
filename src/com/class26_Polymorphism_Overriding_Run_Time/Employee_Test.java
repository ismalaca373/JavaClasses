package com.class26_Polymorphism_Overriding_Run_Time;

public class Employee_Test {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.salary = 80000;
		
		emp.getPaid();
		
		
		Full_Time ft = new Full_Time();
		
		ft.salary = 90000;
		ft.bonus = 10000;
		ft.getPaid();
		
		

	}

}
