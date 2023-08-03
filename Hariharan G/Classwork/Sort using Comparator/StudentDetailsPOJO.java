package org.example;

public class StudentDetailsPOJO
{
    private int id;
    private String stuName;
    private long marks;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public long getMarks() {
        return marks;
    }

    public void setMarks(long marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int n) {
        this.id = n;
    }

    public StudentDetailsPOJO() {
    }

    public StudentDetailsPOJO(int n, String stuName, long marks) {
        this.id = n;
        this.stuName = stuName;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentDetailsPOJO{" +
                "ID=" + id +
                ", stuName='" + stuName + '\'' +
                ", marks=" + marks +
                '}';
    }
}
