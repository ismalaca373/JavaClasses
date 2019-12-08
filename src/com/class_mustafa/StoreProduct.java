package com.class_mustafa;

public class StoreProduct {

		  
		  String label;
		  double price;
		  String category;
		  boolean hasExpiration;
		  int stock;

		  StoreProduct (String label,double price,String category,boolean hasExpiration,int stock){
		  
		  this.label = label;
		  this.price = price;
		  this.category = category;
		  this.hasExpiration = hasExpiration;
		  this.stock = stock;
		  }
		  
		  StoreProduct (String label,double price,int stock){
		  
		  category = "misc";
		  hasExpiration = false;
		  this.label = label;
		  this.price = price;
		  this.stock = stock;
		  }
		  
		  StoreProduct (String label,double price){
		  
		  category = "misc";
		  hasExpiration = false;
		  stock = 0;
		  this.label = label;
		  this.price = price;
		  }
		  
		  void display(){
		    
		    System.out.println(label +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock);
		  }

		}


