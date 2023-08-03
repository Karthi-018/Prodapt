package org.example;
import java.util.*;

public class telephone {
    String name;
    public int number;

    public telephone(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "telephone{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
