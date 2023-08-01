import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ExceptionTry {


    public static void main(String[] args)
    {
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println(c + "error rectified");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("ended");
    }
}
