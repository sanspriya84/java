/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.core;

public class JavaCoreStatic {

	public static void main(String args[]) {
		Furniture furniture = new Furniture();
		furniture.printMyLegCount();
		
		Furniture furniture01 = new RevolvingChair();
		furniture01.printMyLegCount();
		
		Furniture furniture02 = (Furniture )new RevolvingChair();
		furniture01.printMyLegCount();
		//Always static call.	
	}
	
}

class Furniture{
	
	public static void printMyLegCount() {
		System.out.println( " I can have any number legs" );
	}
}


class Table extends Furniture{
	public static void printMyLegCount() {
		System.out.println( " I mostly will have four legs" );
	}
}

class RevolvingChair extends Furniture {
	public static void printMyLegCount() {
		System.out.println( " I mostly will have four or five legs" );
	}
}