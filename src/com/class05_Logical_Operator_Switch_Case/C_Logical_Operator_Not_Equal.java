package com.class05_Logical_Operator_Switch_Case;

public class C_Logical_Operator_Not_Equal {

	public static void main(String[] args) {
		
		
		
		
		 // using ! we are reverting condition
		boolean isRain2=true;
		
		if (!isRain2) {
			System.out.println("Do not need an umbrella");
			
			
		}else {
			
			System.out.println("need it");
		}
		
		
		boolean b1=!true;
		boolean b2= !false;
		
		System.out.println(b1);
		System.out.println((b2));
		
		boolean traffic = false;   // bu tarz seylerde kullaniliyor
		
		if (!traffic) {   			//trafik false sa if !traffic false degilse diyor ki dogru ozaman on time yaziyor
			
			System.out.println("on time");
			
		}else {
			System.out.println("late");
		}
		
		boolean isRain=true;
		
		if (!isRain) {
		
		System.out.println("Take an umbrella");
		
		
		}else {
			
			System.out.println("dont take");
		}
		
		// lets compare 2 number using not operator // genelde bu islem icin not equal kullanilmaz yani
		int num1=10;
		int num2=10;             // normalde  if num1==num2 ise su else bu diyoruz 
		
		if (!(num1==num2)) {						// conditionda islem yapacaksan onu yeniden parantez icine alacaksin
			System.out.println("not equal");
		}else {
			System.out.println("equal");
		}
		 
		//if name is not marry or anna then you are not my siste
		
		String name = "Mary";
		String name2 = "July";
		//true or fo=ale -. true add not -->
		
		if (!(name.equals ("Mary") || name2.contentEquals("Anna"))){
			
			System.out.println("you are not my siste");
			
		}else 
				
				{
			
			System.out.println("you are my sister");
		}
		
		
		
		
	}

}
