package iopackage;

import java.io.*;

public class SerialStream implements Serializable
{
    String str="HELL0 ABC";


    public static void main(String[] args)

    {   EmployeePojo obj=new EmployeePojo(101,"Raghavi",100000);
        System.out.println(obj);

        File file=new File("text.txt");
        try(FileOutputStream fos=new FileOutputStream(file,true); ObjectOutputStream oos=new ObjectOutputStream(fos);)
        {

            SerialStream object=new SerialStream();

            //writing the serialStream class object to an external file
            oos.writeObject(object);
            System.out.println("SUCCESS 1");

            //writing the EmployeePojo class object to an external file
            oos.writeObject(obj);

            System.out.println("SUCCESS 2");

        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }

    @Override
    public String toString()
    {
        return "InputOutput{" +
                "str='" + str + '\'' +
                '}';
    }
}
