package org.example;

public class StudentPojo
{
    public  int id;

    private String name;

    private int marks;

    StudentPojo(int id,String name,int marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public StudentPojo setName(String name) {
        this.name = name;
        return null;
    }

    public int getMarks() {
        return marks;
    }

    public int  setMarks(int marks) {
        this.marks = marks;
        return marks;
    }

    @Override
    public String toString()
    {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks ;
    }
}
