package org.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try(FileInputStream fis= new FileInputStream("demo.txt");
            ObjectInputStream ois= new ObjectInputStream(fis)){
            System.out.println(ois.readObject());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
