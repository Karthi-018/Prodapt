package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String email = s.next();
        boolean mail = validateEmail(email);
        if (mail) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is Invalid");
        }

    }

    public static boolean validateEmail(String email) {
        if (email.matches("[a-z][a-zA-Z0-9._]+@[a-z]+\\.[a-z]{2,6}")) {
            return true;
        } else {
            return false;
        }
    }
}