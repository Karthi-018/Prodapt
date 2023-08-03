package org.example.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialiDemo {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("myfile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);)
        {
            System.out.println(ois.readObject());

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
