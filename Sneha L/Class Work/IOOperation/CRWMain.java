import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CRWMain {
    public static void main(String[] args) throws IOException {
        //Create file---------------->
        File f=new File("David.txt");
        f.createNewFile();

        //Write file----------------->
        Scanner sc=new Scanner(System.in);
        FileOutputStream fos=new FileOutputStream("David.txt");
        String s=sc.nextLine();
        byte[] arr =s.getBytes();
        fos.write(arr);
        //Read file------------------>
        FileInputStream fis=new FileInputStream("David.txt");
        Scanner sc=new Scanner(f);
        while(sc.hasNext()){
//            Print character wise
//            String s= sc.nextLine();
//            for(int i=0;i<s.length();i++)
//                System.out.println(s.charAt(i));
           System.out.println(sc.next());
        }

    }
}
