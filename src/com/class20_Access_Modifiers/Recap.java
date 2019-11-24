package com.class20_Access_Modifiers;

public class Recap {
	
	    String name; // default can be seen inside the packadeg but baska yerde goremezsin
	    
	    
//  public 		void add1()            hekes gorebilir
//  protected   void add1()            sadece bu packed icindekiler
// 	yazmiyorsa 	void add1()default     can be seen inside the packadeg but baska yerde goremezsin
	    
	public  void add1() { 
	        int num1 = 2;
	        int num2 = 1;
	        int result = num1 + num2;
	    }
	
	    	void add2(int num1, int num2) {
	    	
	        int result = num1 + num2;
	    }
	    
	    int add3() {
	        int num1 = 4;
	        int num2 = 2;
	        int result = num1 + num2;
	        return result;
	    }
	    
	    int add4(int num1, int num2) {
	        int result = num1 + num2;
	        return result;
	    }
	    
///////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
        Recap son1 = new Recap();
        
        son1.name = "Ensar";
        
        son1.add1();
        
        son1.add2(2, 3);
        
        int result = son1.add3();
        
//      System.out.println(result);
        
        int result4 = son1.add4(5, 7);
        
/////////////////////////////////////////        
        
        Recap mySelf = new Recap();
        
        boolean good = mySelf.checkResult(12, result4);
        
        if (good) {
        	
            System.out.println("Good job " + son1.name);
            
        } else {
        	
            System.out.println("You are not good enough, but it's OK");
        }
    }
    boolean checkResult(int myResult, int mySonResult) {
    	
        boolean isOK = false;
        
        if (myResult == mySonResult) {
        	
            isOK = true;
           
        }else {
        	
        	 isOK = false;
        }
        return isOK;
    }
}

	

	

	