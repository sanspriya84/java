/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.core;

import java.io.FileNotFoundException;

public class MethodOverloading {

	public static void main(String args[]) {
		Animal animal = new Animal();
		animal.run();
	}
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

	public void run(int runSpeed, String direction) throws FileNotFoundException{
		System.out.println(" animal runs with the speed " + runSpeed + " towards " + direction);
	}
	
	public void run(int runSpeed, int direction) throws RuntimeException{
		System.out.println(" animal runs with the speed " + runSpeed + " towards " + direction);
	}

}
