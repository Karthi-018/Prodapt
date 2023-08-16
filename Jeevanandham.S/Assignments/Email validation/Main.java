package org.example.regex;
import java.util.Scanner;
import java.util.regex.*;
public class Main {


    static Boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("[a-z][a-zA-Z0-9._]+@[a-z]+[.][a-z]{2,6}");
        Matcher match = pattern.matcher(email);
        boolean matchFound = match.matches();
        return matchFound;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email");
        String email = sc.next();
        if(validateEmail(email)){
            System.out.println("Email is valid");
        }
        else{
            System.out.println("Email is invalid");
        }

    }
}
