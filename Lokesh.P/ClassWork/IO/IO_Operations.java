package org.example;

import java.io.*;
import java.util.Scanner;

public class IO_Operations implements Serializable {

    public static void main(String[] args) throws IOException {
        File file=new File("Test.txt");
        file.createNewFile();
        try( FileInputStream fis=new FileInputStream(file);
             FileOutputStream fos= new FileOutputStream(file,true);
             BufferedOutputStream bos=new BufferedOutputStream(fos);)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter text to write in file:\n");
            String s=sc.nextLine();
            byte[] arr=s.getBytes();
            bos.write(arr);
            System.out.println("SUCCESS!!!");




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileInputStream fis=new FileInputStream("Hari.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);)
        {
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                System.out.println(sc.next());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
