/*
*   @author SHANMUGA PRIYA
*/
package com.java.priya.serializedeserialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeSample {

	public static void main(String[] args) {

		EmpSerDeSer e1 = new EmpSerDeSer();
		e1.setEmpNo(1);
		e1.setEmpName("Priya");

		System.out.println(" Before Serialization ");
		System.out.println(e1.getEmpNo() + " " + e1.getEmpName() + " salary " + e1.getEmpSalary());
		try (FileOutputStream fos = new FileOutputStream(new File("TestEmployee"));
				ObjectOutputStream os = new ObjectOutputStream(fos);) {
			os.writeObject(e1);
		} catch (Exception ex) {
			System.out.println(ex);
		} 
	
		
		
		
	}

}
 