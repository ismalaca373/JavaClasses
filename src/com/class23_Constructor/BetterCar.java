package com.class23_Constructor;

public class BetterCar {  
	
	public static String make;    
	
	public String model;
	
	public String color;
	
	public int speed;
	
	public int doors;
	
	
	// calling constructor 
	
	BetterCar (String carModel, String carColor, int carSpeed, int carDoors){
		
		model = carModel;
		color = carColor;
		speed = carSpeed;
		doors = carDoors;
	
	}
	
	public void getdetails() {
	
			
	System.out.println("My car has "+ doors + " doors and" + " its max speed is "+ speed);
		
		
	System.out.println("I build "+color +" "+ make + " "+ model);
					
	}
	
	
	

	public static void main(String[] args) {
		
		make= "Anadol"; // stattic oldugundan burda ayni yerde direct assign edebiliriz yada BetterCar.make de diyebilirsin ok
		
		
		BetterCar bcar1 = new BetterCar("yarim", "gri", 550, 7);
		
		bcar1.getdetails();
		
			
		BetterCar.make = "BUICK";  // stattic variable 
		//yeniden assign ettik
		
		BetterCar bettercar1 = new BetterCar ("wdl ", " White ", 180, 5);
		
		System.out.println();
		
		bettercar1.getdetails();
		
		
		BetterCar bettercar2 = new BetterCar ("asl ", " beyaz ", 300, 6);
		
		System.out.println();
		
		bettercar2.getdetails();
			
		}
		

	}

// hocanin notu

//package com.class23;
//public class BetterCar {
//    /* we want to build make as Toyota that will have different models and color *
//     */
//    public static String make;
//    public String model;
//    public String color;
//    public int speed;
//    public int doors;
//    
//    BetterCar(String carModel, String carColor, int carSpeed, int carDoors){
//        model=carModel;
//        color=carColor;
//        speed=carSpeed;
//        doors=carDoors;
//    }
//    public static void main(String[] args) {
//        make="BMW";
//        //compiler will give an error, we have to pass values when we build an Object
//        //those values will be passed as argumnets to the constructor
//        //through constructor instance variables will get initialized
//        //BetterCar bcar1=new BetterCar();
//        BetterCar bcar1=new BetterCar("X5", "Blue", 400, 2);
//        bcar1.getDetails();
//    }
//    
//    public void getDetails() {
//        System.out.println("I build " + color + " " + make + " " + model);
//        System.out.println("My car has "+doors+" doors and can have speed up to "+speed );
//    }
//}



