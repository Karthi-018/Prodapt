package edu.prodapt.jdbc;
import java.util.*;
public class maincollege {
	
	public static void main(String a[]) throws Exception
	{
		ArrayList<college> al=new ArrayList<>();
		college o=new college();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the line");
		String line=s.next();
		al.add(o.adddata(line));
		
		
	}

}
