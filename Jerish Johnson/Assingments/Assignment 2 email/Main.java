package org.example;

import java.text.*;
import java.util.Scanner;

import static java.lang.Character.*;


public class Main {

    static boolean validateEmail(String email){
        if(email.indexOf("@")==-1){
            return false;
        }
        String []sep=email.split("@");
        String t=sep[0];
        String g=sep[1];

        char[] first =t.toCharArray();
        for(int i=0;i<t.length();i++){
            if (!isLowerCase(first[i]) && !isDigit(first[i]) && first[i]!='.' && first[i]!='_'){
                return false;
            }
        }
        if(g.indexOf(".")==-1){
            return false;
        }

        String []sep2=g.split("\\.");
        String h =sep2[0];
        String i=sep2[1];

        char [] domain=h.toCharArray();

        for(int j=0;j<h.length();j++){
            if (!Character.isLowerCase(domain[j])){
                return false;
            }
        }
        char [] TLD=i.toCharArray();
        if (i.length()>=2 && i.length()<7) {
            for (int k = 0; k < i.length(); k++) {
                if (!isLowerCase(TLD[k])) {
                    return false;
                }
            }

        }
        else{
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your emailid : ");
        String email=sc.next();
        Emailpojo ep=new Emailpojo(email);

        if ((validateEmail(ep.getEmail())==true)){
            System.out.println("The email id valid ");
        }
        else{
            System.out.println("The email is invalid");
        }
    }
}