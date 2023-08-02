package org.example.Collections;

public class StudentCollections {
    int sid;
    String sname;
    int marks;

    public StudentCollections(int sid, String sname, int marks) {
        this.sid = sid;
        this.sname = sname;
        this.marks = marks;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public int getMarks() {
        return marks;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String toString()
    {
        return "\nId: "+sid+" Name: "+sname+" Marks: "+marks;
    }
}
