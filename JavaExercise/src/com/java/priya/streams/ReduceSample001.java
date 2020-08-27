/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ReduceSample001 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(10, 100, 200, 300);
		Integer sum = list1.stream().reduce(20, (i1, i2) -> i1 + i2);
		System.out.println(sum);
		
		list1 = Arrays.asList();
		sum = list1.stream().reduce(20, (i1, i2) -> i1 + i2);
		System.out.println(sum);
	
		list1 = Arrays.asList(10, 100, 200, 300,400);
		sum = list1.stream().reduce(20, Integer::sum);
		System.out.println(sum);
		
		List<String> concatStringList = Arrays.asList("A","B","C","d","e"); 
		String concatString = concatStringList.stream().reduce("", (s1, s2) -> s1.concat(s2));
		System.out.println(concatString);
	
		 concatString = concatStringList.stream().reduce("", String::concat);
	     System.out.println(concatString);
	     
	     concatStringList = Arrays.asList(); 
	     concatString = concatStringList.stream().reduce("Empty", String::concat);
	     System.out.println(concatString); 
	     
	     // with combiner.
	     Employee e1 = new Employee();
	     e1.setEmpNo(1);
	     e1.setSalary(new BigDecimal(100));
	    
	     
	     Employee e2 = new Employee();
	     e2.setEmpNo(2);
	     e2.setSalary(new BigDecimal(300));
	     
	     List<Employee> empList = Arrays.asList(e1,e2);
	     empList.stream().reduce( new BigDecimal(4000),
	    		   (e1,e2) -> BigDecimal::add);
			
	}
	
}
	class Employee {
		public Employee() {}
		private int empNo;
		private BigDecimal salary;
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
		 * @return the salary
		 */
		public BigDecimal getSalary() {
			return salary;
		}
		/**
		 * @param salary the salary to set
		 */
		public void setSalary(BigDecimal salary) {
			this.salary = salary;
		}
		
		
	}
 
