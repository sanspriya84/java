/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.java8newfeatures;

public interface DefaultMethodInterfaceDupe {

	 public void printMeDupe(String text);
	 
	 default void defaultPrintMe(String text) {
		 System.out.println(" Default Method Interface ssd Dupe : " +  text);
	 }
}
