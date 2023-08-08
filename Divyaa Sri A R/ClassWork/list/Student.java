public class Student
{
	int sid;
	String sname;
	int marks;

	public Student(int sid, String sname, int marks) 
	{
        	this.sid = sid;
        	this.sname = sname;
        	this.marks = marks;
	}

	public void setSid(int sid)
	{
		this.sid=sid;
	}
	public int getSid()
	{
		return sid;
	}

	public void setSName(String sname)
	{
		this.sname=sname;
	}
	public String getSName()
	{
		return sname;
	}

	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public int getMarks()
	{
		return marks;
	}
	public String toString() 
	{
        	return "Student id: " + sid +"\nStudent name: " + sname +"\nStudent marks: " + marks;
	}
}