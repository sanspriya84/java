/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.util;

import java.util.ArrayList;
import java.util.List;

import com.java.priya.methodreference.Employee;

public class JavaUtil {

	public static List<Employee> populateEmployeeList() {
		Employee e1 = new Employee();
        e1.setEmpNo(1);
        e1.setEmpName("Priya");

        Employee e3 = new Employee();
        e3.setEmpNo(3);
        e3.setEmpName("Priya03");

        Employee e2 = new Employee();
        e2.setEmpNo(2);
        e2.setEmpName("Priya02");
        
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		return empList;
	}
}
