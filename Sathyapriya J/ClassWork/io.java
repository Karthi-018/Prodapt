import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class io {
    public static void main(String a[])
    {
        try(FileOutputStream fos = new FileOutputStream("Demo.txt");)
        {

            String msg = "Hi Hello";
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
