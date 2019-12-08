package com.class28_Super_Keyword;

public class CarTest2 {

		    public static void main(String[] args) {
		    	
		        
		     Car car1=new Sedan(21, 50000, "Blue");
		        
		        double Ccar1=car1.calculateSalePrice();
		        
		        System.out.println(Ccar1);
		        
		        
		     Car car2=new Truck(201, 70000, "Grey");
		        
		        double Ccar2=car2.calculateSalePrice();
		        
		        System.out.println(Ccar2);
		        
		    }
		
	}


