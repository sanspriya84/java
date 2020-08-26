/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.thread;

public class ThreadTestStartVsRun {

	public static void main(String[] args) {
	System.out.println(" Main Thead Id :" +  Thread.currentThread().getName());
	 Runnable run = () -> System.out.println( " Current Thead Id :" +  Thread.currentThread().getName() + " Printing the message from run");
	 Thread t = new Thread(run);
	 t.setName("Start thread name");
	 t.start(); //Creates a new Thread and runs the run method.
	 //t.run(); // runs in the same main thread.
	}

}
