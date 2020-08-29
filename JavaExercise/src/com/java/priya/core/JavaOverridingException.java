/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaOverridingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//Throwable and exceptions that are not sub-class of RunTimeException / Error are Checked Exception
	// Checked exceptions are compile time exceptions.
	// unChecked Exceptions are exceptions thrown during the runtime (NullPointer,ArrayIndexOutOfBounds,Arithemetic etc)
	class BasicMath {

		//Rule1 : If overridden method throws any Exception, the overriding method can only throw the same or subclass of the exception
		//Rule 2 : The overriding method need not have to throw any exception even if the overridden method throws any kind of exception.
		
		public int divide(int a, int b) throws FileNotFoundException{ // Checked Exception
			FileReader fr = new FileReader(new File(""));
			int c = a / b;
			return c;
		}
		//Rule 3 : The overriding method can throw only unChecked exception if the overridden method is not throwing exception
		public int add(int a, int b){
			int c = a + b;
			return c;
		}
 

	}

	class OverrideMath extends BasicMath {

		
		//IOExcpetion is a super class of FileNotFoundException public int divide(int a, int b) throws IOException {
		 public int divide(int a, int b) {
			int c = a / b;
			return c;
		}

		public int add(int a, int b){
	//Not possible by Rule 3 public int add(int a, int b) throws FileNotFoundException {
	    	//FileReader fr = new FileReader(new File(""));
			int c = a + b;
			return c;
		} 

	}

}
