package com.class11_Array_Loop;

public class B_2D_Array {

	public static void main(String[] args) {

		// I can have multiple rows and multiple columns
		// tabledaki gibi dusun
		// adress: once roww sonra colum yazilir 
		// burda for each loop avantajli
		//length dersen row sayisini verir.
		// arr[0].length derseniz col sayisini verir. her satirin colom sayisi ayni olacagindan birini yazarsin yeterli
		
		// tersten basa enhance kullanamazsin, ikrimint falan yok
		
		// 2 ye 2 bir table dusun. 
		// 
		// for (int i=0; i<arr.length; i++) // bu row dongusunu verir sonra bir for daha yazman lazim
		// for (int j=0; j<col; j++)
		// syso([i][j]);  
		// table duzgun degilse yani bir rowda bir fazla colon olabilir j<[i].length dersin ikidekine
		
		//yukardakini advancele yazarsak
//		
//		for(int[]a : arr) {  // bu row sonra iceri gireceksin
//			
//			for(int num : a) 
//				
//				syso(num) // her bir hucreye girip tektek almak icin num dersiniz
				
			
			
			
//		}
		
		
		
		
//		
//		int[][] numbers= {
//				{8,7,5,3,8},     // 0 inci row
//				{1,5,6,4,9,8},
//				{3,6,8,0,7}
//				};
//		
//		System.out.println(numbers[1][4]);  // 1.ci row ile 4. colmun birlestigi yer. // 0 dan saymaya basla ama 
//		
//		// to identify the numbers of rows
//		
//		
//		System.out.println("The value in index 1 and 4 is= ""+numbers [1][4]);
//        
//        //To identify the numbers of Rows
//        System.out.println("The numbers of Rows are:= "+numbers.length);
//        
//        //To identify the numbers of Columns/elements in that row
//        System.out.println("The numbers of Rows are:= "+numbers[0].length);

		
		
		
/////////////////////////////////////		
		
		
//		int[][] array = new int[3][5]; // you have 3 rows and 5 colums table.
//		
//		//1st row
//		array [0][0]=44;
//		array [0][1]=80;
//		array [0][2]=44;
//		array [0][3]=20;
//		
//		//2nd row
//		
//		array[1][0]=10;
//		array[1][1]=5;
//		array[1][2]=7;
//		array[1][3]=8;
//		
//		//3nd row
//		
//		array[2][0]=10;
//		array[2][1]=9;
//		array[2][2]=70;
//		array[2][3]=6;
//		
//		System.out.println {array[1][3]};
//		
///////////////////////////////////////////////
//		
//		// you have 2 rows and 3 colums table.
//		// print the value in second row and 3rd column
//		
//		String [] []b=new String[2][3];
//	    //1 row
//	    b[0][0]=“Hello”;
//	    b[0][1]=“world”;
//	    b[0][2]=“Git”;
//	    //2row
//	    b[1][0]=“Java”;
//	    b[1][1]=“SDLC”;
//	    b[1][2]=“Manual testing”;
//	:heavy_check_mark:
//	1
//

////////////////////////////////////
        
       // ornek
        
//        int[][] numbers= {
//                {2,4,555,77,88,0},{6,7,99},{4,33,54,433,65},{6,45,656565,43434,5454,555}
//        };
//        
//        
//        System.out.println(numbers[3][2]);
//        
//        System.out.println("  ");
//        
//        for (int row=0; row<numbers.length;row++) {
//            for(int col=0;col<numbers[row].length;col++) {
//                System.out.print(numbers[row][col]+"\t");
//            }
//            System.out.println();
//        }
		
/////////////////////////////////////
        
        
//                int[][] numbers = {
//                        { 8, 7, 5, 3 },
//                        { 1, 5, 6, 7 },
//                        { 3, 6, 8, 1 }
//                        };
//                
//                int sum=0;
//                for (int i = 0; i < numbers.length; i++) {
//                    for (int j = 0; j < numbers[i].length; j++) {
//                        //System.out.print(numbers[i][j] + ” “);
//                        
//                        sum=sum+numbers[i][j];
//                    }
//                    System.out.println();
//                }
//                System.out.println(“The sum of all elements in the array is= “+sum);
//                
//                int sum1=0;
//                for(int nums[]: numbers) {
//                    for(int getNum:nums) {
//                        if(getNum%2==0) {
//                            System.out.println(getNum+” Is Even Number”);
//                        }
//                        sum1=sum1+getNum;
//                    }
//                }
//                System.out.println(“The sum of all elements in the array is= “+sum1);
                
////////////////////////////////////////////////
                
                
                int[][] array=new int[2][3];
                
                //First ROW
                array[0][0]=9;
                array[0][1]=10;
                array[0][2]=11;
                
                //Second ROW
                array[1][0]=3;
                array[1][1]=17;
                array[1][2]=36;
                
                for (int i=0;i<array.length;i++) {
                	
                    for (int j=0;j<array[i].length;j++) {
                    	
                    System.out.print(array[i][j]+" "); 
                    
                    }System.out.println();
                }
                
                
            }
}  
        
	


