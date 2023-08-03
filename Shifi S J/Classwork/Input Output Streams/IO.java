package demo;
import java.io.InputStreamReader;
public class IO {
    public static void main(String[] args) {
        System.out.println();
        InputStreamReader isr = new InputStreamReader(System.in);
        try{
            byte n =(byte) isr.read();
            System.out.println((char)n);
            System.out.println((n));
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
