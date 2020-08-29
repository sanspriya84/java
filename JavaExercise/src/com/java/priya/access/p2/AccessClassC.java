/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.access.p2;

import com.java.priya.access.p1.AccessClassB;

public class AccessClassC extends AccessClassB{


	public static void main(String[] args) {
		AccessClassC c  = new AccessClassC();
		c.printPublicMethod();
		c.printProtectedMethod();
		System.out.println(c.PROTECTED_VALUE);
		System.out.println(c.PROTECTED_VALUE);
		System.out.println(c.PUBLIC_VALUE);
		
		// Not visible. Visible only in the same package
		//b.printDefaultMethod();
		//System.out.println(b.DEFAULT_VALUE);
		
		// Not visible.
		//System.out.println(b.PRIVATE_VALUE);
	    // Not visible.
		//b.printPrivateMethod();
		
		AccessClassB b = new AccessClassB();
		b.printPublicMethod();
		// Not possible as it is not accessed through inherited class.
		//b.printProtectedMethod();
	}
}
