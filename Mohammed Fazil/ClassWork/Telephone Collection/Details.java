package org.example;

public class Details {
     String name;
     int ph_NO;

    public Details(String name, int ph_NO) {
        this.name =  name;
        this.ph_NO= ph_NO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPh_NO() {
        return ph_NO;
    }

    public void setPh_NO(int ph_NO) {
        this.ph_NO = ph_NO;
    }

    public String toString() {
        return name + " " + ph_NO;
    }
}
