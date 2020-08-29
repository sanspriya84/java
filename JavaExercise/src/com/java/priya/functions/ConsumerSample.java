/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {

	public static void main(String[] args) {

		List<EmpConsuumer> empList = new ArrayList<>();
		EmpConsuumer e1 = new EmpConsuumer();
		e1.setEmpNo(1);
		e1.setEmpName("John");
		
		EmpConsuumer e2 = new EmpConsuumer();
		e2.setEmpNo(2);
		e2.setEmpName("Joe");
		
		empList.add(e1);
		empList.add(e2);
		
		Consumer<EmpConsuumer> c1 = empConsumer -> {
			empConsumer.setEmpNo( empConsumer.getEmpNo() + 10);
		//	 System.out.println(empConsumer.getEmpNo() +  ", " +empConsumer.getEmpName()); 
		};
		
		
		Consumer<EmpConsuumer> c2 = empConsumer -> {
			empConsumer.setEmpNo( empConsumer.getEmpNo() + 40);
			 System.out.println(empConsumer.getEmpNo() +  ", " +empConsumer.getEmpName()); 
		};
		
		empList.forEach(c1.andThen(c2));

	}

	
}

class EmpConsuumer{
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
		EmpConsuumer other = (EmpConsuumer) obj;
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