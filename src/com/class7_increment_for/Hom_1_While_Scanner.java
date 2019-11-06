package com.class7_increment_for;

import java.util.Scanner;

public class Hom_1_While_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*You need ask user to pay for coffee  //parasini odemeli
         * You need to keep asking user to pay for it until paid
         * entered price is equal=5;  kahve parasi 5$ olursa sormayi birakacak
         * After user paid then say "Enjoy your coffee!"
         */
		//e
		

		
		
		
		//hocanin cevabi alttaki
		
		 Scanner scan = new Scanner(System.in);
		 
       int price;
       
       do {													//do kullandik cunku 5 dolar verinceye  kadar  sorsun diyoruz
           System.out.println("Pay for Your coffee");
           price = scan.nextInt();
           
       }while (price!=5);
       
           System.out.println("Enjoy Your coffee");
	
		 
		 ////////////////////////////////////
		 
		 
//			Scanner scan = new Scanner(System.in);
		 
//		int c=0;			//
//		
//        while(c!=5) {   // 5 dolar olarak dusunmus. 5 ve uzeri yazarsan veriyor yoksa keep asking
//        	
//            System.out.println("Pay for your coffee");
//            
//            c =scan.nextInt();
//            
//            c++;
//        }
//        System.out.println("Enjoy your coffee");
		
/////////////////////////////////////////////////////////////////////////////////
          
 //           
		
//			Scanner in = new Scanner(System.in);
//	//	
//            System.out.print("Coffee price: ");
//            
//            int price, payment;
//            
//            price=in.nextInt();
//            
//            System.out.print("Payment: ");
//            
//            payment=in.nextInt();
//            
//            
//            do {
//                System.out.println("Pay more "+(price-payment));
//                payment+=3;
//            }
//            while(price>payment); {
//                
//                System.out.println("Here you are");
//            }if(payment>price) {
//                System.out.println("It is your tip.");
//            }
//            System.out.println("Enjoy your coffee");
//        
          ////////////////////////////////////////////////////////////////////
//
//		Scanner scan = new Scanner(System.in);
//	
//		
//		
//        int c=1;
//        while(c!=5) {
        
//            System.out.println("Pay for your coffee");
//            c =scan.nextInt();   //increment koymadi cunku musteriden aliyor datayi
//            
//        }
//          
//            System.out.println("Enjoy your coffee");
        
        ///////////////////////////////////////////////////////////////////
//        
//       
    }

}