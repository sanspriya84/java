/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierSample {

	public static void main(String[] args) {

		List<EmpSupplier> empList = new ArrayList<>();
		EmpSupplier e1 = new EmpSupplier();
		e1.setEmpNo(1);
		e1.setEmpName("John");
		empList.add(e1); 
		
		Supplier<EmpSupplier> c1 = () -> {
			EmpSupplier e2 = new EmpSupplier();
			e2.setEmpNo(2);
			e2.setEmpName("Joe");
			return e2; 
		};
		
		 
		empList.add(1, c1.get());
		
		empList.forEach( empSupplier -> System.out.println(empSupplier.getEmpName()));

	}

	
}

class EmpSupplier{
	int empNo;
	String empName;
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
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empNo;
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
		EmpSupplier other = (EmpSupplier) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empNo != other.empNo)
			return false;
		return true;
	}
	
	
	
}