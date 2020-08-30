package com.java.priya.serializedeserialize;

import java.io.Serializable;

// NotSerializableException will be thrown during deserialization if an object is tried for desrializaion without Serializable
// Default SerialVersiionUID will generate new ID for each change. So After serialization, if an object structure is modified,InvalidClassException will occur.
// transient fields will not be serialized.
// Static members are not serializable. before serialization, have one value. After Serilization, change the static value, and desirialize. It will not reflec the old value.
// Same with constructors. Constructors will not be called during deserialization is only for objects. empSalary will not become 20 after deserialization 
class EmpSerDeSer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6515250552249519223L;
	int empNo;
	String empName;
	long empSalary;

	public static String EMP_NAME = "JOHN22"; // No ser or Deser
	public transient String EMP_NAME_TRANSIENT = "JOE";
	
	EmpSerDeSer(){
		System.out.println(" Inside Constructor ");
		this.empSalary = empSalary+ 10;
	}

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

	/**
	 * @return the empSalary
	 */

	public long getEmpSalary() {
		return empSalary;
	}

	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}

}