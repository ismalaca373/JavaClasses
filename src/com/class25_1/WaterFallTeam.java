package com.class25_1;

import com.class25_Multi_Inheritance.Employee;

public class WaterFallTeam extends Employee{
	
	public static void Main(String[]args) {
	
	
	
	WaterFallTeam team = new WaterFallTeam();
	
	team.companyName = "Syntax";
// 	team.salary =  ulasamazsin default sadece kendi pakcgeinda 
	
	team.employeeId = 102; // accesing protected in differetn packetc by inheritance
	
	

}}
