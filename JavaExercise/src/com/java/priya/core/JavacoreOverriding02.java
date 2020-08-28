/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.core;

public class JavacoreOverriding02 {

	// Overriding methods should have the same return type and same args. If the argument differs, then it is a new method. 
	// Output is dependent on the object created (on the right hand side).
	// Overriding methods can't lower the visibility of the method.
	public static void main(String[] args) {
		Electronics electronics = new Television();
		electronics.printMyName();
		electronics.printProtectedMyName();
		electronics.printPublicMyName();
		
		Television tv=new Television();
		tv.printMyName();
		tv.printProtectedMyName();
		tv.printPublicMyName();
		tv.printTelevision();
	}

}

class Electronics {

	protected void printProtectedMyName() {
		System.out.println(" I'm Protected Electronic Class");
	}

	void printMyName() {
		System.out.println(" I'm Electronic Class");
	}

	public void printPublicMyName() {
		System.out.println(" I'm Public Electronic Class");
	}
}

class Television extends Electronics {

	public Television() {
		super();
	}

	// Only public or Protected. No Private
	public void printProtectedMyName() {
		System.out.println(" I'm Protected Television");
	}

	// default, public , protected.
	public void printMyName(String s) {
		System.out.println(" I'm public Television Class");
	}

	// can only be public
	public void printPublicMyName() {
		System.out.println(" I'm Public Television Class");
	}
	
	public void printTelevision() {
		System.out.println(" I'm Just Television. ");
	}

}