// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main
{
    static Updt_Quiz[] q = new Updt_Quiz[10];
    static String[] useropt = new String[10];
    static Scanner sc = new Scanner(System.in);

    public void display_question()
    {
        q[0] = new Updt_Quiz("1. Number of primitive data types in Java are?", "8", "7", "6", "A");
        q[1] = new Updt_Quiz("2. Arrays in java are?", "Objects", "Primitive datatype", "Address", "A");
        q[2] = new Updt_Quiz("3. Java program processing always starts with main() method", "True", "False", "None","A");
        q[3] = new Updt_Quiz("4. When is the object created with new keyword?", "At compile time", "At runtime", "Depends on the code", "B");
        q[4] = new Updt_Quiz("5. Identify the modifier which cannot be used for constructor", "public", "protected", "static", "C");
        q[5] = new Updt_Quiz("6. compareTo() returns", "True", "False", "An int value", "C");
        q[6] = new Updt_Quiz("7. What is the variables declared in a class for the use of all methods of the class called?", "Objects", "Instance variable", "Reference variable", "B");
        q[7] = new Updt_Quiz("8. Exception created by try block is caught in which block?", "catch", "throw", "throws", "A");
        q[8] = new Updt_Quiz("9. Which of the following exception is thrown when divided by zero statement is executed?", "NullPointerException", "NumberFormatException", "ArithmeticException", "C");
        q[9] = new Updt_Quiz("10. Where is System class defined?", "java.lang.package", "java.util.package", "java.io.package", "A");
    }

    public static void main(String[] args)
        {
            Main m = new Main();
            m.display_question();
            for(int i=0;i<q.length;)
            {
                System.out.println(q[i]);

                if(useropt[i]==null)
                {
                    System.out.println("Enter answer : ");
                    useropt[i]=sc.next();
                }
                else
                {
                    System.out.println(useropt[i]);
                }

                boolean flag = false;

                if(i==q.length-1)
                {
                    flag=true;
                    System.out.println("1. SUBMIT");
                    System.out.println("2. PREVIOUS QUESTION");
                    System.out.println("3. CHANGE OPTION");
                }
                else
                {
                    System.out.println("1. NEXT QUESTION");
                    System.out.println("2. PREVIOUS QUESTION");
                    System.out.println("3. CHANGE OPTION");
                }

                int choice = sc.nextInt();
                switch (choice)
                {
                    case 1: {
                        if (flag)
                        {
                            calculateScore();
                            System.exit(0);
                        }
                        i++;
                        break;
                    }

                    case 2:
                    {
                        i--;
                        break;
                    }

                    case 3:
                    {
                        System.out.println(q[i]);
                        System.out.println("Enter answer : ");
                        useropt[i] = sc.next();
                        i++;
                        break;
                    }

                    default:
                        System.out.println("Invalid");
                }
            }

        }

    private static void calculateScore()
    {
        int marks = 0;
        for(int i=0;i<q.length;i++)
        {
            if(q[i].getCorrectopt().equals(useropt[i]))
            {
                marks++;
            }
        }
        System.out.println("TOTAL MARKS SCORED IS " + marks);
    }
}
