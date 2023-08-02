package org.example.Quizes;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizService {

    public void question1() {
        String ques1="1.Which of the following is not an OOPS concept?";
        String opt1="Polymorphism";
        String opt2="Encapsulation";
        String opt3="Exception";
        String opt4="Abstraction";
        Quiz q1 = new Quiz(ques1, opt1, opt2, opt3, opt4);
        System.out.println(q1);
    }

    public void question2() {
        String ques2="2.Which of the following feature is also known as run-time binding or late binding?";
        String opt1="Dynamic binding";
        String opt2="Dynamic typing";
        String opt3="Dynamic loading";
        String opt4="Data hiding";
        Quiz q2 = new Quiz(ques2, opt1, opt2, opt3, opt4);
        System.out.println(q2);
    }
    public void question3() {
        String ques3="3.Which of the following variable violates the definition of encapsulation?";
        String opt1="Local variables";
        String opt2="Public variables";
        String opt3="Array variables";
        String opt4="Global variables";
        Quiz q3 = new Quiz(ques3, opt1, opt2, opt3, opt4);
        System.out.println(q3);
    }

    public void question4() {
        String ques4="4.The object cannot be________?";
        String opt1="passed by reference";
        String opt2="passed by copy";
        String opt3="passed as function";
        String opt4="passed by value";
        Quiz q4 = new Quiz(ques4, opt1, opt2, opt3, opt4);
        System.out.println(q4);
    }

    public void question5() {
        String ques5="5.Which definition best defines the concept of abstraction?";
        String opt1="Hides the important data";
        String opt2="Hides the implementation and showing only the features";
        String opt3="Showing the important data";
        String opt4="Showing the important functionality";
        Quiz q5 = new Quiz(ques5, opt1, opt2, opt3, opt4);
        System.out.println(q5);
    }

    public void question6() {
        String ques6=" 6.How can the concept of encapsulation be achieved in the program?";
        String opt1="By using only private members";
        String opt2="By using the concept of Abstraction";
        String opt3="By using the Access specifiers";
        String opt4="By using the concept of Inheritance";
        Quiz q6 = new Quiz(ques6, opt1, opt2, opt3, opt4);
        System.out.println(q6);
    }

    public void question7() {
        String ques7="7.Which class cannot create its instance?";
        String opt1="Anonymous class";
        String opt2="Abstract class";
        String opt3="Parent class";
        String opt4="Nested class";
        Quiz q7 = new Quiz(ques7, opt1, opt2, opt3, opt4);
        System.out.println(q7);
    }

    public void question8() {
        String ques8="8.Which member of the superclass is never accessible to the subclass?";
        String opt1="Protected member";
        String opt2="Private member";
        String opt3="Public member";
        String opt4="All of the mentioned";
        Quiz q8 = new Quiz(ques8, opt1, opt2, opt3, opt4);
        System.out.println(q8);
    }

    public void question9() {
        String ques9="9.Which of the following OOP concept binds the code and data together and keeps them secure from the outside world?";
        String opt1="Polymorphism";
        String opt2="Encapsulation";
        String opt3="Inheritance";
        String opt4="Abstraction";
        Quiz q9 = new Quiz(ques9, opt1, opt2, opt3, opt4);
        System.out.println(q9);
    }

    public void question10() {
        String ques10="10.Which two features of object-oriented programming are the same?";
        String opt1="Encapsulation and Polymorphism features are the same";
        String opt2="Abstraction and Polymorphism features are the same";
        String opt3="Inheritance and Encapsulation features are the same";
        String opt4="Encapsulation and Abstraction";
        Quiz q10 = new Quiz(ques10, opt1, opt2, opt3, opt4);
        System.out.println(q10);
    }
    public void evaluate(char [] marks)
    {


        int count=0;
        char r_ans[]={'C','A','D','C','B','A','B','B','B','D'};
        for(int i=0;i<marks.length;i++)
        {
         if(marks[i]==r_ans[i])
         {
             count++;
         }
        }
        System.out.println("Your  total score out of ten is "+count);
        System.out.println("Correct options are");
        int i=0;
        for(char r:r_ans)
        {
            System.out.println((++i)+"."+r);
        }
    }
}