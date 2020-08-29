/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.access.p1;

public class AccessClassA {

	public static void main(String[] args) {
		AccessClassB b  = new AccessClassB();
		b.printPublicMethod();
		b.printProtectedMethod();
		b.printDefaultMethod();
		System.out.println(b.DEFAULT_VALUE);
		System.out.println(b.PROTECTED_VALUE);
		System.out.println(b.PUBLIC_VALUE);
		
		// Not visible.
		//System.out.println(b.PRIVATE_VALUE);
	    // Not visible.
		//b.printPrivateMethod();
		
	}
	
	
}
