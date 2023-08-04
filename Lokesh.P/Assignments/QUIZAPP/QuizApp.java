import java.util.ArrayList;
import java.util.Scanner;
public class QuizApp {
    static ArrayList<Question> questions = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        questions.add(new Question("1.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9", "b"));
        questions.add(new Question("2.Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard", "c"));
        questions.add(new Question("3.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent", "c"));
        questions.add(new Question("4.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9", "b"));
        questions.add(new Question("5.Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard", "c"));
        questions.add(new Question("6.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent", "c"));
        questions.add(new Question("7.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9", "b"));
        questions.add(new Question("8.Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard", "c"));
        questions.add(new Question("9.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent", "c"));
        questions.add(new Question("10.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9", "b"));
        Quiz_Display  q =new Quiz_Display();
        q.display(questions);



               /* if(choice.equals(questions.get(i).getAnswer())){
                    mark++;
                }
            }
            System.out.println("your score is "+mark+" out of 10");*/
        }
    }
