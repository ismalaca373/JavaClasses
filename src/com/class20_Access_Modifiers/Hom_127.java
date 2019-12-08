package com.class20_Access_Modifiers;

public class Hom_127 {
	
//	
//			Declare a private,default,protected,public methods and 
//			have them each return the name of the what access modifier 
//			they are using in order as below. 
//			make the return values add to each other.
//
//			Output:
//			private, default, protected, public

	 
		  private String privateAccess(){
		    String str="private";
		    return str;
		  }
		  
		   String defaultAccess(){
		    String str="default";
		    return str;
		  }
		  
		    protected String protectedAccess(){
		    String str="protected";
		    return str;
		  }
		    
		    public String publicAccess(){
		        String str="public";
		        return str;
		      }
		    
		    public static void main (String[]args) {
		    	
		    Hom_127 main=new Hom_127 ();
				    
		    System.out.println (main.privateAccess() + ", " 
		    					+ main.defaultAccess() + ", " 
		    					+ main.protectedAccess() + ", " 
		    					+ main.publicAccess());
				  
				  }  
		    }