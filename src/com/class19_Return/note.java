package com.class19_Return;

public class note {

//			1. Method without return any value Uses void keyword
//				Void keyword allows to create methods which do not return a value.
//							 
//			2. Method with return values. Uses return keyword
//					
//			The return type is the must in a method, you can't declare the method without it's return type.
//				● If the return type is void it means method will not return any value.
//				● The return statement should be the last statement in the method.
//				● You can't declare more than one return statement in one method.
//				● The data type of the returned value must match the type of the method's
//					declared return value.
//				● You can call the method with its name only.
//				● The method must have the body.
//				● The method can accept the n number of parameters.
//				● If the method has n number of parameter then it's the must to pass all
//					parameter in method body while calling the method in program code.
//				● The variables declared inside the method body are called the local
//					variable.
//				● Methods access modifiers define the access level of method.
//	
	
	
		
	public static void main(String[] args) {
		
		note obj1 = new note();
		
		int large = obj1.findLargest(20, 40);
		
		System.out.println("largest number is " + large);

	}
	
//////////////////
	
	int findLargest(int num1, int num2) {  // void iken retun kullnamiyoruz bundan dolayi voidi int yap bastaki
		
		int largest;
		
		if (num1>num2) {
			
			largest =num1;
		}else {
			
			largest=num2;
		}
		return largest;

}
	
}
