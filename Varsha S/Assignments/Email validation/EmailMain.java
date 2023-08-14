import java.util.*;
import java.lang.*;

import static java.lang.Character.isLowerCase;

public class EmailMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello!! Enter your Mail ID:");
        String e_mail = sc.nextLine();
        Email email = new Email(e_mail);
        if (validateEmail(email.getMail())) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }

    static Boolean validateEmail(String email)
    {
        //checks if the email starts with lowercase alphabet
        char first_letter = email.charAt(0);
        if (!Character.isLowerCase(first_letter))
        {
            return false;
        }

        //checks if the username contains only lowercase alphabets, numbers, . and _
        int a = email.indexOf("@");
        String uname = email.substring(0, a);
        for (char check : uname.toCharArray())
        {
            if (!Character.isLowerCase(check))
                if (!Character.isDigit(check))
                    if (check != '.' || check != '_')
                        return false;
        }

        //checks if the domain name has only lowercase alphabets
        String dname = email.substring(a + 1);
        for (char d : dname.toCharArray())
        {
            if (Character.isLowerCase(d))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        //checks if there is @ after the username
        if (uname.indexOf('@') < uname.length() - 1)
        {
            return false;
        }

        //to get the TLD and check if it has only lowercase alphabets and is between 2 and 6 letters
        int b = dname.lastIndexOf(".");
        String TLD = null;
        if(b != -1 && b < dname.length()-1)
        {
            TLD = dname.substring(b+1);
        }
        if(TLD.length() >= 2 && TLD.length() <=6)
        {
            for (char d1 : TLD.toCharArray())
            {
                if (isLowerCase(d1))
                {
                    return true;
                }
                else
                {
                    return false;
                }

            }
        }

         return true;

    }
}
