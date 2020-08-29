/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class DefaultHashAndEquals {

	public static void main(String args[]) {
		
		Map<Emp,String> empMap = new HashMap<>();
		Emp e1 = new Emp();
		e1.setEmpNo(1);
		e1.setFirstName("John");
		
		Emp e2 = new Emp();
		e2.setEmpNo(1);
		e2.setFirstName("John");
		
		Emp e3 = new Emp();
		e3.setEmpNo(3);
		e3.setFirstName("Peter");
		empMap.put(e1,"Johns First");
		empMap.put(e2,"Johns seconds");
		empMap.put(e3,"Joes");

		System.out.println(empMap.get(e1));
		System.out.println(empMap.get(e2));
		System.out.println(empMap.get(e3));
		// Expected Johns seconds, Johns seconds, Joes
	}
}

// Default Hash code always generates a new Hashcode for each object created. So all, will be in different, buckets.
// 
class Emp{
	int empNo;
	String firstName;
	/**
	 * @return the empNo
	 */
	public int getEmpNo() {
		return empNo;
	}
	/**
	 * @param empNo the empNo to set
	 */
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
