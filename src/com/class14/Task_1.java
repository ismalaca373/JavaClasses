package com.class14;

public class Task_1 {

	public static void main(String[] args) {
		
//	Task 1	Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		
		String str="     Today is java class!!!!!";
		System.out.println(str.trim().replaceAll(" ",""));
		
//		​
//	Task 2	Create a String that should be combination of letters,
//		numbers and special characters. Find out how many alpha characters are there in the String.
		
		
		String b=new String("&&$&^**^*kjvjvncn4243645,bfdsj^$&%^");
        String bNew= b.replaceAll("\\w", "");
        System.out.println(bNew.length());
        
        
        		
        String c="3235346Hel&*&^lo";
        String d=c.replaceAll("\\W","");
        System.out.println(d.length());
//		​
//	Task 3	You have a String a=”Is it saturday? Is it raining?
//		Do we have a Java Class today?” How would you find out how many sentences are in that String?
		
		
        String f="Is this Saturday? Is it raining? Do we have a class today?";
        String[] arr=f.split("\\?"); //
        System.out.println(arr.length);
		
		
	}

}
