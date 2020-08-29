/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.core;

public class StaticInnerClass {

	private String private_variable_outer_class="10";
	protected String protected_variable_outer_class;
	public String public_variable_outer_class;
    String default_variable_outer_class;
    private static String static_private_outer_variable= "VALUE"; 
    
	public static void main(String[] args) {
		// An instance of outer object is not needed.
		//StaticInnerClass.InnerClass innerClass = new InnerClass();
		//innerClass.printOuterClassValues();
		StaticInnerClass.InnerClass.printOuterClassValues();
	}
		
	static class InnerClass {
		InnerClass(){
	    }
		
		public static void printOuterClassValues() {
           StaticInnerClass staticInnerClass = new StaticInnerClass();
			
            staticInnerClass.private_variable_outer_class = "innerA";
			staticInnerClass.protected_variable_outer_class = "innerB";
			staticInnerClass.public_variable_outer_class = "innerC";
			staticInnerClass.default_variable_outer_class = "innerD";
			System.out.println( staticInnerClass.private_variable_outer_class);
			System.out.println( staticInnerClass.protected_variable_outer_class);
			System.out.println( staticInnerClass.public_variable_outer_class);
            System.out.println( staticInnerClass.default_variable_outer_class);
            
			System.out.println(static_private_outer_variable);
			// Can not directly access. Only static members can be accessed directly or instance members / variable can be accessed.
		/*	private_variable_outer_class = "innerA";
			protected_variable_outer_class = "innerB";
			public_variable_outer_class = "innerC";
			default_variable_outer_class = "innerD";*/
		
		}
	}  
}
