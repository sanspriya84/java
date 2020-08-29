/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.core;

public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedClass nestedClass = new NestedClass();
		nestedClass.printOuterClassMethod();
		NestedClass.A a = nestedClass.new A();
		// Inner class variables can be accessed through Instance.
		System.out.println( a.public_variable_class_A);
		System.out.println( a.private_variable_class_A);
		System.out.println( a.protected_variable_class_A);
		System.out.println( a.deafault_variable_class_A);
	}

	// All variables or methods in the nested/ inner class is accessible by the enclosing class.
	// The enclosing class have no access to the inner class variables / methods.
	// The scope of inner/ nested class is bounde by enclosing class.
	private String private_variable_outer_class="10";
	protected String protected_variable_outer_class;
	public String public_variable_outer_class;
    String default_variable_outer_class;
	public void printOuterClassMethod() {
	 // Compile error - Can not resolve the variables
		/*private_variable_class_A = "12";
		public_variable_class_A = "10";
		 protected_variable_class_A="15";
		 deafault_variable_class_A="20";*/
	}

	private void printOuterPrivateMethod() {

	}

	private class A {
	
		private String private_variable_class_A="5";
		public  String public_variable_class_A="10";
		protected String protected_variable_class_A="15";
		String deafault_variable_class_A="20";
		
		A() {	}

	    void printOuterPrivateMethod() {
	    	private_variable_outer_class = "A";
			protected_variable_outer_class = "B";
			public_variable_outer_class = "C";
			default_variable_outer_class = "D";
		}

		private class B {

			B() {
				private_variable_outer_class = "A";
				protected_variable_outer_class = "B";
				public_variable_outer_class = "C";
			}

		}

	}

}
