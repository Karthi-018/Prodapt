import java.util.*;
class QuizApp {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Question[] = new String[10];

        Question[0] = ("1.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9");
        Question[1] = ("2.Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard");

        Question[2] = ("3.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent");
        Question[3] = ("4.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9");

        Question[4] = ("5.Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard");
        Question[5] = ("6.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent");
        Question[6] = ("7.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9");
        Question[7] = ("8.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9");
        Question[8] = ("9.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent");
        Question[9] = ("10.Number of primitive data types in Java are \na.8\nb.7\nc.6\nd.9");

        String Ans[] = {"b", "c", "c", "b", "c", "c", "b", "b", "c", "a"};
        //String user_ans[] = new String[10];


        int choice=0;
        System.out.println("WELCOME TO QUIZ APP");
        System.out.println("*********************************");
        System.out.println("Press 1 to start Quiz");
        choice=sc.nextInt();

        int mark = 0;
        for(int i=0;i<Question.length;i++){
            System.out.println(Question[i]);
            String user_ans=sc.next();
            if(user_ans.equals(Ans[i])){
                mark++;
            }
        }
        System.out.println("Your score is :" +mark);









    }


}
