package org.example;

import java.io.InputStreamReader;
//in this program other than 1 byte cannot be readen

public class Exampletoreadfirstbyte {
    public static void main(String[] args) {
        InputStreamReader isr=new InputStreamReader(System.in);
        try{
            byte n=(byte) isr.read();
            System.out.println((char)n);//char will convert the ascii value to the original character value
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
