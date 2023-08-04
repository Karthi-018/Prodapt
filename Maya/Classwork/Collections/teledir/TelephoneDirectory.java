package org.example.teledir ;

public class TelephoneDirectory {
    String name;
    int phno;

    public TelephoneDirectory(String name, int phno) {
        this.name = name;
        this.phno = phno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }


    @Override
    public String toString() {
        return "TelephoneDirectory{" +
                "name='" + name + '\'' +
                ", phno=" + phno +
                '}';
    }
}
