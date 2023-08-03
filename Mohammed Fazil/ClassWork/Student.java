package org.example.dao;

public class Student {
    public int  sid;
    public String sname;
    public int marks;

    public Student(int sid, String sname, int marks) {
        this.sid = sid;
        this.sname = sname;
        this.marks = marks;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString(){
        return sid+" "+sname+" "+marks;
    }
}