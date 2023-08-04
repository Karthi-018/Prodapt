package iopackage;

import java.io.*;


public class ReadStream
{
    //To read data from the file
    public static void main(String[] args)
    {
        char[] array = new char[100];

        try(FileReader fis=new FileReader("Raghavi.txt");)
        {
            fis.read(array);
            System.out.println("Reading the data from the file: ");
            for(char i:array)
            {
                if (i != 0)
                    System.out.print(i);
            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
