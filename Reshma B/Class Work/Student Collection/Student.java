package org.example.dao;

public class Student{

    int sid;
    String Sname;
    int marks;

    public Student(int sid, String Sname, int marks) {
        this.sid = sid;
        this.Sname=Sname;
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

    public void setSname(String Sname)
    {
        this.Sname=Sname;
    }

    public String getSname()
    {
        return Sname;
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
        return "Student Details[Student ID: " + sid + ", Student Name: " + Sname + ", Marks Scored:" + marks + "]";
    }
}
