package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = sc.nextLine();
        if (validateEmail(email)) {
            System.out.println(email + " is valid");
        } 
        else 
        {
            System.out.println(email + " is invalid");
        }
        
    }
    public static boolean validateEmail(String email)
    {
        if(!Character.isAlphabetic(email.charAt(0))&& Character.isLowerCase(email.charAt(0)))
        {
            return false;
        }
        int at=email.indexOf('@');
        int dot=email.indexOf('.');
        if(at==-1 || dot==-1) {
            return false;
        }
        String username = email.substring(0,at);
        String domain=email.substring(at+1,dot);
        String tld=email.substring(dot+1);
        if(!username.matches("[a-z0-9._()]+"))
        {
            return false;
        }
        if(!domain.matches("[a-z]+"))
        {
            return false;
        }

        if(!tld.matches("[a-z]{2,6}"))
        {
            return false;
        }

       return true;

    }

}