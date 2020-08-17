/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.methodreference;

import java.util.List;

import com.java.priya.util.JavaUtil;

public final class StaticMethodReference {

	public static void printStaticMethod() {
		System.out.println(" Printing from static method");
	}
	
	public static int compare(Employee e1, Employee e2) {
	    if  ( e1.getEmpNo() > e2.getEmpNo()) 
	    	return 1;
	    else if  ( e1.getEmpNo() < e2.getEmpNo()) 
	     	return -1;
	    else 
	    	return 0;
	}

	public static void main(String[] args) {
		StaticInterface staticInterface = StaticMethodReference::printStaticMethod;
		staticInterface.print();
		
		Thread t1 = new Thread(StaticMethodReference :: printStaticMethod);
		staticInterface.print();
		
		 List<Employee> empList = JavaUtil.populateEmployeeList(); 
			
			CompareInterface  compareInterface = StaticMethodReference::compare;
			empList.sort(compareInterface::compare);

	}

	

}

@FunctionalInterface
interface StaticInterface {
	void print();
}



@FunctionalInterface
interface CompareInterface {
	int compare(Employee e1, Employee e2);
}