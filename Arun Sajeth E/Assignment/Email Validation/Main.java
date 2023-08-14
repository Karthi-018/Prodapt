package org.example;

import java.util.Scanner;

public class Main
{
    private static String user;
    private static String domain;
    private static String tld;

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();
        boolean flag = valid_email(email);
        if(flag) {
            System.out.println("Email is valid");
        }
        else{
            System.out.println("Email is invalid");
        }
    }

    public static boolean valid_email(String email)
    {
        if(email.contains("@")) {
            user = email.substring(0,email.indexOf("@"));
            String temp = email.substring(email.indexOf("@")+1);
            if(!Character.isLowerCase(user.charAt(0)))
            {
                return false;
            }
            if(temp.contains(".")) {
                domain = temp.substring(0,temp.indexOf("."));
                tld = temp.substring(temp.indexOf(".")+1);
                boolean flag_domain = check(domain);
                boolean flag_tld = false;
                boolean flag_user = userCheck();
                if(tld.length()>2 && tld.length()<7) {
                    flag_tld = check(tld);
                }
                if(flag_domain && flag_tld && flag_user) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean check(String temp)
    {
        char[] ch = temp.toCharArray();
        for(char c:ch) {
            if(!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
    public static boolean userCheck()
    {
        char[] ch = user.toCharArray();
        for(char c:ch) {
            if(!Character.isLowerCase(c) && !Character.isDigit(c) && c!='.' && c!='_') {
                return false;
            }
        }
        return true;
    }
}
