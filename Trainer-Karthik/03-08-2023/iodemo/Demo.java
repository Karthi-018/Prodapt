package edu.prodapt.demos.iodemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);
		 
		try(FileOutputStream fos = new FileOutputStream("demo.txt");
			BufferedOutputStream bis = new BufferedOutputStream(fos);)
		{
		
		System.out.println("Enter the Text write to file");
		String msg = s.next();
		byte arr[] = msg.getBytes();
		bis.write(arr);
		System.out.println("Write Operation Success!!!");
		}
		catch (FileNotFoundException e) {System.out.println(e);		}
		catch (IOException e) {System.out.println(e);		}	
		
		System.out.println("Reading from file");
		
		try(FileInputStream fis = new FileInputStream("demo.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);)
		{
			byte arr[] = bis.readAllBytes();
			for(byte data:arr)
			{
				System.out.print((char)data);
			}
		}
		catch (FileNotFoundException e) {System.out.println(e);		}
		catch (IOException e) {System.out.println(e);		}	

	}

}
