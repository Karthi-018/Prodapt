package org.example;

import java.io.*;

public class Serialization implements Serializable {

    String word="Welcome to Serialization";

    @Override
    public String toString() {
        return "Serialization{" +
                "word='" + word + '\'' +
                '}';
    }
    public static void main(String args[])
    {
        File f=new File("sample.txt");
        Serialization see=new Serialization();
        try
            (FileOutputStream fos= new FileOutputStream("sample.txt");
             ObjectOutputStream oos=new ObjectOutputStream(fos);) {
            oos.writeObject(see);
            System.out.println("Done");
        }
        catch (Exception e){
            System.out.println(e);
    }

    }

}
