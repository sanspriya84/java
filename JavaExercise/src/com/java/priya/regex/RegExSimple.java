/**
 * @author SHANMUGA PRIYA
 *
 */
package com.java.priya.regex;

import java.util.regex.Pattern;

public class RegExSimple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   String inputString_01 = "abc";
	   
	   //simple literal match
	   String regEx = "abc";	
	   Pattern strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();

	   // Meta characters <([{\^-=$!|]})?*+.> 
	   // .  is any
	   inputString_01 = "abcdefgh";
	   regEx = "abc.....";	// 
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	
	   //* - 0 or more times
	   inputString_01 = "abcdefgh";
	   regEx = "abc.*";	// 
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	
	   // ? 0 or 1 (Optional)
	   inputString_01 = "Mr John"; // . after the prefix is once or optional
	   regEx = "Mr\\.?\\s[A-Za-z]*";// \s is space.	
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	   
	   inputString_01 = "Mr. John";
	   regEx = "Mr\\.?\\s[A-Za-z]*";	
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	   
	   // + one or more times.
	   inputString_01 = "Mr. Jhon";
	   regEx = "Mr\\.+\\s[A-Za-z]*";	
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	   inputString_01 = "Mr Jhon"; // Have to fail. Because . is mandatory
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	   
	   // ^ negate 
	   inputString_01 = "Alphabets";
	   regEx = "[^x,y,z]*";	
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	   
	   inputString_01 = "Alphabetsx";
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	   
	   // Character Classes.
	   inputString_01 = "Anycharacterfromatoz";
	   regEx = "[A-Za-z]*";	
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	   
	   inputString_01 = "Anycharacterfromatoz with any number of spaces";
	   regEx = "[A-Za-z\\s]*";	
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	 
	   // A digit \d
	   
	   inputString_01 = "1234567890";
	   regEx = "\\d*";	
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	   
	   // A non Digit \D
	   inputString_01 = "AAA";
	   regEx = "\\D{3}";	
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	   
	   // \w \W word non-word
	   inputString_01 = "Words with ny number of  spaces";
	   regEx = "[\\w\\s]*";	
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
	   
	   inputString_01 = "qwewqe";
	   regEx = "\\W";	
	   strPattern = Pattern.compile(regEx);
	   System.out.println("String=" + inputString_01 + ", pattern ="  +regEx + ", Pattern match=" + strPattern.matcher(inputString_01).matches()); 
	   System.out.println();
			
	}

}
