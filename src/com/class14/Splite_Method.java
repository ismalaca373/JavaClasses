package com.class14;

public class Splite_Method {

	public static void main(String[] args) {
		
				/*.split()
				 * This method splits this string around matches of the given regular expression.
				 */
				
				//split the following string into array of strings/work
				String str="Video provides a powerful way to help you prove your point.";
				
				String[] array=str.split(" "); // her bosluktan sonra split ediyor
				
				for(int i=0;i<array.length;i++) {
					
					System.out.println(array[i]);
				}
				
				
				
				
				
			}
	}


// Java strings are created and manipulated through the string class. 
//Once created, a string is immutable - its value cannot be changed.

//The state of an OBJECT is stored in fields (variables), while METHODS (functions) display the object's behavior.