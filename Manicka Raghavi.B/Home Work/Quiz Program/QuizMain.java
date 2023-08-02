package quizapplication; 

import java.util.*;

class QuizMain

{
 
QuizBank [] question_array=new QuizBank[10]; 
QuizBank [] answer_array=new QuizBank[10];
char[] user_answer=new char[10];
Scanner sc=new Scanner(System.in);

void setQuestions()
{
 
question_array[0]=new QuizBank("1.Which of the following import statements is used by default in all the Java applications? \nA.import java.lang.*;\nB.import java.util.*;\nC.import java.awt*;\nD.Import java.net.*;");

question_array[1]=new QuizBank("\n2.Identify the infinite loop.\nA.For(;;)\nB.For(int i=0;i<1;i--)\nC.For(int i=0;;i++)\nD.All of the above.");
        
question_array[2]=new QuizBank("\n3.The keyword is used to call the constructor of the parent class\nA.this\nB.parent class name\nC.super\nD.parent"); 

question_array[3]=new QuizBank("\n4.What will be the output of the following program? \nA.No error\nB.Constructor is not defined properly\nC.Method is not defined properly\nD.Extra parentheses");

question_array[4]=new QuizBank("\n5.Which of the following options compares only object references\nA.toString()\nB.equals()\nC.==\nD.hashCode()"); 

question_array[5]=new QuizBank("\n6.Java permits a class to extend only one other class directly. This is called\nA.Hierarchical inheritance\nB.Single inheritance\nC.Multilevel inheritance\nD.Hybrid inheritance");

question_array[6]=new QuizBank("\n7.Which of the following statement is incorrect regarding Java\nA.Java is available free of cost\nB.OpenJDK is the open-source implementation of Java\nC.The JCP develops new Java standards\nD.The JDK compiler converts bytecode to Java source code");

question_array[7]=new QuizBank("\n8.OOP allows a class to make use of another class. This kind of relationship is called \nA.Generalization\nB.Utilization\nC.Composition\nD.Instantiation");

question_array[8]=new QuizBank("\n9.Which of the following options is a valid class identifier in Java\nA.creditcard\nB.creditCard\nC.CreditCard\nD.1creditCard");

question_array[9]=new QuizBank("\n10.Number of primitive data types in Java are\nA.6\nB.7\nC.8\nD.9");
    
}

void setAnswers()
{ 
answer_array[0]=new QuizBank('A'); 
answer_array[1]=new QuizBank('D');
answer_array[2]=new QuizBank('C');
answer_array[3]=new QuizBank('C');
answer_array[4]=new QuizBank('C');
answer_array[5]=new QuizBank('B');
answer_array[6]=new QuizBank('D');
answer_array[7]=new QuizBank('B');
answer_array[8]=new QuizBank('C');
answer_array[9]=new QuizBank('C');
}

int checkAnswers() 
{ 
int count=0;
for(int i=0;i<10;i++) 
{ 
  if(answer_array[i].getAnswer()==Character.toUpperCase(user_answer[i]))
  count++;
}
return count;
}

void displayQuiz()
{ 
  for(int i=0;i<10;i++)
 { 
  System.out.println(question_array[i].getQuestion()); 
  System.out.println("Answer:"); 
  user_answer[i]=sc.next().charAt(0); 
  
 } 
}

public static void main(String[]args) 
{
 QuizMain object=new QuizMain();

 System.out.println("\nWELCOME TO QUIZ PROGRAM\n");

 object.setQuestions();
 object.setAnswers();
 object.displayQuiz();  

 System.out.println("You have scored "+object.checkAnswers()+" out of 10!"); 
 
} 
}