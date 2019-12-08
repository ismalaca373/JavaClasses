package com.class05_Logical_Operator_Switch_Case;

public class A_Logical_Operator_And {

	public static void main(String[] args) {

		// II, &&, !
//		
//		&& Operator : Both conditions are true
//		|| Operator : Only one condition is true
//		! Operator : Both conditions are true. But, status is inverted as false//
//
//
//		
//
//m=5
//n=2	
//		In this program, operators (&&, || and !) are used to perform logical operations on the given expressions.
//		&& operator – “if clause” becomes true only when both conditions (m>n and m! =0) is true. Else, it becomes false.
//		|| Operator – “if clause” becomes true when any one of the condition (o>p || p!=20) is true. It becomes false when none of the condition is true.
//		! Operator  – It is used to reverses the state of the operand.
//		If the conditions (m>n && m!=0) is true, true (1) is returned. This value is inverted by “!” operator.
//		So, “! (m>n and m! =0)” returns false (0).
//		
		/*
		 * if num is between 1-10 -> this number is small 
		 * if num is between 10-100 -.
		 * this number is medium 
		 * if num is between 100-1000 -> this number is large any
		 * other number -> is out of the range
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		//

		int num = 1202;			// conditionali saglamasi icin ikisininde dogru olmasi lazim

		if (num > 1 && num < 10) {
			System.out.println("it is small");

		}else if (num>=10 && num<100) {
			
			System.out.println("it is medium");
		}else if (num>=100 && num<1000) {
			
			System.out.println("it is large");
		}else {
			System.out.println("it is out of the range");
		}
		

	}
}
