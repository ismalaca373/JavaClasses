package com.class22_Variables;

public class Static_Husky {
	
	static String breed= "Husky";
	static int paws= 4;
	static int tale=1;
	
	String name;
	String color;
	
	void display() {
		
  System.out.println("Puppy names is " + name+ "and it is bree is " +breed);
	
	
	}
	

	public static void main(String[] args) {
		
		Static_Husky puppy1 = new Static_Husky();
		
		Static_Husky puppy2 = new Static_Husky();
		
		Static_Husky puppy3 = new Static_Husky();

		
		puppy1.name = "Meatball";
		puppy1.color = "Brown";
		puppy1.display();
		
		puppy2.name = "Sharik";
		puppy2.color = "Black";
		puppy2.display(); 
		
		puppy3.name = "Meatball";
		breed = "Bulldog";  // burda dananin kuyrugu kopuyor. burda farkli seye degistirince bundan sonra hepsini degistiri
		puppy3.color = "Brown";                  //syso edip bakmalisin
		puppy3.display();
		
		
	}

}
