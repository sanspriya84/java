/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.methodreference;

import java.util.List;

import com.java.priya.util.JavaUtil;

public class InstanceMethodReference {

	public void printInstanceMethod() {
		System.out.println(" I'm instance method");
	}

	public int compare(Employee e1, Employee e2) {
		if (e1.getEmpNo() > e2.getEmpNo())
			return 1;
		else if (e1.getEmpNo() < e2.getEmpNo())
			return -1;
		else
			return 0;
	}

	public static void main(String[] args) {
		 
		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
		FunctionalInterfaceInstance functionalInterfaceInstance = instanceMethodReference::printInstanceMethod;
		functionalInterfaceInstance.print();
		
		
		 List<Employee> empList = JavaUtil.populateEmployeeList(); 
			
			CompareInterface  compareInterface = instanceMethodReference::compare;
			empList.sort(compareInterface::compare);
			empList.forEach(e1-> System.out.println(e1.getEmpNo() + " " + e1.getEmpName()));
			
			empList = JavaUtil.populateEmployeeList(); 
			empList.sort( (e1,e2) -> {return e1.getEmpName().compareTo(e1.getEmpName());});
		    empList.forEach(e1-> System.out.println(e1.getEmpNo() + " " + e1.getEmpName()));
			
	}

}

@FunctionalInterface
interface FunctionalInterfaceInstance {

	public void print();
}
