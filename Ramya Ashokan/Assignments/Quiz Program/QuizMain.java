package org.example.Quizes;
import java.util.*;

public class QuizMain {
    static char ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10;
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        QuizService qs=new QuizService();
        //QuizMain qu=new QuizMain();
        System.out.println("------------Get Ready to attend the Quiz!---------------");
        int choice;
        System.out.println("------------Enter 1 to start------------ ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                qs.question1();
                System.out.println("Enter any of this option:");
                 ch1=sc.next().charAt(0);
            case 2:
                qs.question2();
                System.out.println("Enter any of this option:");
                 ch2=sc.next().charAt(0);
            case 3:
                qs.question3();
                System.out.println("Enter any of this option:");
                ch3=sc.next().charAt(0);
            case 4:
                qs.question4();
                System.out.println("Enter any of this option:");
                ch4=sc.next().charAt(0);
            case 5:
                qs.question5();
                System.out.println("Enter any of this option:");
                ch5=sc.next().charAt(0);
            case 6:
                qs.question6();
                System.out.println("Enter any of this option:");
                ch6=sc.next().charAt(0);
            case 7:
                qs.question7();
                System.out.println("Enter any of this option:");
                ch7=sc.next().charAt(0);
            case 8:
                qs.question8();
                System.out.println("Enter any of this option:");
                ch8=sc.next().charAt(0);
            case 9:
                qs.question9();
                System.out.println("Enter any of this option:");
                ch9=sc.next().charAt(0);
            case 10:
                qs.question10();
                System.out.println("Enter any of this option:");
                ch10=sc.next().charAt(0);
            default:
                System.out.println("Thanks to attend the Quiz");


        }

        char [] marks={ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10};
        qs.evaluate(marks);
    }
}
