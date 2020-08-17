/**
 * @author SHANMUGA PRIYA
 *
 */
package com.java.priya.java8newfeatures;

public class LambdaCustomImplementation {

	public static void main(String args[]) {
	
		CustomFunctionalInterface customFunctionalInterfaceImpl =  (String inputText) -> System.out.println("I'm Printing " + inputText);
		customFunctionalInterfaceImpl.printTheText(" Priya ");
	}
	
}
