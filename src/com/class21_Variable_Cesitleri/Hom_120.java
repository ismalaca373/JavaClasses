package com.class21_Variable_Cesitleri;

public class Hom_120 {

//	Write method with following specification:
//
//		Returns: a double
//		Name: negate
//		Parameters: a double called "num"
//
//		AND THEN  in method body write the logic to 
//  	return the given number in opposite value. 
//  	(if given number is positive result will be negative or vice versa )
//
//		Have the output be positive 2 with your input being -2.
//
//		Examples:
//		Given Value 4     Returned Value -4
//		Given Value -10     Returned Value 10
//		Given Value 1     Returned Value -1
//
//
//		Output:
//		2.0
	
	
	public static double negate (double num) {
		
		double z;
		
		if (num == -num) {
			
			z= num;
			
		}else {
			
			z=num;
		}
			
		
		return z;
	}
	
	public static void main(String[] args) {

		Hom_120 a = new Hom_120();
	
		double asd = a.negate(2);
		
		System.out.println(asd);
	}

}

//	static double negate (double num){
//		
//		return (num - num ) + (-num);
//	}
//	
//	public static void main(String[] args){
//		
//		System.out.println(negate(-2));
//	}
//}
