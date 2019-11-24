package com.class21_Variable_Cesitleri;

public class Hom_119 {
	
//	Complete method with the following specs:
//
//		Returns: an integer
//		Method Name: addTwo
//		 Parameters: 
//		An integer called "x"
//		An integer called "y"
//
//		Have the method do an addition function with the two parameters, makes sure output is 25. also make sure you are passing 2 arguments when you calling the method.
//
//		Output:
//		25
	
	public static int addTwo(int x,int y ) {
		
		int z = x+y;
		
		return z;
	}

	
	public static void main(String[] args) {
		
		Hom_119 a = new Hom_119();
		
		int b= a.addTwo(10, 15);
		
		System.out.println(b);
		
	}

}


//		int addTwo(int x,int y){
//		
//		return x+y;
//		}
//
//		public static void main(String[] args){

// 		Main main=new Main();

//		System.out.println(main.addTwo(20,5)); //should be 7
//}
//}