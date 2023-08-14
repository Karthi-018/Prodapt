
import java.util.*;
import java.util.regex.*;

public class Main
{
    static Scanner s=new Scanner(System.in);
    public static boolean validateEmail(String email)
    {
        String regex="[a-z][a-zA-Z0-9_.]+[@][a-z]+[.][a-z]{2,6}";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(email);
        return m.matches();
    }

    public static void main(String [] args)
    {
        System.out.println("NOTE: The email ID should start only with lowercase \nand can contain alphabets and special characters '.' and '_'.\nThe top level domain (TDL) should have 2 to 6 characters and contain only alphabets.\nFor example- username@domain.TLD");
        System.out.println("\nEnter your email ID: ");
        String uEmail=s.nextLine();
        if (validateEmail(uEmail))
        {
            System.out.println("Valid Email");
        }
        else
        {
            System.out.println("Invalid Email");
        }
    }

}