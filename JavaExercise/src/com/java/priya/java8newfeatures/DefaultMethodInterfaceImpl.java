/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.java8newfeatures;

public class DefaultMethodInterfaceImpl implements DefaultMethodInterface {

	public static void main(String args[]) {
		DefaultMethodInterfaceImpl defaultMethodInterfaceImpl = new DefaultMethodInterfaceImpl();
		defaultMethodInterfaceImpl.defaultPrintMe("I'm default Print me");
		defaultMethodInterfaceImpl.printMe(" Priya ");
	}
	
	@Override
	public void printMe(String text) {
		System.out.println("I'm interface printME " +  text );
	}

	
}
