/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.access.p1;

public class AccessClassB {

	public String PUBLIC_VALUE = "I'm public field";
	private String PRIVATE_VALUE = "I'm private field";
	protected String PROTECTED_VALUE = "I'm protected field";
	String DEFAULT_VALUE = "I'm default field";
	
	
	public void printPublicMethod() {
		System.out.println(" I'm public method."  + this.getClass().getName());
	}
	
	private void printPrivateMethod() {
		System.out.println(" I'm private method."  + this.getClass().getName());
	}
	
	protected void printProtectedMethod() {
		System.out.println(" I'm protected method."  + this.getClass().getName());
	}

	
	void printDefaultMethod() {
		System.out.println("I'm default method of  " + this.getClass().getName());
	}
}
