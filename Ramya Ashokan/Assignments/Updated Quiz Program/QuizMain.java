package org.example.Quizes;
import java.util.*;

public class QuizMain {

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        QuizService qs=new QuizService();
        Quiz temp[]=qs.questions();
        char u_ans[]=new char[10];
        System.out.println("------------Get Ready to attend the Quiz!---------------");
        int choice=0;
        int i=0;
        System.out.println(temp[0].getQuestion());
        System.out.println(temp[0].getOpt1());
        System.out.println(temp[0].getOpt2());
        System.out.println(temp[0].getOpt3());
        System.out.println(temp[0].getOpt4());
        u_ans[0] = sc.next().charAt(0);
        for(i=1;i<=temp.length;i++) {
            if(i<=temp.length)
            {
            System.out.println("Enter -1 ->Previous (or) 1->Next");
            choice=sc.nextInt();
            sc.nextLine();}
            if(i!=1&& choice==-1)
            {
                i=i-2;
                System.out.println(temp[i].getQuestion());
                System.out.println(temp[i].getOpt1());
                System.out.println(temp[i].getOpt2());
                System.out.println(temp[i].getOpt3());
                System.out.println(temp[i].getOpt4());
                u_ans[i] = sc.next().charAt(0);
                if(i==temp.length+1)
                {
                    break;
                }
                i++;

            }
            else if(i<10&& choice==1)
            {
               // i=i;
                System.out.println(temp[i].getQuestion());
                System.out.println(temp[i].getOpt1());
                System.out.println(temp[i].getOpt2());
                System.out.println(temp[i].getOpt3());
                System.out.println(temp[i].getOpt4());
                u_ans[i] = sc.next().charAt(0);

            }


        }
        qs.evaluate(u_ans);



        }



}
