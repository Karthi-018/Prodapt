package org.example;

import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        System.out.println();
        InputStreamReader isr= new InputStreamReader(System.in);
        try{
            byte n=(byte)isr.read();
            System.out.println((char)n);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
