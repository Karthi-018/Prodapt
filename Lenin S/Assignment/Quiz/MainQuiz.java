import java.util.*;
class QuizMain
{

public static void main(String args[])
{
System.out.println("ALL THE BEST\nTotal no. of question = 5\nTotal marks = 10");
System.out.println("---------------------------------------------------------------------------------");

int marks = 0;
Quiz quizarr[] = new Quiz[10];

Quiz quiz1 = new Quiz("1. Number of primitive data types in Java are? \n A. 6  B. 8  C. 5  D. 2",'B');
quizarr[0] = quiz1;

Quiz quiz2 = new Quiz("2. Arrays in java are? \n A. Objects  B. Primitive datatype  C. Address  D. None of the above",'A');
quizarr[1] = quiz2;

Quiz quiz3 = new Quiz("3. Java program processing always starts with main() method \n A. True  B. False",'A');
quizarr[2] = quiz3;

Quiz quiz4 = new Quiz("4. When is the object created with new keyword? \n A. At compile time  B. At runtime  C. Depends on the code  D. None of the above",'B');
quizarr[3] = quiz4;

Quiz quiz5 = new Quiz("5. Identify the modifier which cannot be used for constructor \n A. public  B. protected  C. private  D. static",'D');
quizarr[4] = quiz5;


for(int i=0;i<5;i++)
{
System.out.println(quizarr[i].getQuestions());
System.out.println("Enter answers : ");
Scanner sc = new Scanner(System.in);
char ans = sc.next().charAt(0);

if(ans == (quizarr[i].getAnswers()))
{
System.out.println("Correct");
marks+=2;
}
else
{
System.out.println("Incorrect");
}

}
System.out.println("-----------------------------------------------------------------------");
System.out.println("Total marks scored : " + marks);

}
}

