package org.example.email;
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the mailid:");
        String email=sc.next();
        boolean result=validateEmail(email);
        if(result)
        {
            System.out.println(email+" is valid");
        }
        else {
            System.out.println(email+" is invalid" );
        }

    }
    static boolean validateEmail(String email)
    {
        String regex="^[a-z]([A-Za-z0-9_.])+@[a-z]+\\.[a-z]{2,6}$";
        boolean validate=email.matches(regex);
        return validate;
    }

}
