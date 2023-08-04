package org.example;

import java.util.*;
public class Quiz_Service
{
    static Scanner sc= new Scanner(System.in);
    static String[] answer=new String[10];
    static int mark=0;
    public static void quiz_working(Quiz[] quest)
    {
        int i=0;
        while(i<10)
        {
            if(i==0)
            {
                System.out.println(quest[i]);
                System.out.print("Enter the option: ");
                answer[i]=sc.next();
                i+=1;
                continue;
            }
            System.out.print("\nEnter N for Next question and P for previous question: ");
            String choice = sc.next();
            if(i!=9 && choice.equals("N"))
            {
                System.out.println("\n"+quest[i]);
                System.out.println("Enter the option: ");
                answer[i]=sc.next();
                i+=1;
            }
            else if(i!=0 && choice.equals("P"))
            {
                i-=2;
                System.out.println("\n"+quest[i]);
                System.out.println("Enter the option: ");
                answer[i]=sc.next();
                i+=1;
            }
            else
            {
                System.out.println("Invalid choice");
            }

        }
    }

    public static void display(Quiz[] quest)
    {
        for(int i=0;i<10;i++)
        {
            if(answer[i].equals(quest[i].getCrctAns()))
            {
                mark+=1;
            }
        }
        System.out.println("\nYour score is "+mark+" out of 10.");
    }
}
