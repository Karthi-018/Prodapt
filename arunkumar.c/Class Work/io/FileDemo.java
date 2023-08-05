package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        /* READ FILE*/
        File f =new File("bb.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter("bb.txt");
        fw.write("na dhan arun");
        fw.close();

        /*Scanner sc = new Scanner(f);
        while(sc.hasNext()){
            System.out.println(sc.next());*/
        }
        //1. With the help of buffered reader
        /*
        File f = new File("hi.txt");
        BufferedReader br = new BufferedReader(new FileReader("hi.txt"));
        String content = br.readLine();
        System.out.println(content);*/
        //f.createNewFile();

        // 2. with the help of scanner
        /*
        File f =new File("hi.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNext()){
            System.out.println(sc.next());
        }*/
        // WRITING DATA TO A FILE
        /*
        1)
        Path p = Path.of("hi.txt");
        Files.writeString(p,"hi da");
        */

        /*
        2.
        FileWriter fw = new FileWriter("hi.txt");
        fw.write("na dhan arun");
        fw.close();
        */

    }
//}
