/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.java8newfeatures;

public class MultipleInterfaceWithSameDefaultMethodImpl implements DefaultMethodInterface,DefaultMethodInterfaceDupe {

	public static void main(String args[]) {
		DefaultMethodInterface defaultMethodInterfaceImpl = new MultipleInterfaceWithSameDefaultMethodImpl();
		defaultMethodInterfaceImpl.defaultPrintMe("I'm default Print me ");
		defaultMethodInterfaceImpl.printMe(" Priya ");
		
		DefaultMethodInterfaceDupe defaultMethodInterfaceDupeImpl = new MultipleInterfaceWithSameDefaultMethodImpl();
		defaultMethodInterfaceDupeImpl.defaultPrintMe(" Priya Default Check ");
	}
	
	@Override
	public void printMe(String text) {
		System.out.println("I'm interface printME " +  text );
	}

	@Override
	public void printMeDupe(String text) {
		System.out.println("I'm interface printMEDupe " +  text );
		
	}

	// Compile Error if we don't override.
	@Override
	public void defaultPrintMe(String text) { 
		DefaultMethodInterface.super.defaultPrintMe(text);
		DefaultMethodInterfaceDupe.super.defaultPrintMe(text);
	}

	
}
