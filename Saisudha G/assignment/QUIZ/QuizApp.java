import java.util.*;
class QuizApp {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Question[] = new String[10];

        Question[0] = new String("1.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9");
        Question[1] = new String("2.Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard");

        Question[2] = new String("3.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent");
        Question[3] = new String("4.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9");

        Question[4] = new String("5.Which of the following options is a valid class identifier in Java \na.creditcard\nb.creditCard\nc.CreditCard\nd.1creditCard");
        Question[5] = new String("6.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent");
        Question[6] = new String("7.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9");
        Question[7] = new String("8.Number of primitive data types in Java are \na.7\nb.8\nc.6\nd.9");
        Question[8] = new String("9.The ______ keyword is used to call the constructor of the parent class \na.this\nb.parent class name\nc.super\nd.parent");
        Question[9] = new String("10.Number of primitive data types in Java are \na.8\nb.7\nc.6\nd.9");

        String Ans[] = {"b", "c", "c", "b", "c", "c", "b", "b", "c", "a"};
        String user_ans[] = new String[10];


        int choice=0;
        System.out.println("WELCOME TO QUIZ APP");
        System.out.println("*********************************");
        System.out.println("Press 1 to start Quiz");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println(Question[0]);

                System.out.println("Enter answer:");
                user_ans[0]=sc.next().toLowerCase();
            case 2:
                System.out.println(Question[1]);
                System.out.println("Enter answer:");
                user_ans[1]=sc.next().toLowerCase();
            case 3:
                System.out.println(Question[2]);
                System.out.println("Enter answer:");
                user_ans[2]=sc.next().toLowerCase();
            case 4:
                System.out.println(Question[3]);
                System.out.println("Enter answer:");
                user_ans[3]=sc.next().toLowerCase();
            case 5:
                System.out.println(Question[4]);
                System.out.println("Enter answer:");
                user_ans[4]=sc.next().toLowerCase();
            case 6:
                System.out.println(Question[5]);
                System.out.println("Enter answer:");
                user_ans[5]=sc.next().toLowerCase();
            case 7:
                System.out.println(Question[6]);
                System.out.println("Enter answer:");
                user_ans[6]=sc.next().toLowerCase();
            case 8:
                System.out.println(Question[7]);
                System.out.println("Enter answer:");
                user_ans[7]=sc.next().toLowerCase();
            case 9:
                System.out.println(Question[8]);
                System.out.println("Enter answer:");
                user_ans[8]=sc.next().toLowerCase();
            case 10:
                System.out.println(Question[9]);
                System.out.println("Enter answer:");
                user_ans[9]=sc.next().toLowerCase();

                //break;


        }

        int mark = 0;
        boolean flag = false;
        for (int i = 0; i < Ans.length-1; i++) {
            if (Ans[i].equals(user_ans[i])) {
                flag = true;
                mark++;

            }


        }
        if (flag) {
            mark++;
            System.out.println("Your Score is:"+mark);
        } else {

            flag = false;
            System.out.println("Your Score is:"+mark);
        }








    }


}
