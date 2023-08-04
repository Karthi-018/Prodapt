package iopackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteStream
{  //To write data to the file
    public static void main(String[] args)
    {
        File file=new File("Raghavi.txt");
        Scanner sc=new Scanner(System.in);

       try
       {   String name="Hi Hello";
           FileOutputStream fos=new FileOutputStream(file);
           byte arr[]=name.getBytes();
           fos.write(arr);
           System.out.println("Success!!!");

           System.out.println("Enter the Text write to file");
           String message = sc.nextLine();

           arr=message.getBytes();
           fos.write(arr);
           System.out.println("Success in  writing a console message to the text file");

       }
       catch (FileNotFoundException e)
       {
           throw new RuntimeException(e);
       }
       catch (IOException e) {
           throw new RuntimeException(e);
       }

    }
}
