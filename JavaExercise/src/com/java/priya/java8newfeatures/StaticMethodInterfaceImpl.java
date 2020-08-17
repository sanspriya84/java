/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.java8newfeatures;

public class StaticMethodInterfaceImpl implements StaticMethodInterface{

	public static void main(String args[]) {
		
		StaticMethodInterface staticMethodInterfaceImpl = new StaticMethodInterfaceImpl();
		StaticMethodInterface.print();
		// Static interface methods can be accessed only by static Interface
		//staticMethodInterfaceImpl.print();
		
	}
}
