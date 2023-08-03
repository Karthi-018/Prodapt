import java.util.*;
class QuizApp1 {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        App Question[] = new App[10];

        Question[0] = new App("1.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9","b");
        Question[1] = new App("2.Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard","c");

        Question[2] = new App("3.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent","c");
        Question[3] = new App("4.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9","b");

        Question[4] = new App("5.Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard","c");
        Question[5] = new App("6.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent","c");
        Question[6] = new App("7.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9","b");
        Question[7] = new App("8.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9","b");
        Question[8] = new App("9.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent","c");
        Question[9] = new App("10.Number of primitive data types in Java are \na.8\nb.7\nc.6\nd.9","a");





        System.out.println("WELCOME TO QUIZ APP");
        System.out.println("*********************************");
        //System.out.println("Press 1 to start Quiz");


        int mark = 0;
        for(int i=0;i<Question.length;i++){
            System.out.println(Question[i].getQuestion());
            String user_ans=sc.next();
            if(user_ans.equals(Question[i].getAns())){
                mark++;
            }
        }
        System.out.println("Your score is :" +mark);









    }


}
