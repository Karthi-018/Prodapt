
import java.io.*;
import java.util.*;
public class resource {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        File f=new File("main.txt");
        /*try(FileOutputStream fos=new FileOutputStream(f);
        BufferedOutputStream bos=new BufferedOutputStream(fos);)
        {
            String s=sc.next();
            byte arr[]=s.getBytes();
            fos.write(arr);

        }
        catch (Exception e){
            System.out.println(e);
        }*/
        try(FileReader fis=new FileReader(f);
            BufferedReader bis=new BufferedReader(fis);)
        {
            System.out.println(bis.readLine());

        }
        catch(Exception e) {
            System.out.println(e);
        }


    }
}
