package org.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {
    String str="Welcome to java world";

    @Override
    public String toString() {
        return str;
    }

    public static void main(String[] args) {
        Serialization s = new Serialization();
        try (FileOutputStream fos = new FileOutputStream("demo.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(s);
            System.out.println("sucess");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
