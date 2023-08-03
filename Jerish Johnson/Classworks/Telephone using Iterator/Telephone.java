package org.example;

import jdk.nashorn.internal.ir.ReturnNode;

public class Telephone {
    String name;
    int phno;

    public Telephone(String name, int phno) {
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

    public String toString(){
        return name+" : "+phno;
    }
}
