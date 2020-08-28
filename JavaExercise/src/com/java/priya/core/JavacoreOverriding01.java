/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.core;

public class JavacoreOverriding01 {

	// Output is dependent on the object created. 
	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.printMyName();
		shape.printSuperMyName();
		System.out.println();
		
		Shape shapeTr = new Triangle();
		//method overriding
		shapeTr.printMyName();	
		shapeTr.printSuperMyName();
		System.out.println();
		
		
		// Can not down cast a Super class.
		//Shape shapeTr01 = (Triangle)new Shape();
		//shapeTr01.printMyName();
		
		Shape shape02 = (Shape) new Triangle(); 
		//method overriding
		shape02.printMyName();
		shape02.printSuperMyName();
		System.out.println();
		
		Triangle triangle = new Triangle();
		triangle.printMyName();
		triangle.printSuperMyName();
		triangle.printTrinagleMyName();
		System.out.println();
		
		
		Shape shape03 = (Shape) new Square();
		shape03.printMyName();
		System.out.println(shape02==shape03);
		
		 
		
	}

}

class Shape {

	public void printMyName() {
		System.out.println(" I'm Shape Class");
	}
	
	public void printSuperMyName() {
		System.out.println(" I'm Super Shape Class");
	}

}

class Triangle extends Shape {

	public Triangle() {
		super();
	}

	public void printMyName() {
		System.out.println(" I'm Triangle");
	}
	
	public void printTrinagleMyName() {
		System.out.println(" I can be called as Tringulo");
	}
}

class Square extends Shape {

	public Square() {
		super();
	}

	public void printMyName() {
		System.out.println(" I'm Square");
	}
}
