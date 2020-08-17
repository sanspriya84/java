/**
 * @author SHANMUGA PRIYA
 *
 */
package com.java.priya.java8newfeatures;

import java.util.Comparator;

public class LambdaSample_1 {

	public static void main(String args[]) {
	
		 Comparator<String> wordComparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s1.compareTo(s2);
			}
			 
		 };
		 
		 System.out.println("I'm equal : " +  wordComparator.compare("Priya", "Priya"));
		 System.out.println("I'm small: " + wordComparator.compare("Priya", "Priya012"));
		 System.out.println("I'm Big: " + wordComparator.compare("Priya012", "Priya"));
		 System.out.println();
		 //Lambda
		 Comparator<String> wordComparatorLambda = (s1,s2) -> s1.compareTo(s2);
		 System.out.println("I'm still equal : " +  wordComparatorLambda.compare("Priya", "Priya"));
		 System.out.println("I'm still small: " + wordComparatorLambda.compare("Priya", "Priya012"));
		 System.out.println("I'm still Big: " + wordComparatorLambda.compare("Priya012", "Priya"));
		 
	}
	
}
