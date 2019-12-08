package com.class29_Abstraction;

// We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
// by student A and in four subjects (each out of 100) by student B. 
// Create class ‘Marks’ with an abstract method ‘getPercentage’. 
// It is inherited by classes ‘A’ and ‘B’ each having a method with the same name 
// which returns the percentage of the students. 
// The constructor of student A takes the marks in three subjects as its parameters and 
// the marks in four subjects as its parameters for student B. Test your code

public abstract class Marks {
	

    double Eng;
    double Math;
    double Phy;
    
    Marks( double Eng,double Math,double Phy){
    
    this.Eng = Eng;
    this.Math = Math;
    this.Phy = Phy;
    }
	 public abstract double getPercentage();
	 
	}

	class A extends Marks {
		
		
	    
	    A (double Eng, double Math, double Phy) {
	    	
	    	super(Eng, Math, Phy);
	      
	        
	 }
	    @Override
	    public double getPercentage() {
	    	
	        double per = ((Eng * 0.30) + (Math * 0.5) + (Phy * 0.2));
	        
	        return per;
	    }
	}
	class B extends Marks {
		
	    double Che;
	    
	    B(double Eng, double Math, double Phy, double Che) {
	    	
	    	super(Eng, Math, Phy);
	        this.Che = Che;
	    }
	    @Override
	    public double getPercentage() {
	        double per = ((Eng * 0.3) + (Math * 0.3) + (Phy * 0.2)+(Che*0.2));
	        return per;
	    }
	}
	






