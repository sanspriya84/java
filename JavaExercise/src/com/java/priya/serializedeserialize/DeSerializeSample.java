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

public class DeSerializeSample {

	public static void main(String[] args) {
 
	
		try (FileInputStream fos = new FileInputStream(new File("TestEmployee"));
				ObjectInputStream os = new ObjectInputStream(fos);) {
			EmpSerDeSer e2 = (EmpSerDeSer) os.readObject();
			System.out.println(e2.getEmpNo() + " name " + e2.getEmpName() + " salary " + e2.getEmpSalary());
			System.out.println(" transient " + e2.EMP_NAME_TRANSIENT );
			System.out.println(" static " + EmpSerDeSer.EMP_NAME);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}

}
 