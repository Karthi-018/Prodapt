package org.example;

import java.util.Scanner;

public class mainmail
         {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the mail");
        try {
            mail o = new mail(s.next());
            System.out.println( o.validatEmail(o.getmail()));

        }
        catch(Exception e) {
            //System.out.println(e);
            throw new InvalidEmail();
        }

    }

}
