package org.example;
import java.sql.SQLOutput;
import java.util.*;
public class servicequizz {
    void corequiz()
        {

        Scanner s = new Scanner(System.in);

        pojoquizz quiz[] = new pojoquizz[10];
        //pojoquizz q[] = new pojoquizz[10];
        String ans[] = new String[10];

        quiz[0] = new pojoquizz("1.Name a few programming languages?", "\nA.Java", "\nB. C", "\nC.C++", "\nD.All the above");
        quiz[1] = new pojoquizz("2.What does HTML stand for?", "\nA.Hyper Trainer Marking Language.", "\nB. Hyper Text Marketing Language.", "\nC.Hyper Text Marker Language.", "\nD.Hyper Text Marker Level.");
        quiz[2] = new pojoquizz("3.At run-time, a Java program is nothing more than objects ‘talking’ to________.", "\nA.Other objects.", "\nB.Other metods.", "\nC.Other classes.", "\nD.Other binders");
        quiz[3] = new pojoquizz("4.Which of the following sorting algorithms can be used to sort a random linked list with minimum time complexity?", "\nA.Insertion sort.", "\nB.Merge sort.", "\nC.Quick sort.", "\nD.Heap sort");
        quiz[4] = new pojoquizz("5.In the worst case, the number of comparisons needed to search a singly linked list of length n for a given element is?.", "\nA.log(2*n).", "\nB.n/2", "\nC.log(2*n) -1.", "\nD.n.");
        quiz[5] = new pojoquizz("6.When fopen() is not able to open a file, it returns.", "\nA.EOF.", "\nB.Null.", "\nC.Run Error.", "\nD.Compiler Dependent");
        quiz[6] = new pojoquizz("7.getc() returns EOF when.", "\nA.When file Ends", "\nB.When getc() fails to read a character.", "\nC.Both of the above.", "\nD.None of the above");
        quiz[7] = new pojoquizz("8._______ is the process of finding errors and fixing them within a program.", "\nA.Compiling.", "\nB.Debugging.", "\nC.Executing.", "\nD.Scanning");
        quiz[8] = new pojoquizz("9.Which command will stop an infinite loop?.", "\nA.ctrl c.", "\nB.Alt c.", "\nC.Esc.", "\nD.Shift c.");
        quiz[9] = new pojoquizz("10.What is software?", "\nA.flexible parts of a computer case", "\nB.clothing designed to be worn by computer users", "\nC.any part of the computer that has a physical structure", "\nD.instructions that tell the hardware what to do");

        try {
            System.out.println(quiz[0]);
            ans[0] = s.next();
            for (int i = 1; i <10; i++) {
                System.out.println(quiz[i]);
                ans[i] = s.next();
                System.out.println("enter previous or next ");
                String choice = s.next();
                if (choice.equals("previous")) {
                    System.out.println(quiz[--i]);
                    System.out.println("your answer"+ans[i]);
                    ans[i] = s.next();
                } else if (choice.equals("next"))
                {
                    if(i==9)
                    {
                        System.out.println("enter submit to finish quizz");
                        String End=s.next();
                        break;
                    }
                    continue;
                    //System.out.println(quiz[++i]);
                    //ans[i] = s.next();
                }


            }
        }
        catch(Exception e)
        {
            System.out.println("Quiz ended");
        }
    }
}
