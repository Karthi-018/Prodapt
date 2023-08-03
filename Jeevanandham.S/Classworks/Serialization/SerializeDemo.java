package org.example.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDemo implements Serializable {
    String s = "Hii Hello";

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        SerializeDemo sd = new SerializeDemo();
        try
                (FileOutputStream fis = new FileOutputStream("myfile.txt",true);
                 ObjectOutputStream oos = new ObjectOutputStream(fis);)
        {
            oos.writeObject(sd);
            System.out.println("success");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
