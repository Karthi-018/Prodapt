package quizapplication;
import java.util.*;

public class QuizMain
{
    QuizBank [] question_array=new QuizBank[8];

    char[] user_answer=new char[8];
    Scanner sc=new Scanner(System.in);

    void setQuestions()
    {

        question_array[0]=new QuizBank("1.Which of the following import statements is used by default in all the Java applications?","A.import java.lang.*;","B.import java.util.*;","C.import java.awt*;","D.Import java.net.*;",'A');

        question_array[1]=new QuizBank("2.Identify the infinite loop.","A.For(;;)","B.For(int i=0;i<1;i--)","C.For(int i=0;;i++)","D.All of the above.",'D');

        question_array[2]=new QuizBank("3.The keyword is used to call the constructor of the parent class","A.this","B.parent class name","C.super","D.parent",'C');

        question_array[3]=new QuizBank("4.What will be the output of the following program?","A.No error","B.Constructor is not defined properly","C.Method is not defined properly","D.Extra parentheses",'C');

        question_array[4]=new QuizBank("5.Which of the following options compares only object references","A.toString()","B.equals()","C.==","D.hashCode()",'C');

        question_array[5]=new QuizBank("6.Java permits a class to extend only one other class directly. This is called","A.Hierarchical inheritance","B.Single inheritance","C.Multilevel inheritance","D.Hybrid inheritance",'B');

        question_array[6]=new QuizBank("7.Which of the following options is a valid class identifier in Java","A.creditcard","B.creditCard","C.CreditCard","D.1creditCard",'C');

        question_array[7]=new QuizBank("8.Number of primitive data types in Java are","A.6","B.7","C.8","D.9",'C');
    }

    int checkAnswers()
    {
        int count=0;
        for(int i=0;i<8;i++)
        {
            if(question_array[i].getAnswer()==Character.toUpperCase(user_answer[i]))
                count++;
        }
        return count;
    }

    void displayQuiz()
    {   int count=0;
        int n;
        System.out.println(question_array[count]);
        System.out.println("Answer:");
        user_answer[count]=sc.next().charAt(0);
        System.out.println("FOR NEXT->1");
        n=sc.nextInt();

        while (count<=7)
        {
            if(n==1)
            {

                count++;

                if(count==8)
                    break;

                System.out.println(question_array[count]);
                System.out.println("Answer:");

                if(user_answer[count]==0)
                    user_answer[count] = sc.next().charAt(0);
                else
                    System.out.println(user_answer[count]);


                if(count<7)
                   System.out.println("FOR PREV ->0 NEXT->1");
                else
                    System.out.println("FOR PREV ->0 EXIT->1");

                n=sc.nextInt();

            }
            else if(n==0)
            {
                count--;

                System.out.println(question_array[count]);
                System.out.println(user_answer[count]);
                System.out.println("Answer:");
                user_answer[count]=sc.next().charAt(0);

                if(count==0)
                    System.out.println("FOR NEXT->1");
                else
                    System.out.println("FOR PREV ->0 NEXT->1");
                n=sc.nextInt();
            }
        }
    }

    public static void main(String[]args)
    {
        QuizMain object=new QuizMain();

        System.out.println("\nWELCOME TO QUIZ PROGRAM\n");

        object.setQuestions();
        object.displayQuiz();
        System.out.println("You have scored "+object.checkAnswers()+" out of 8!");

    }
}

