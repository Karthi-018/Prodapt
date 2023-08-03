package org.example;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class iostream
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try(FileOutputStream fos = new FileOutputStream("Demo.txt");)
        {
            System.out.println("Enter the text write to file");
            String msg = sc.next();
            byte arr[] = msg.getBytes();
            fos.write(arr);
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

}

