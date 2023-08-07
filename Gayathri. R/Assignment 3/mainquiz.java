package org.example;
import java.util.Scanner;
public class mainquiz {
    public static void main(String[] args) {
        servicequizz obj=new servicequizz();
        System.out.println("ARE YOU READY TO TAKE QUIZ QUESTIONS\n ENTER YES TO PROCEED");
        Scanner ss=new Scanner(System.in);
        String choice =ss.next();
        if(choice.equals("yes")) {
            obj.corequiz();
        }
    }
}
