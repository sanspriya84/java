/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.core;

public class MethodOverloading {

}

class Animal {

	public void run() {
		System.out.println(" animal runs ");
	}

	public void run(int runSpeed) {
		System.out.println(" animal runs with the speed " + runSpeed);
	}

	// Retrun type should be the same.
	/*
	 * public int run(int runSpeed) {
	 * System.out.println(" animal runs with the speed " + runSpeed); }
	 */

	public void run(int runSpeed, String direction) throws Exception{
		System.out.println(" animal runs with the speed " + runSpeed + " towards " + direction);
	}
	
	public void run(int runSpeed, int direction) throws RuntimeException{
		System.out.println(" animal runs with the speed " + runSpeed + " towards " + direction);
	}

}
