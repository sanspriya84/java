/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class OverrideOnlyHashCode {

	public static void main(String args[]) {
		
		Map<Emp1,String> empMap = new HashMap<>();
		Emp1 e1 = new Emp1();
		e1.setEmpNo(1);
		e1.setFirstName("John");
		
		Emp1 e2 = new Emp1();
		e2.setEmpNo(1);
		e2.setFirstName("John");
		
		Emp1 e3 = new Emp1();
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

// Though after hashcode oeverride, e1 and e2 goes to same bucket and e3 goes to a different bucket.
// Since default equals() method always compares == the references no the content. Since each object is a new Object and resides in two memory location, 
// it will return false for e1==e2.
 
class Emp1{
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empNo;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		return result;
	}
	 
	
}
