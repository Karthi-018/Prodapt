import java.util.*;
public class Quiz
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int totalCount=3;
        int yourGrade=0;
        String Question1;
        String Question2;
        String Question3;
        System.out.println("----------Welcome to Quiz----------");
        System.out.println("Question 1:Who is 7+3 ?");
        System.out.println("a. 10");
        System.out.println("b. 5");
        System.out.println("c. 3");
        String ans1 = sc.nextLine();
        System.out.println("------------------------");
        System.out.println("Question 2:Which keyword is used to create a subclass of a class?");
        System.out.println("a. this");
        System.out.println("b. extends");
        System.out.println("c. super");
        String ans2 = sc.nextLine();
        System.out.println("------------------------");
        System.out.println("Question 3:Which loop executes as long as the condition is true?");
        System.out.println("a. switch loop");
        System.out.println("b. for loop");
        System.out.println("c. while stmt");
        String ans3 = sc.nextLine();
        System.out.println("------------------------");
        if (ans1.equals("a"))
        {
            System.out.println("Question 1:Correct");
            yourGrade++;
        }
        else
         {
            System.out.println("Question 1:Wrong!");
         }
        if (ans2.equals("b"))
         {
            System.out.println("Question 2:Correct");
            yourGrade++;
         }
        else
         {
            System.out.println("Question 2:Wrong!");
         }
        if (ans3.equals("c"))
        {
            System.out.println("Question 3:Correct");
            yourGrade++;
        }
        else
        {
            System.out.println("Question 3:Wrong!");
        }
        System.out.println("TotalGrade is:"+yourGrade);
        if (yourGrade==3)
        {
            System.out.println("Well done");
        } else if (yourGrade==2) {
            System.out.println("Good");
        } else {
            System.out.println("Better Luck next tym");
        }
        sc.close();
    }
}