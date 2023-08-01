class Student
{
int sid;
String sname;
int marks;
Student(int sid,String sname,int marks)
{
this.sid=sid;
this.sname=sname;
this.marks=marks;
}
public void setSid(int sid)
{
this.sid=sid;
}
public int getSid()
{
return sid;
}
public void setSname(String sname)
{
this.sname=sname;
}
public String getSname()
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
return "s_id:"+sid+" s_name:"+sname+" mark:"+marks;
}
}