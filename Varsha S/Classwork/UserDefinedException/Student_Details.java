public class Student_Details
{
private int sid;
private String sname;
private int marks;

public Student_Details(int sid, String sname, int marks)
{
this.sid = sid;
this.sname = sname;
this.marks = marks;
}

public void setid(int sid)
{
this.sid = sid;
}

public int getid()
{
return sid;
}

public void setname(String sname)
{
this.sname = sname;
}

public String getname()
{
return sname;
}

public void setmarks(int marks)
{
this.marks = marks;
}
public int getmarks()
{
return marks;
}
public String toString()
{
return "Name: " + sname + " ID: " + sid + " Marks: " + marks;
}
}


