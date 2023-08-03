package org.example;

import java.util.*;
public class Quiz_Service
{
    static Scanner sc= new Scanner(System.in);
    static String[] answer=new String[10];
    static int size=0;
    static int mark=0;
    public static void quiz_working(Quiz[] quest)
    {
        for(Quiz q:quest)
        {
            System.out.println(q);
            System.out.print("Enter the answer: ");
            answer[size]=sc.nextLine();
            if(q.getCrctAns().equals(answer[size]))
            {
                mark+=1;
                System.out.println("Correct Answer");
            }
            else
            {
                System.out.println("Wrong Answer \nCorrect Answer is "+q.getCrctAns());
            }
            System.out.println();
            size+=1;
        }
    }
    public static void display()
    {
        System.out.println("Your score is "+mark+" out of 10.");
    }
}
