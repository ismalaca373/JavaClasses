package com.class21_Variable_Cesitleri; // class21 deki studentla baglantili

// command shif o basarsan ototmatik import eder


import com.class20_Access_Modifiers.*; // * clasin icindeki her methodu kullanima acar

public class School { // studentla baglantili

	public static void main(String[] args) {
		
		Student.school = "Good Morning School"; // static 

		Student student1 = new Student();
		
		student1.studentName = "Eric";
		
		student1.GPA = 3.95;
		
		Student.school = "Syntax"; // when you change bundan sonra hepsi degisir
		
		int hours =7;
		
		student1.displaInfo(); 
		
		student1.study(hours);
		
System.out.println("**************");
		
		Student student2 = new Student();
		
		student2.studentName = "Eric";
		
		student2.GPA = 4;
		
		Student.school = "Mintax";
		
		student2.study(3);
		
	}

}
