package com.class21_Variable_Cesitleri;

public class Hom_122 {

//		Create a method with following specification: 
//
//		Return Type: boolean
//		Method Name: bothEven
//		Parameters:
//		an integer called "num1"
//		an integer called "num2"
//
//		Then write your logic for method that will return true if both num1 and num2 are even OR  Return false if one or both given numbers are not even
//
//		Examples:
//		bothEven(4,6) ==> true
//		bothEven(3,4) ==> false
//		bothEven(-1,1) ==> false
//
//		Output:
//		false
//	
	boolean bothEven (int num1, int num2){
		
		boolean result;
		
	if (num1%2==0 &&  num2%2==0) {
		
		result = true;
		
	}else {
		
		result = false;
	}
		
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Hom_122 sonuc = new Hom_122();
		
		boolean b = sonuc.bothEven(7, 6);
		
		System.out.println(b);
		
		
	}

}

//		public static boolean  bothEven(int num1,int num2){
//		
//		if(num1%2==0 && num2%2==0){

//	 	 return true;

//	 	} else{

//		   return  false;

//		 }

//		}
//
//		public static void main(String[] args){

//		System.out.println(bothEven(5,6)); //should be false    // heralde emthod static oldugundan ve ayni sayfada oldugundan problem olmuyor
//}
//}
