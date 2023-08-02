package org.example;
import java.util.*;
public class QUIZZZ {
    public static void main(String a[]) {
        System.out.println("***10 GENERAL COMPUTER PROGRAMMING QUIZ***");
        System.out.println("enter yes to start the quizz");
        Scanner s = new Scanner(System.in);
        String choice = s.next();
        switch (choice) {
            case "yes":
                System.out.println("1.Name a few programming languages\nA.Java\nB. C\nC.C++\nD.Python\nE.All the above");
                String option1 = s.next();
                System.out.println("2.What does HTML stand for?\nA.Hyper Trainer Marking Language.\nB. Hyper Text Marketing Language.\nC.Hyper Text Marker Language.\nD.Hyper Text Marker Level.");
                String option2 = s.next();
                System.out.println("3.At run-time, a Java program is nothing more than objects ‘talking’ to________.\nA.Other objects\nB.Other metods\nC.Other classes\nD.Other binders");
                String option3 = s.next();
                System.out.println("4.Which of the following sorting algorithms can be used to sort a random linked list with minimum time complexity?\nA.Insertion sort.\nB.Merge sort\nC.Quick sort.\nD.Heap sort");
                String option4 = s.next();
                System.out.println("5.In the worst case, the number of comparisons needed to search a singly linked list of length n for a given element is\nA.log(2*n).\nB.n/2\nC.log(2*n) -1.\nD.n.");
                String option5 = s.next();
                System.out.println("6.When fopen() is not able to open a file, it returns.\nA.EOF.\nB.Null.\nC.Run Error.\nD.Compiler Dependent");
                String option6 = s.next();
                System.out.println("7.getc() returns EOF when.\nA.When file Ends\nB.When getc() fails to read a character.\nC.Both of the above.\nD.None of the above");
                String option7 = s.next();
                System.out.println("8._______ is the process of finding errors and fixing them within a program.\nA.Compiling.\nB.Debugging.\nC.Executing.\nD.Scanning");
                String option8 = s.next();
                System.out.println("9.Which command will stop an infinite loop?.\nA.ctrl c.\nB.Alt c.\nC.Esc.\nD.Shift c.");
                String option9 = s.next();
                System.out.println("10.What is software?\nA.flexible parts of a computer case\nB.clothing designed to be worn by computer users\nC.any part of the computer that has a physical structure\nD.instructions that tell the hardware what to do");
                String option10 = s.next();
                System.out.println("***END OF QUIZZ***");
                break;
            default:
                System.out.println("better luck next time");


        }
    }
}