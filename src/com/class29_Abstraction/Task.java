package com.class29_Abstraction;

public abstract class Task {
	
	public abstract void open();

	public void edit() {

		System.out.println("defined 1");
	}
	
	public void close() {

		System.out.println("defined 2");
	}
	
}

class JavaFile extends Task { // javaFile i tikla ve alttakileri oto yuklesin

	@Override      						// bu mesele de onemli. you dont have tor ride again 
	public void open() {

		
		System.out.println("we need notePad++");
		
	}
	
	
}

class WordFile extends Task{

	@Override
	public void open() {
	
		System.out.println("we need Microdsoft");
		
	}
	
	
}

class PDFFile extends Task {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}