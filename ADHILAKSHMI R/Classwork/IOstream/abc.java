package org.example;

import java.io.*;

public class abc implements Serializable {
    public static void main(String args[]) {
        String str = "IO stream";
        File file = new File("adhi.txt");

        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);)
        {

            System.out.println("Hi");
            oos.writeObject(new abc());
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }