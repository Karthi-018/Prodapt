package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
import java.util.Scanner;

public class Filecreate
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        File f=new File("filer.txt");
        try (FileOutputStream fos = new FileOutputStream(f);
             BufferedOutputStream b = new BufferedOutputStream(fos);)
        {
            System.out.println("Enter Text:");
            String st = s.next();
            byte arr[] =st.getBytes();
            b.write(arr);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
