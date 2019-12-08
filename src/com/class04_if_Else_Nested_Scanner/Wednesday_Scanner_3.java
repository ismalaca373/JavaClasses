package com.class04_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Wednesday_Scanner_3 {



	public static void main(String[] args) {
	
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Enter in First Number");
		
		int fnum = scan.nextInt();
		
		System.out.println("Enter in Operator Number");
		
		
		String operator = scan.next(); // eger bir symbol varsa next kullan. yoksa alttaki cumleyle popup yapiyor
		
		
		System.out.println("Enter in Second Number");
		
		int num2=scan.nextInt();
		
		
		if(operator.equals("+")) {
			
			System.out.println(fnum+num2);
			
			
		}else if (operator.equals("-")) {
			
			System.out.println(fnum-num2);
			
		}else if (operator.equals("/")) {
			System.out.println(fnum/num2);
			
		}else if (operator.equals("*")) {
			System.out.println(fnum*num2);
		
		}else {
			
			System.out.println("Invalid operato or number entered");
		}
		
		System.out.println("");

		
	}
	

}
