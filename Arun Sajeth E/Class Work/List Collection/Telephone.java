package org.example;

public class Telephone
{
    private int phno;
    private String name;

    public Telephone(int phno, String name) {
        this.phno = phno;
        this.name = name;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "phno=" + phno +
                ", name='" + name + '\'' +
                '}';
    }
}
