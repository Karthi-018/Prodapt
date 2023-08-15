

import java.util.*;
import java.util.regex.*;
public class Main{
   static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**************THIS IS EMAIL VALIDATION****************");
        System.out.println("Enter Email id to validate: ");
        String email = sc.next();

        boolean e=validateEmail(email);

        if (e) {
            System.out.println(email + " is valid ");
        } else {
            System.out.println(email + " is invalid");
        }

    }

    public static boolean validateEmail(String email)
    {
        String check = "[a-z][a-zA-Z0-9._]+[@][a-z]+[.][a-z]{2,6}";
        Pattern pa = Pattern.compile(check);
        Matcher mat = pa.matcher(email);
        flag = mat.matches();
        return flag;
    }

}
