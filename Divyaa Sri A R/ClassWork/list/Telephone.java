package org.example.list;

public class Telephone {
        String name;
        String number;

    public Telephone(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "org.example.list.Telephone{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
