/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.primitives;

public class PrimitiveTest01 {

	public static void main(String[] args) {
		Boolean bool = new Boolean("True");
		Boolean bool01 = new Boolean(true);
		System.out.println(bool + " " + bool01);
		Float flot = new Float("2.345");
		Float flot01 = new Float("2.345f");
		System.out.println(flot + " " + flot01);
		Double d = new Double("2.34d");
		Double d01 = new Double("2.34");
		System.out.println(d + " " + d01);
		Character c1 = new Character('c');
		//Character c1 = new Character("c"); Compile error
		System.out.println(c1);
	}

}
