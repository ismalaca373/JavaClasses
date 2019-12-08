package com.class12_String_Manupilation;



public class B_Boolean_String_Manipulations {

	public static void main(String[] args) {

//****  boolean contains(String anotherString)  true or false
		/*
		 * .contains("bisey");
		 * This method  searches the sequence of characters in the string.
		 * If the sequences of characters are found, 
		 * then it returns true otherwise returns false.
		 */
		
//**
		String sentence="It was raining";
		String sen="raining";
		System.err.println(sen.contains(sentence));    // err. println yazarsan false ise kirmizi yazar asagiya
		
		System.out.println(sentence.contains("was"));
		
///////////////////////////////////////////
		
//****	 boolean startsWith(String prefix) ilk kelimeyi veriyor cumlenin  true or false
		
		/* .startsWith("bisey")
		 * This method tests if a string starts with the 
		 * specified prefix beginning 
		 */

//**
		String str2="It is very hot in the class";
		
		System.out.println("Is this string starts with="+str2.startsWith("It")); // true
		
		System.err.println("Is this string starts with="+str2.startsWith("is")); // false

		System.out.println("****************");

///////////////////////////////////////////////
		
//****  boolean endsWith(String suffix) 	true or false
		
		/*.endsWith("bisey")
		 * This method tests if this string ends with 
		 * the specified suffix.
		 */
//**		
		String str3="It is very hot in the class";
		
		System.out.println("Is this string ends with="+str3.endsWith("class"));  // true gelir

/////////////////////////////////////////
		
//****		boolean equals(Object anObject)	 true false
		
				//.equals() This method compares this String to another String. The result is
//				true only if the argument is not null and if a String object that
//				represents the same sequence of characters as this object.

//**	
				String str22="HElLo WoRld";
				
				boolean isEqual=str22.equals(str22);
				
				System.out.println(isEqual);

//**
				String Str5 = "This is really not immutable!!";
				
				String Str4 = Str5;
				
				String Str3 = "This is really not immutable!!";
				
				boolean retVal;
				
				retVal = Str5.equals( Str4 );
				
				System.out.println("Value = " + retVal );
				
				retVal = Str5.equals( Str3 );
				
				System.out.println("Value = " + retVal );
				
//////////////////////////////////////	
				
				//****  boolean isEmpty() true false
				
				/*.isEmpty("") boyle bos ama bosluk yazsan dolu kabul eder.
				 * 
				 * This method checks whether a String is empty or not. 
				 * This method returns true if the given string 
				 * is empty, else it returns false.
				 */
//**
				String str="";  // icine bosluk bile yazsan true kabul eder
				
				System.out.println("Is this string empty= "+str.isEmpty());
				
//**
				String str33="Hello"; 
				
				System.err.println("Is this string empty= "+str33.isEmpty()); // false
				
				System.out.println("****************");

//**		
				if(!str.isEmpty()) {
					
					System.out.println("This is not empty");
					
				}else {
					
					System.err.println("This is empty String");
				}
				
				System.out.println("**************************");
				
///////////////////////////////////////////////				
				
// Task
				//*
				// Create two Strings and initialize them with some value.
				//implement the following methods on those strings.
				
				/*
				 * sen.length();  // sen burda name of String ornegi
				 * sen.equals();
				 * sen.contains(s);
				 * sen.toUpperCase();
				 * sen.toLowerCase();
				 * sen.equalsIgnoreCase(anotherString);
				 *
				 */
				String aa = "ALi giT dEdim";
				String bb = "VeLi Gel dEdim";
				
				System.out.println(aa.length()); // 13 verir
				System.err.println(aa.equals(bb)); // esit degil false verir
				System.out.println(aa.contains("git")); //true veirir
				System.out.println(aa.toUpperCase()); // ALI GIT DEDIM
				System.out.println(bb.toLowerCase()); // veli gel dedim
				System.err.println(aa.equalsIgnoreCase(bb)); // false case bakmadan iki cumleyi karisilastiriyor
				
				System.out.println("****************");
				
		////////////////////////////////////////////////
				
	}

}
