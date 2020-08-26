/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.exception;

public class ExceptionTryCatch {

	public static void main(String[] args) {
		Exception01 exception01 = new Exception01();
		try {
			String s1 = exception01.getMessage();
			System.out.println(s1);
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
	}

}

class Exception01 {

	protected String getMessage() throws Exception{
		String message = " Message from getMessage()";
		try {
			System.out.println("Inside Try 01");
			throw new Exception();
		} catch (Exception ex) {
			try {
				System.out.println("Inside Catch 01");
				throw new Exception();
			} catch (Exception ex01) {
				try {
					System.out.println("Inside Catch 02");
					//System.exit(0);
					throw new Exception();
				} catch (Exception ex02) {
					System.out.println("Inside Exception 02");
				} finally {
					System.out.println("Inside Fninally 01");
				}
			} finally {
				System.out.println("Inside Fninally 02");
			}
		}
		return message;
	}
}