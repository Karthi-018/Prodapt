package org.example;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String email = sc.next();

        boolean isValid = validateEmail(email);


        if (isValid) {

            System.out.println("Email is valid");

        } else {

            System.out.println("Email is invalid");

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

