import java.util.*;
class Quiz_Main
{

public static void main(String args[])
{
System.out.println("ALL THE BEST\nTotal no. of question = 10\nTotal marks = 20");
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

Quiz quiz6 = new Quiz("6. compareTo() returns \n A. True  B. False  C. An int value  D. A string value",'C');
quizarr[5] = quiz6;

Quiz quiz7 = new Quiz("7. What is the variables declared in a class for the use of all methods of the class called? \n A. Objects  B. Instance variable  C. Reference variable  D. None of the above",'B');
quizarr[6] = quiz7;

Quiz quiz8 = new Quiz("8. Exception created by try block is caught in which block? \n A. catch  B. throw  C. throws  D. finally",'A');
quizarr[7] = quiz8;

Quiz quiz9 = new Quiz("9. Which of the following exception is thrown when divided by zero statement is executed? \n A. NullPointerException  B. NumberFormatException  C. ArithmeticException  D. ArrayIndexOutOfBoundException",'C');
quizarr[8] = quiz9;

Quiz quiz10=new Quiz("10. Where is System class defined? \n A. java.lang.package  B. java.util.package  C. java.io.package  D. None of the above",'A');
quizarr[9]=quiz10;

for(int i=0;i<10;i++)
{
System.out.println(quizarr[i].getQuestion());
System.out.println("Enter answer : ");
Scanner sc = new Scanner(System.in);
char ans = sc.next().charAt(0);

if(ans == (quizarr[i].getAnswer()))
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


