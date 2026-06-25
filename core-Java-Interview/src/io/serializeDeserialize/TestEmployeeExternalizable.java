package io.serializeDeserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalizable {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee(12, "Ram");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Employee.txt"));

		out.writeObject(e);
		
		System.out.println(out);

		out.close();

		System.out.println("object serialized successfully");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Employee.txt"));

		System.out.println(in.readObject());

		in.close();

	}
}
