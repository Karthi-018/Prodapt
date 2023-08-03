package org.example;
import java.util.*;

public class QuizMain
{
    static Quiz[] quest = new Quiz[10];

    static Scanner s = new Scanner(System.in);

    public static void getquest()
    {
            quest[0]=new Quiz("Number of primitive data types in Java are?","6","7","8","9","C");
            quest[1]=new Quiz("What is the size of double in java?","8","32","64","None","C");
            quest[2]=new Quiz("Arrays in java are?","Object reference","Objects","Primitive data type","None","B");
            quest[3]=new Quiz("Identify the return type of a method that doesn't return any value","int","String","void","None","C");
            quest[4]=new Quiz("Total constructor string class have?","3","8","13","21","C");
            quest[5]=new Quiz("compareTo() returns","True","False","An int value","None","C");
            quest[6]=new Quiz("Identify the modifier which cannot be used for constructor","static","default","private","public","A");
            quest[7]=new Quiz("What is the size of float in java?","8","32","16","64","B");
            quest[8]=new Quiz("What is the extension of java code files",".txt",".java",".img","None","B");
            quest[9]=new Quiz("Which of these are selection statements in Java?","break","continue","if","for","C");
    }

    public static void main(String[] args) {
        getquest();
        Quiz_Service.quiz_working(quest);
        Quiz_Service.display(quest);
    }
}
