package com.class21_Variable_Cesitleri;

public class Students {
	
	public String studentName;
	
	public int studentId;
	
	public static int numberOfStudent;
	
	

	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.studentName= "ali";
		s1.studentId = 345;
		s1.numberOfStudent++;   // ogrenci sayisini toplayip arttitryor
	
		
		Students s2 = new Students();
		s2.studentName= "Veli";
		s2.studentId = 345;
		s2.numberOfStudent++;
		
		Students s3 = new Students();
		s3.studentName= "Cemal";
		s3.studentId = 345;
		s3.numberOfStudent++;
		
		Students s4 = new Students();
		s4.studentName= "Asim";
		s4.studentId = 345;
		s4.numberOfStudent++;
		
		System.out.println("Total number student of student is :" + Students.numberOfStudent);
		

}}
