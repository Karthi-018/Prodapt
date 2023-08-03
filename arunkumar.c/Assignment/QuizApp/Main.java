package mcq;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Question> questions = new ArrayList<>();
    public static void main(String[] args) {

        questions.add(new Question("1.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9","b"));
        questions.add(new Question("2.Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard","c"));
        questions.add(new Question("3.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent","c"));
        questions.add(new Question("4.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9","b"));
        questions.add(new Question("5.Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard","c"));
        questions.add(new Question("6.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent","c"));
        questions.add(new Question("7.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9","b"));
        questions.add(new Question("8.Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard","c"));
        questions.add(new Question("9.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent","c"));
        questions.add(new Question("10.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9","b"));
        int mark = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<questions.size();i++){
            System.out.println(questions.get(i).getQuestion());
            String choice = sc.next();
            if(choice.equals(questions.get(i).getAnswer())){
                mark++;
            }
        }
        System.out.println("your score is "+mark+" out of 10");
    }
}
