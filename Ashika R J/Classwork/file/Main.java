import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        File f=new File("filed.txt");
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