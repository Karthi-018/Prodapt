package demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("demo.txt");

            String msg = "Hiiiii";
            byte arr[] =msg.getBytes();
            fos.write(arr);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
            catch(IOException e)
            {
                System.out.println((e));
            }
           
            }
        }

    }
}