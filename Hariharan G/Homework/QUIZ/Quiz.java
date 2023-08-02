package assignment;

import java.util.Scanner;

public class Quiz {
    Scanner sc=new Scanner(System.in);
    public  void askFn(){
        System.out.println("Select 1 to play 0 to exit");
        int selection= sc.nextInt();
        int correctAns=0,total=0;
        switch(selection)
        {
            case 1:
                System.out.println("Which of the following statements is correct about inner classes\n" + "1.\n" + "An inner class can be declared inside a method block called local classes\n" + "2.\n" + "A static nested class is considered as an inner class\n" + "3.\n" + "An inner class does not have access to the private members of the outer class\n" + "4.\n" + "An inner class cannot be declared inside a method");
                System.out.println("ENTER CHOICE");
                correctAns= sc.nextInt();
                if(correctAns==1) {
                    total += 1;
                }
            case 2:
                System.out.println("Which of the following options compares only object references\n" + "1.\n" + "toString()\n" + "2.\n" + "equals()\n" + "3.\n" + "==\n" + "4.\n" + "hashCode()");
                System.out.println("ENTER CHOICE");
                correctAns= sc.nextInt();
                if(correctAns==3) {
                    total += 1;
                }
            case 3:
                System.out.println("The ______ keyword is used to call the constructor of the parent class\n" + "1.\n" + "this\n" + "2.\n" + "parent class name\n" + "3.\n" + "super\n" + "4.\n" + "parent");
                System.out.println("ENTER CHOICE");
                correctAns= sc.nextInt();
                if(correctAns==3) {
                    total += 1;
                }
            case 4:
                System.out.println("Which of the following statements is correct regarding static variables and methods\n" + "1.\n" + "Static methods cannot retrieve object references\n" + "2.\n" + "Static variables are limited to a single copy per JVM\n" + "3.\n" + "Static variables cannot contain shared data\n" +"4.\n" + "Static methods store data in local variables");
                System.out.println("ENTER CHOICE");
                correctAns= sc.nextInt();
                if(correctAns==2) {
                    total += 1;
                }
            case 5:
                System.out.println("How many times will “Interviewbit” be printed\n" + "1.\n" + "8\n" + "2.\n" + "9\n" + "3.\n" + "10\n" + "4.\n" + "11");
                System.out.println("ENTER CHOICE");
                correctAns= sc.nextInt();
                if(correctAns==3) {
                    total += 1;
                }
            case 6:
                System.out.println("Which of the following options shows the correct implementation of method overloading\n" + "1.\n" + "public int print (int i);\n" + "public void print (int f);\n" + "2.\n" + "public void dostuff(float i);\n" + "public void dostuff(double i);\n" + "3.\n" + "public void show();\n" + "public string show();\n" + "4.\n" + "public void disp (int i);\n" + "public void dispArea (int i);");
                System.out.println("ENTER CHOICE");
                correctAns= sc.nextInt();
                if(correctAns==2) {
                    total += 1;
                }
            case 7:
                System.out.println("Which of the following import statements is used by default in all the Java applications?\n" + "1.\n" + "import java.lang.*;\n" + "2.\n" + "import java.util.*;\n" + "3.\n" + "import java.awt.*;\n" + "4.\n" + "Import java.net.*;");
                System.out.println("ENTER CHOICE");
                correctAns= sc.nextInt();
                if(correctAns==1) {
                    total += 1;
                }
            case 8:
                System.out.println("OOP allows a class to make use of another class. This kind of relationship is called _________\n" + "1.\n" + "Generalization\n" + "2.\n" + "Utilization\n" + "3.\n" + "Composition\n" + "4.\n" + "Instantiation");
                System.out.println("ENTER CHOICE");
                correctAns= sc.nextInt();
                if(correctAns==2) {
                    total += 1;
                }
            case 9:
                System.out.println("Which of the following is FALSE about arrays in Java\n" + "1.\n" + "A java array is always an object\n" + "2.\n" + "Length of array can be changed after creation of array\n" + "3.\n" + "Arrays in Java are always allocated on heap\n" + "4.\n" + "None of this");
                System.out.println("ENTER CHOICE");
                correctAns= sc.nextInt();
                if(correctAns==2) {
                    total += 1;
                }
            case 10:
                System.out.println("_______ refers to individuals and organizations that develop, innovate, and use the Java technology\n" + "1.\n" + "Java Specification Requests\n" + "2.\n" + "Java Development kit\n" + "3.\n" + "Java Virtual Machine\n" + "4.\n" + "Java community\n" );
                System.out.println("ENTER CHOICE");
                correctAns= sc.nextInt();
                if(correctAns==4) {
                    total += 1;
                    break;
                }
            default:
                System.out.println("BYE!!!");
                break;
        }
        System.out.println("TOTAL SCORE IS: "+ total);
    }
    public static void main(String []args)
        {
        Quiz q=new Quiz();
        System.out.println("JAVA QUIZ");
        //Scanner sc =new Scanner(System.in);
        q.askFn();
    }
}
