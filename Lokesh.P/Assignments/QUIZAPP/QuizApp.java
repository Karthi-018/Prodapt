import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        String q1 = "1.Which of the following sorting algorithms can be used to sort a random linked list with minimum time complexity?\n" +
                "\n" + "A.Insertion Sort\n" + "B.Quick Sort\n" + "C.Heap Sort\n" + "D.Merge Sort";
        String q2 = "2.Which of the following is the first step of SDLC?\n" +
                "\n" + "A.Coding\n" + "B.Design\n" + "C.Analysis\n" + "D.Testing";
        String q3 = "3.How can we describe an array in the best possible way?\n" +
                "\n" + "A.The Array shows a hierarchical structure\n" + "B.Arrays are immutable\n" + "C.Container that stores the elements of similar types\n" +
                "\n" + "D.The Array is not a data structure";
        String q4 = "4.What is the output of this statement \"printf(\"%d\", (a++))\"?\n" +
                "\n" + "A.The value of (a + 1)\n" + "B.The Current Value of a\n" + "C.Error message\n" + "D.Garbage";
        String q5 = "5.We cannot use the keyword ‘break’ simply within\n" +
                "\n" + "A.if-else\n" + "B.while\n" + "C.for\n" + "D.do-while";
        String q6 = "6.The global variables are\n" +
                "\n" + "A.External\n" + "B.Internal\n" + "C.None\n" + "D.Both External and Internal\n" +
                "\n";
        String q7 = "7.The #include <stdio.h> is a\n" +
                "\n" + "A.Inclusion directive\n" + "B.File inclusion directive\n" + "C.None\n" + "D.Preprocessor directive\n" + "\n";
        String q8 = "8.What is the worst case time complexity of linear search algorithm?\n" +
                "\n" + "A.O(1)\n" +"B.O( n )\n"+ "C.O(log n)\n" + "D.O(n2)";
        String q9 = "9.For which of the following reasons is the waterfall model not suitable?\n" +
                "\n" + "A.Small Project\n" + "B.Complex Project\n" + "C.Accommodation Changes\n" + "D.Maintenance Project";
        String q10 = "Which of the following is not a logical operator\n" +
                "\n" + "A.&&\n" + "B.!\n" + "C. ||\n" + "D. |";
        Question questions[] = {
                new Question(q1, "D"),
                new Question(q2, "C"),
                new Question(q3, "C"),
                new Question(q4, "B"),
                new Question(q5, "A"),
                new Question(q6, "A"),
                new Question(q7, "D"),
                new Question(q8, "D"),
                new Question(q9, "C"),
                new Question(q10, "D")
            };
        attemptTest(questions);
    }
        public static void attemptTest(Question questions[])
        {
            System.out.println("********** WELCOME TO QUIZ TEST BEGINS SOON********");
            int total_score=0;
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<questions.length;i++)
            {
                System.out.println(questions[i].question);
                String answer=sc.nextLine();
                if(answer.equals(questions[i].answer))
                {
                    total_score++;
                }
            }
            if(total_score>8) {
                System.out.println("Your Total Score is " + total_score + "/" + questions.length+" Keep Going");
            }
            else if(total_score>5 && total_score<8)
            {
                System.out.println("Your score is "+ total_score+"/"+questions.length+" Work hard");
            }
            else
            {
                System.out.println("Prepare well do good in next test");
            }

        }
}

