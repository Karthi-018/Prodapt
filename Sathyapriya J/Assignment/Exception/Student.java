public class Student
{
    int sid;
    String sname;
    int marks;

    Student(int sid,String sname,int marks)
    {
        this.sid = sid;
        this.sname = sname;
        this.marks = marks;
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
    public String getSname()
    {
        return sname;
    }
    public void marks(int marks)
    {
        this.marks = marks;
    }
    public int marks()
    {
        return marks;
    }
    public String toString()
    {
        return  "Student Id : "+sid+" Student Name : "+sname+" Marks : "+marks;
    }
}
