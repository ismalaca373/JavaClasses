package com.class24_This_Keyword;

public class This {
	
	// current class ta kullanilir.
	// 1. this.variableName instance variabli isaret editor. bu diyor isntance variable. 
	// 2. this.method icin cagirabiliyorsun
	// 3. this() constructor cagirir. bir tane sadece
	//	3.1 ilk once bu yazilmali code icine sonra syso
	//	3.2 can not call more then one constructor
	// method icinde cagiramazsin constructor.
	// contractor icinde de ayni isimleri kullnanica belirleyici olmus oluyor
	// demezsen contructor icindekiiki seyde local olur.
	// differentiated your instance variable from local variable.
	// we can refer access current class 
	// you can use ti with constructor.
	// 
	
	
	String name, capital;
	
	int a, b ;
	
	///////////////////////////
	
	// 1.constractor 
	public This (String name, String capital) {
		
		this.name = name;   // ayni isim yazar ve this demezsen local variable olur ikiside 
		
// 		name = name; // boyle kalirsa  ikisi de lokal ve ayni sey olmus olur. calismaz
		
		this.capital = capital;
		
		System.out.println("Hellllooo");
	}	
	
///////////////////////		
	
	
	// 2.constractor 
	public This(int a, int b) {
		
		this.a = a;
		this.a = b;
	}
	
	public void sum(int a, int b) {
		
		System.out.println("The sum of local parameters is " + (a+b)); 	// boyle local cagirmis olursun
		System.out.println("The sum of local parameters is " + (this.a+this.b)); // boyle instance cagirir.
		
	}
	
	/////////////////////////
	
	
	public void sayA() {
		
		System.out.println(a);
	}
	
	public void sayB() {
		
		System.out.println(b);
	}
	
	// method icinde method  kullanma
	  
	public void sayAandB() {   // method icinde method kullanabilirsin  // static diyemezsin. static icnde static cagirabilirsin
	
	this.sayA(); // burda da methodu belirledi. we can call, we cannot create a method insed method.
	
	sayB();    //compiler adds this automatically ---> this.sayB();
	 
}
//////////////////////////////////////////////
	
	
	public static void main(String[] args) {
		
		This ornek = new This ("ali", "ankara");  // 1.ci constractor
		
		
		
		This obj = new This (10,10); // 2,ci constractor
		
		obj.sum(5, 10);
		
		
		
		This obj1 = new This (20,30);
		obj1.sum(100, 200);
		
		obj.sayA();
		obj.sayB();
		
		

	}

}
