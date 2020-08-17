/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.java8newfeatures;

public interface DefaultMethodInterface {
	
	 void printMe(String text);
	 
	 default void defaultPrintMe(String text) {
		 System.out.println( " Default Method Interface : " + text);
	 }
	 
	 // can have any number of default methods.
	 default void defaultPrintMe01(String text) {
		 System.out.println( " Default Method Interface 001 : " + text);
	 }

}
