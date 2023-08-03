package org.example;

import java.io.FileOutputStream;

public class Sample {
    public static void main(String[] args) {
        try
        {
            FileOutputStream fos= new FileOutputStream("demo.txt");
            String msg="Hi hello";
            byte arr[]=msg.getBytes();
            fos.write(arr);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
