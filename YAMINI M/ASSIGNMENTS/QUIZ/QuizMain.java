import java.util.*;

public class QuizMain {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("start the Quiz");

        Quiz question[] =new Quiz[10];

        question[0]=new Quiz("1. What does the expression float a = 35 / 0 return?\nA. 0 \nB. Not a Number\nC. Infinity\nD. Run time Exception\n","C");
        question[1]=new Quiz("2. Arrays in java are-\n A. Object references \n B. object\n C. primitive data type \n D. None\n","D");
        question[2]=new Quiz("3. Select the valid statement.\n A. char[] ch=new char(5)\n B. char[] ch=new char[5] \n C. char[] ch=new char() \n D. char ch=new char[]\n","B");
        question[3]=new Quiz("4. Evaluate the following Java expression, if x=3, y=5, and z=10:\n ++z + y - y + z + x++ \n A. 24 \n B. 23 \n C. 20 \n D. 25\n","B");
        question[4]=new Quiz("5. What is the return type of the hashCode() method in the Object class?\n A. Object \n B. int \n C. long \n D. void\n","C");
        question[5]=new Quiz("6. What is the size of float and double in java?\n A. 32 and 64\n B. 32 and 32\n C. 64 and 32\n D. 64 and 64\n","A");
        question[6]=new Quiz("7. _____ is used to find and fix bugs in the Java programs.\n A. JVM \n B. JRE\n C. JDK\n D. JDB","B");
        question[7]=new Quiz("8. Automatic type conversion is possible in which of the possible cases?\n A. Byte to int \n B. Int to long\n C. Long to int\n D. Short to int","B");
        question[8]=new Quiz("9. Find the output of the following code. \n int Integer = 24; \n char String  = \"+q+\"I\"+q+\"; \n System.out.print(Integer); \n System.out.print(String);? \n A. Compiler Error \n B. Throws Exception \n C. I \n D. 24I\n","D");
        question[9]=new Quiz("10. Number of primitive data types in Java are? \n A. 6 \n B. 7 \n C. 8 \n D. 9","D");

        System.out.println("*********************************");
        System.out.println("Press 1 to start the Quiz");
        int option=sc.nextInt();

        int mark = 0;
        for(int i=0;i<question.length;i++){
            System.out.println(question[i].getQuestion());

            System.out.println("Enter Answer");
            String user_ans = sc.next();


            System.out.println("1.NEXT QUESTION");
            System.out.println("2.PREVIOUS QUESTION");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (i < question.length) {
                        int i1 = i;
                        if (user_ans.equals(question[i].getAnswer())) {
                            mark++;
                        }

                    }
                    break;
                case 2:
                    if (i > 0 && i < question.length) {
                        i--;
                        if (user_ans.equals(question[i].getAnswer())) {
                            mark++;
                        }
                    }
                    break;

            }


        }

        System.out.println("Your score is :" +mark);
    }

  }

