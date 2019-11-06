package com.class3_If_else;

public class B_Primitive_vs_Casting {
	
	public static void main( String[]args) {
		
		// casting-= changing/coverting one type to another
		
		// widening- implicit/automatic
		
		//byte -> short-> int-> long --> float --> double    you can 
		
		// narrowing- explicit/manual 
		
		//double -> float -> long, int, short, byte
		
		double d=12;  //buraya 12 yazdik compiler 12.0 cevirdi olay budur
		
		System.out.println(d);   // sonuc 12.0 cikar unku double kusurlu sayi veriri
		
		// int i=20.0; compile time error
		
		byte b = 127;
		int i = b;
		
		System.out.println(i);
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		
		
		
		double d2=123.45; // narrowing or emplicit or manual casting  
		int num2=(int)d2; // =den sonra (int) kpyuyuoruz ve compilera diyoruzki sen yapmasanda ben yapmani istiyorum diyor.
		
		System.out.println(num2);
		
		int num3=789;   // compiler yapamam diyecek sende diyeceksinki yap
		byte b1=(byte)num3;
		
		
		System.out.println(b1); // 21 cikmasinin sebebi= 256 ya boulumden kalan numara 
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
