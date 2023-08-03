package edu.prodapt.demos.iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialiDemo implements Serializable {
	@Override
	public String toString() {
		return str;
	}

	String str = "Hi Hello";

	public static void main(String[] args) {
		
		Employee emp = new Employee(101, "ABC", 10000);
		
		System.out.println(emp);
		File file = new File("test.txt");
		try(FileOutputStream fis = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fis);)
		{
			SerialiDemo o = new SerialiDemo();
			oos.writeObject(o);
			oos.writeObject(new SerialiDemo());
			System.out.println("Success!!!");
		}
		catch (FileNotFoundException e) {System.out.println(e);		}
		catch (IOException e) {System.out.println(e);		}	

	}

}
