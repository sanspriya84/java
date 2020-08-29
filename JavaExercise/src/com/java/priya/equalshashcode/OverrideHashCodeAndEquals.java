/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class OverrideHashCodeAndEquals {

	public static void main(String args[]) {
		
		Map<Emp2,String> empMap = new HashMap<>();
		Emp2 e1 = new Emp2();
		e1.setEmpNo(1);
		e1.setFirstName("John");
		
		Emp2 e2 = new Emp2();
		e2.setEmpNo(1);
		e2.setFirstName("John");
		
		Emp2 e3 = new Emp2();
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

// The custom HashCode generation is based on the empNo and the firstName, e1 and e2 will reside in the same bucket because both generate the same hashcode and e3 will reside in another bucket.
// custom equals compares the content .
class Emp2{
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
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp2 other = (Emp2) obj;
		if (empNo != other.empNo)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		return true;
	}
	 
	
	
}
