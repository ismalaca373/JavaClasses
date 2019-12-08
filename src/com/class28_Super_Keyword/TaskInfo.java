package com.class28_Super_Keyword;

public class TaskInfo extends Task {
	
	
	String address;
	
	TaskInfo (String name,String telNum,String address) {
		
		super(name,telNum);
		
		this.address = address;
		
	
	}
	
	public void getInfo() {
		
		
		System.out.println(name + "'s living in "+ address +" and his telephone number"+ telNum );
	}
	
	
	

}


class Main {
	  public static void main(String[] args) {
	    Child cc= new Child("Vienna");
	  }
	}



class Parent{ 
	   public Parent(String city){
	     System.out.println(city);
	   }
	   
	   public Parent(){
	     System.out.println("Parent Constructor");
	   }

	}




class Child extends Parent{
	  Child(String city){
	    super(city);
	  }
	}