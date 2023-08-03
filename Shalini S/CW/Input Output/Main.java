import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;

class IOStream{
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        File f=new File("demo.txt");
        try{
            char s=sc.next().charAt(0);
            FileOutputStream fos=new FileOutputStream(f);
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            FileInputStream fis=new FileInputStream(f);
            BufferedInputStream bis=new BufferedInputStream(fis);
            fos.write(s);
            System.out.println(fis.read());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
