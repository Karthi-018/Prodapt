package org.example;

public class StudentClass {

    private int stuID;
    private String sName;
    private int marks;

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String sName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public StudentClass(int stuID, String sName, int marks) {
        this.stuID = stuID;
        this.sName = sName;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "stuID=" + stuID +
                ", sName='" + sName + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }
}