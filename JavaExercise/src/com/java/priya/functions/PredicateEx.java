/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

// Functional interfaces provide target types for lambda expressions and method references. 
public class PredicateEx {
    // Predicate is a generic Functional Interface that returns either true or false.
	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("John");
		arrayList.add("Joe");
		arrayList.add("Peter");
		arrayList.add("Raymond");
		
		arrayList = arrayList.stream().filter( s1-> !"Joe".equalsIgnoreCase(s1) && !"Peter".equalsIgnoreCase(s1)).collect(Collectors.toList());
		System.out.println(arrayList);
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		IntPredicate intPredicate = i-> i > 5;
		Arrays.stream(numbers).filter(intPredicate).forEach(System.out::println);
		 System.out.println("compose and");
		// Compose predicates
		IntPredicate intPredicate02 = i-> i < 10;
		Arrays.stream(numbers).filter(intPredicate.and(intPredicate02)).forEach(System.out::println);
		
		System.out.println("compose or");
		intPredicate02 = i-> i > 3;
		Arrays.stream(numbers).filter(intPredicate.or(intPredicate02)).forEach(System.out::println);

		System.out.println("compose negate"); 
		Arrays.stream(numbers).filter(intPredicate.negate()).forEach(System.out::println);

	}

}
