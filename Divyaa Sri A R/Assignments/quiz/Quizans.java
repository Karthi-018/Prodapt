package org.example.list;

import java.util.Scanner;

public class Quizans {
    public static void main(String args[]) {
        QuizMain[] a = new QuizMain[10];
        char q = '"';
        int c = 0;
        //String mcq[]=new String[10];
        char ans[] = new char[10];
        //char crtans[]=new char[10];
        Scanner sc = new Scanner(System.in);
        a[0] = new QuizMain("1. Number of primitive data types in Java are?", "\nA. 6", "\nB. 7", "\nC. 8", "\nD. 9", 'C');
        a[1] = new QuizMain("2. Find the output of the following code.\nint Integer = 24;\nchar String  = " + q + "I" + q + ";\nSystem.out.print(Integer);\nSystem.out.print(String);?", "\nA. Compiler Error", "\nB. Throws Exception", "\nC. I", "\nD. 24I", 'D');
        a[2] = new QuizMain("3. Automatic type conversion is possible in which of the possible cases?", "\nA. Byte to int", "\nB. Int to long", "\nC. Long to int", "\nD. Short to int", 'B');
        a[3] = new QuizMain("4. What is the size of float and double in java?", "\nA. 32 and 64", "\nB. 32 and 32", "\nC. 64 and 32", "\nD. 64 and 64", 'A');
        a[4] = new QuizMain("5. Select the valid statement.", "\nA. char[] ch=new char(5)", "\nB. char[] ch=new char[5]", "\nC. char[] ch=new char()", "\nD. char ch=new char[]", 'B');
        a[5] = new QuizMain("6. Arrays in java are-", "\nA. Object references ", "\nB. object", "\nC. primitive data type", "\nD. None", 'B');
        a[6] = new QuizMain("7. _____ is used to find and fix bugs in the Java programs.", "\nA. JVM", " \nB. JRE", "\nC. JDK", "\nD. JDB", 'D');
        a[7] = new QuizMain("8. What is the return type of the hashCode() method in the Object class?", "\nA. Object", " \nB. int", "\nC. long", "\nD. void", 'B');
        a[8] = new QuizMain("9. What does the expression float a = 35 / 0 return?", "\nA. 0", "\nB. Not a Number", "\nC. Infinity", "\nD. Run time Exception", 'C');
        a[9] = new QuizMain("10. Evaluate the following Java expression, if x=3, y=5, and z=10:\n++z + y - y + z + x++", "\nA. 24", "\nB. 23", "\nC. 20", "\nD. 25", 'D');


        for (int i = 0; i < 10; i++) {
            System.out.println(a[i].getQuestions());
            System.out.println(a[i].getOption1());
            System.out.println(a[i].getOption2());
            System.out.println(a[i].getOption3());
            System.out.println(a[i].getOption4());
            ans[i] = sc.next().charAt(0);
            System.out.println("Enter 1 for previous question");
            System.out.println("Enter 2 for next question");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    if (i > 0) {
                        i-=2;
                    } else {
                        System.out.println("You are already at the 1st question");
                    }
                    /*System.out.println(a[i-1].getQuestions());
                    System.out.println(a[i-1].getOption1());
                    System.out.println(a[i-1].getOption2());
                    System.out.println(a[i-1].getOption3());
                    System.out.println(a[i-1].getOption4());*/
                    break;

                }
                case 2: {
                    if (i < 9) {
                        i=i;
                    } else {
                        System.out.println("You are already in last question");
                    }
                    /*System.out.println(a[i+1].getQuestions());
                    System.out.println(a[i+1].getOption1());
                    System.out.println(a[i+1].getOption2());
                    System.out.println(a[i+1].getOption3());
                    System.out.println(a[i+1].getOption4());*/
                    break;

                }
                case 3: {
                    break;
                }

            }
        }



        for(int i=0;i<10;i++)
        {
            if(ans[i]==a[i].getCrtans())
            {
                c++;
            }
        }
        System.out.println("You have answered "+c+" questions correctly");
        for(int i=0;i<10;i++)
        {
            if(ans[i]!=a[i].getCrtans())
            {
                System.out.println("Correct answer for Number "+(i+1)+" question is "+a[i].getCrtans());
            }
        }
    }
}
