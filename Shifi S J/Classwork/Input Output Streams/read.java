package demo;

import java.io.*;
import java.util.Scanner;

public class Read {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {

        try(FileOutputStream fos = new FileOutputStream("demo.txt");
            BufferedOutputStream bis = new BufferedOutputStream(fos)) {
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
        BufferedInputStream bis;
        {
        System.out.println(("Enter the text write to file"));
        String msg = s.next();
        byte arr[] =msg.getBytes();
            bis.read(arr);
            System.out.println(("Success"));
        }

        System.out.println(("Reading from file"));
try(FileInputStream fis = new FileInputStream(("demo.txt");
    BufferedInputStream bis = new BufferedInputStream(fis);)
{

    int arr =bis.read();

    for(byte data:arr)
    {
        System.out.println((char)data);
    }

} catch (IOException e) {
    throw new RuntimeException(e);
}
    }
}
