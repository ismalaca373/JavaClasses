package com.class10_Array;

public class B_Array_Loop {

	public static void main(String[] args) {
		
		
		// burda array lengthi forla nasil kullandigimizi gosterdi
		

//		char [] grades= {'A','B','C','D','E','F'};
//        
//        int a=2;  // a yerine 2 kullan demis
//        
//        System.out.println(grades[4]);
//        System.out.println(grades[a]);
//        
//        a+=2; //2+2 arttir 4 u bastir diyor
//        
//        System.out.println(grades[a]);
//        
//        a--;//3 // ayi 1 azalt demis
//        
//        System.out.println(grades[a]);
//        System.out.println(grades[0]);
//        System.out.println(grades[1]);
//        System.out.println(grades[2]);
//        System.out.println(grades[3]);
//        
//        for(int i=1; i<grades.length; i++) {  // grades.lenght i comp otomatic biliyor // i-0 olursa i-- kullanman lazim cunku array de 0 dan baslar herzaman
//        	
//            System.out.println(grades[i]);
//        }
        
		
//		   To print all values from an array we can use for loop using following syntaxfor 
//	        
//	       for ( int i=0; i < array.length; i++ ) 
//	        
//	        {System.out.println( array[i] );}
//	        
//	        String[] names=new String[3];names[0]="John";names[1]="Anna";names[2]="Michael";
//	        
//	        for (int i=0; i<names.length; i++)
//	        	
//	        {System.out.println(names[i]+" ");}
	        
	        
  //////////////////////////////////     
        
        //create an array to store 5 double values, print all elements in one line
        
        
//        double [] dub = {1.1 , 1.2, 1.3, 1.4, 1.5};
//        
//        int size1 = dub.length;
//        
//        for (int i=0; i<size1; i++) {
//        	
//            System.out.print(dub[i] + " ");
//    }
        
 ////////////////////////////////////////////////////
        
      //  i want to print all values ve when is dog --> I love Dog

//        String[]animals = {"Cat", "Dog", "Cow", "Snake"};
//        
//        
//        for(int i= 0; i<animals.length; i++) {   
//        	
//        	if (animals[i].equals("Dog")) {
//        	
//        	System.out.println("I love dogs");
//        	
//        	}else {
//        	
//        	System.out.println(animals[i]);
//        }
//        
//	}
//        

// task 2 
        
      //  Create an array of countries. While retrieving all values from an array print capital for each country.
        
      
String[] countries= {"USA", "Russia","Italy","France"};

        
        for(int i=0; i<countries.length; i++) {
        	
            if(countries[i].contentEquals("USA")) {
            	
                System.out.println("Washington DC");
                
            }else if(countries[i].contentEquals("Russia")) {
            	
                System.out.println("Moscow");
                
            }else if(countries[i].contentEquals("Italy")) {
            	
                System.out.println("Rome");
                
            }else if(countries[i].contentEquals("France")) {
            	
                System.out.println("Paris");
            }
        }
        
     

}
}
