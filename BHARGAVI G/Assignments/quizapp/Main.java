package org.example;
import java.util.Scanner;
import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        char ans[] = new char[10];
        int current = 0;
        Scanner sc = new Scanner(System.in);

        Question[] questions = new Question[10];
        questions[0] = new Question("1)How many Primitive data types are there in java?", " 8", "2", "6", "10", 'A');
        questions[1] = new Question("2)Which one of the following is not a Java feature?", "Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible", 'B');
        questions[2] = new Question("3)Which component is used to compile, debug and execute the java programs?", "JRE", "JIT", "JDK", "JVM", 'C');
        questions[3]=new Question("4)Who is the CEO of Google?","sundar pitchai","mukesh ambani","virat kholi ","modi",'A');
        questions[4]=new Question("5)Which of the given is a disease caused by protozoa?","Cancer","Typhoid","Kala-azar","Chicken Pox",'C');
        questions[5]=new Question("6)How many bones in your body?","200","206","300","250",'B');
        questions[6]=new Question("7)Automatic type conversion is possible in which of the possible cases?","Byte to int","int to long","long to int","short to int",'B');
        questions[7]=new Question("8)When is the object created with new keyword?","Runtime","compile time","Depends on the code","none",'A');
        questions[8]=new Question("9)Arrays in java are ","Object reference","Object","Primitive Data type","None",'B');
        questions[9]=new Question("10)In which of the following is toString() method defined?","java.lang.Object","java.string.Object","java.lang.util","None",'A');





        for (int i = 0; i < 10; i++) {
            System.out.println(questions[i].getQuestions());
            System.out.println(questions[i].getOption1());
            System.out.println(questions[i].getOption2());
            System.out.println(questions[i].getOption3());
            System.out.println(questions[i].getOption4());

            ans[i] = sc.next().charAt(0);
            System.out.println("Enter prev or next:");
            char nextorprevious = sc.next().charAt(0);

            if (nextorprevious == 'p') {
                if(i==0){
                    System.out.println("you are at 1st question...");
                    i++;

                }
                i = i - 2;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (ans[i] == questions[i].getCrtans()) {
                current++;
            }
        }
        System.out.println("you have done the quiz.");
        System.out.println("Score is " + current);

    }
}