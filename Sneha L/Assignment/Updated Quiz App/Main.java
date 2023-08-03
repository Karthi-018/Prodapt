import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
      
        QuizApp[] ques = new QuizApp[10];
        ques[0] = new QuizApp(" \n" +
                "1. In which of the following is toString() method defined?\n", new String[]{"A. java.lang.Object", "B. java.lang.String", "C. java.lang.util", "D. None"}, 'A');
        ques[1] = new QuizApp(" \n" +
                " \n" +
                "2. Identify the return type of a method that does not return any value.\n", new String[]{"A. int", "B. double", "C. void", "D. None"}, 'C');
        ques[2] = new QuizApp(" \n" +
                "3. Output of Math.floor(3.6)?", new String[]{"A. 3", "B. 3.0", "C. 4", "D. 4.0"}, 'B');
        ques[3] = new QuizApp(" \n" +
                "4. Identify the modifier which cannot be used for constructor.\n", new String[]{"A. public", "B. protected", "C. private", "D. static"}, 'D');
        ques[4] = new QuizApp(
                "5. Identify the infinite loop.?", new String[]{"A. for(;;)", "B. for(int i=0;i<1;i--)", "C. for(int i=0;;i++)", "D. All the above"}, 'D');
        ques[5] = new QuizApp(" \n" +
                " \n" +
                "6. Which of the following exception is thrown when divided by zero statement is executed?", new String[]{"A. NullPointerException", "B. NumberFormatException", "C. ArithmeticException", "D. None"}, 'C');
        ques[6] = new QuizApp(" \n" +
                "7. Which option is false about the final keyword?", new String[]{"A. A final method cannot be overridden in its subclasses.", "B. A final class cannot be extended.", "C. A final class cannot extend other classes.", "D. A final method can be inherited."}, 'C');
        ques[7] = new QuizApp(" \n" +
                "8. Which keyword is used for accessing the features of a package?", new String[]{"A. package", "B. import", "C. extends", "D. export"}, 'B');
        ques[8] = new QuizApp(" \n" +
                "9. What is the initial quantity of the ArrayList list?", new String[]{"A. 5", "B. 10", "C. 100", "D. 50"}, 'B');
        ques[9] = new QuizApp(" \n" +
                "10. Which one of the following is not a Java feature?", new String[]{
                "A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible"}, 'B');
      
        System.out.println("Your Assessment Starts Now.........");
        System.out.println("Answer the following questions");
        int currIndex = 0;
        char s;
        while (currIndex >= 0 && currIndex < 10) {
            QuizApp currQues = ques[currIndex];
            System.out.println(currQues.getQuestion());
            for (String j : currQues.getOptions()) {
                System.out.println(j);
            }
            System.out.println("Enter your option/enter the Question number(0-9) to change ans /'N' to move next/'P' to move previous");
            s = sc.next().toUpperCase().charAt(0);
            switch (s) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (s == currQues.getCorrectOption() && s!=currQues.getUserAnswer()) {
                            score += 1;
                        }
                        currQues.setUserAnswer(s);
                    currIndex++;
                    break;
                case 'P':
                    currIndex--;
                    break;
                case 'N':
                    currIndex++;
                    break;
                case 'M':
                    System.out.println("Enter the new option");
                    char newOption=sc.next().toUpperCase().charAt(0);
                    currQues.setCorrectOption(newOption);
                    break;
                default:
                    if(s>='0' && s<='9')
                    {
                        currIndex=s-'0';
                    }
            }
        }
        System.out.println("Your Score is "+score+" out of 10");
    }
}
