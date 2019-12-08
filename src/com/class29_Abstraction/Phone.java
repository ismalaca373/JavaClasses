package com.class29_Abstraction;

public abstract class Phone {   // abstract clasin icinde abstract method olur.

	public void makeCall() {
		
		System.out.println("Make Call");
	}
	
	public void sendText() {
		
		System.out.println("Send text");
		
	}
	
	// unimplemented method
	
	public abstract void takePictures(); // no curly brakets and  no baody to implement
		
	public abstract void playGame(); 
	
}
	// concrete class 
	
	class iPhone extends Phone{  // bunu yazdiginda hata verir. uzerine tiklayip unimplment methodlari getire tikla gelsin

		@Override
		public void takePictures() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void playGame() {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	class Samsung extends Phone{

		@Override
		public void takePictures() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void playGame() {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}
	
	

