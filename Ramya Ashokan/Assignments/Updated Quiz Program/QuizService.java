package org.example.Quizes;

import java.util.Scanner;

public class QuizService {
    Quiz quest[] = new Quiz[10];
    public Quiz[] questions() {

        quest[0] = new Quiz("1.Which of the following is not an OOPS concept?", "A.Polymorphism", "B.Encapsulation", "C.Exception", "D.Abstraction", 'C');
        quest[1] = new Quiz("2.Which of the following feature is also known as run-time binding or late binding?", "A.Dynamic binding", "B.Dynamic typing", "C.Dynamic loading", "D.Data hiding", 'A');
        quest[2] = new Quiz("3.Which of the following variable violates the definition of encapsulation?", "A.Local variables", "B.Array variables", "C.Global variables","D.Public variables",'C');
        quest[3]=new Quiz("4.The object cannot be________?","A.passed by reference","B.passed by copy","C.passed as function","D.passed by value",'C');
        quest[4]=new Quiz("5.Which definition best defines the concept of abstraction?","A.Hides the important data","B.Hides the implementation and showing only the features","C.Showing the important data","D.Showing the important functionality",'B') ;
        quest[5]=new Quiz("6.How can the concept of encapsulation be achieved in the program?","A.By using only private members","B.By using the concept of Abstraction","C.By using the concept of Inheritance","D.By using the Access specifiers",'A');
        quest[6]=new Quiz("7.Which class cannot create its instance?","A.Anonymous class","B.Abstract class","C.Parent class","D.Nested class",'B');
        quest[7]=new Quiz("8.Which member of the superclass is never accessible to the subclass?","A.Protected member","B.Private member","C.Public member","D.All of the mentioned",'B');
        quest[8]=new Quiz("9.Which of the following OOP concept binds the code and data together and keeps them secure from the outside world?","A.Polymorphism", "B.Encapsulation", "C.Inheritance", "D.Abstraction",'B');
        quest[9]=new Quiz( "10.Which two features of object-oriented programming are the same?", "A.Encapsulation and Polymorphism features are the same", "B.Abstraction and Polymorphism features are the same", "C.Inheritance and Encapsulation features are the same", "D.Encapsulation and Abstraction",'D');
        return quest;

    }



    public void evaluate(char [] u_ans)
    {
        int count=0;

        for(int i=0;i<u_ans.length;i++)
        {
         if(u_ans[i]==quest[i].getR_ans())
         {
             count++;
         }
        }
        System.out.println("Your  total score out of ten is "+count);


    }
}