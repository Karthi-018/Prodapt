package org.example;

public class telephone{
    String name;
    int number;

    public telephone(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", number=" + number
                ;
    }

    public void setNumber(int number) {
        this.number = number;

    }
}
