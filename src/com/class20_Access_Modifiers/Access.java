package com.class20_Access_Modifiers;



public class Access { // testle de baglantili
	
// 22 inci derste Aselin anlattiklari asagidakiler
	
//	4 type
	
//	1.private most restrected baslayip asagiya dogru. cogunlukla variablelarla. sadece ayni classta. ayni classtan public method ulasirsa baska yerlerden methodun sayesinde private variablelara da ulasabilirsin.
//	2.default sadece pakettekiler ulasabilir. 
//	3.protected sadece package  ve sublasslar. 
//	4.public less one  bu asagidakileirn hepsinde gozukur. methodlar cogunlukla public olur. yani yukardakileri ayni classta bir method icine koyarsan method kullanarak hepsine ulasabilirsin.
	
//	bunlari variable, methods, constructor, ve classlarda kullanabiliyorsun
	
//	SYNTAX for variables : access modifier(optinal), static(optional),  dataType, variablename
	
//  SYNTAX for methods : access modifier(optinal), static(optinal), returntype, methodname
	
// 	optionallari yazmassan compiler bisey demez
	
	
	public static String language = "Java";
	
	public static void hello() { // heryerden ulasilir
		
		System.out.println("hello");
	}
	
	
	protected static void hello1() { // bu ayni packagete ulasilir
		
		System.out.println("hello1");
	}
	

	static void hello2() {  // default ayni paket ve sub classlarda ulasabilrisin
		
		System.out.println("hello2");
	}

	private static void hello3() { // 
		
		System.out.println("hello3");
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
// accsess methodlari  dosyalarin ulasilabilir olmasi ya da olamamasi

// import com.class20.*; yildiz koyarsan o paketteki herseyi kullanabilirsin.

	
// variablelarinda access ine de karar verebilirsin.
	
//		public  String name:
//				String phone: 
//		private String SSN:
//		protected String birtday;
				

		   //everywhere
//public : can be seen and accessed from everywhere
			 //class icin sadece public ve default kullanirsin
		     // baska bir classdan/paketten object create etmek sitersen import etmen lazim. scanner gibi
	 		// methodlarida genelde public olur.
		
//			public void addd1() { // bun ornekler oylseine yazildi calsimiyor 
				
			//package
// default  :can be seen/accessed within package
	
 //          void add2(int num1, num2) {
		
           
           //package 
// protected: can be seen/accessed within packageans subclass
	
//			protected int add3() {
		

			// in class
// private: can be seen/accessed only with in this class
			// sen bile privetin icinde goremezsin hocanin orneginde var.
			
//			private int add4() {
		
	
}	
    
  
    
    
    
    