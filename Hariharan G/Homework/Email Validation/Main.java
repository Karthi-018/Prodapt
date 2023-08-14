package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main
{
    static Scanner sc=new Scanner(System.in);
    boolean flag=true;
    static boolean validateEmail(String email){
        String pattern="[a-z][a-z0-9._]+@[a-z]+.[a-z]{2,6}";  //regular expression
        Pattern p=Pattern.compile(pattern); // pattern obj p
        Matcher m=p.matcher(email); // matcher obj m interprets pattern in p and perform operation in string email
        Boolean b=m.matches();
        //System.out.println(b);
        return b;





        //return Pattern.matches(pattern,email);
    }
    public static void main(String[] args) {
        System.out.println("EMAIL VALIDATION PROGRAM!");
        System.out.println("ENTER EMAIL ID FOR VALIDATION: ");
        String email;
        boolean flag=validateEmail(email=sc.next());
        if(flag==true){
            System.out.println(email +" is a valid email id");
        }
        else{
            System.out.println(email +" is not a valid email id");
        }


    }
}
