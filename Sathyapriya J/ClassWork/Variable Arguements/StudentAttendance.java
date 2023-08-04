package PracticePackage.VarArgs;     //------------------->package created

import java.util.Scanner;

public class StudentAttendance 
{
	
	private int sid;
	private String sname;

	StudentAttendance()
	{
		
		sid = 0;
		sname =  null;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public int getSid()
	{
		return sid;
	}
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	public String getname()
	{
		return sname;
	}
	public String toString()
	{
		return sid+" "+sname;
	}
	public void StudentAtten(StudentAttendance x : 
	
}