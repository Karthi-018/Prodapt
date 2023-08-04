import java.util.*;
class QuizApp1 {
    static App Question[] = new App[10];
    static int i=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        Question[0] = new App("1.Number of primitive data types in Java are","b"," \na.7","\nb.8","\nc.6","\nd.9");
        Question[1] = new App("2.Which of the following options is a valid class identifier in Java ","c","\na.creditcard","\nb.creditCard","\nc.CreditCard","\nd.1creditCard");

        Question[2] = new App("3.The ______ keyword is used to call the constructor of the parent class ","c","\na.this","\nb.parent class name","\nc.super","\nd.parent");
        Question[3] = new App("4.Number of primitive data types in Java are ","b","\na.7","\nb.8","\nc.6","\nd.9");

        Question[4] = new App("5.Which of the following options is a valid class identifier in Java ","c","\na.creditcard","\nb.creditCard","\nc.CreditCard","\nd.1creditCard");
        Question[5] = new App("6.The ______ keyword is used to call the constructor of the parent class ","c","\na.this","\nb.parent class name","\nc.super","\nd.parent");
        Question[6] = new App("7.Number of primitive data types in Java are ","b","\na.7","\nb.8","\nc.6","\nd.9");
        Question[7] = new App("8.Number of primitive data types in Java are ","b","\na.7","\nb.8","\nc.6","\nd.9");
        Question[8] = new App("9.The ______ keyword is used to call the constructor of the parent class ","c","\na.this","\nb.parent class name","\nc.super","\nd.parent");
        Question[9] = new App("10.Number of primitive data types in Java are ","a","\na.8","\nb.7","\nc.6","\nd.9");
        Question[0].setOption4("\nd.10");//for updating incorrect option




        System.out.println("WELCOME TO QUIZ APP");
        System.out.println("*********************************");
        //System.out.println("Press 1 to start Quiz");


        int mark = 0;

        for(int i=0;i<Question.length;) {
            System.out.println(Question[i].getQuestion());
            System.out.println(Question[i].getOption1());
            System.out.println(Question[i].getOption2());
            System.out.println(Question[i].getOption3());
            System.out.println(Question[i].getOption4());

            System.out.println("Enter Answer");
            String user_ans = sc.next();


                System.out.println("1.NEXT");
                System.out.println("2.PREVIOUS");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        if (i < Question.length-1) {
                            
                            if (user_ans.equals(Question[i].getAns())) {
                                mark++;
                            }

                        }
                        i++;
                        break;
                    case 2:
                        if (i > 0 && i < Question.length-1) {
                           
                            if (user_ans.equals(Question[i].getAns())) {
                                mark++;
                            }
                        }
                        i--;
                        break;

                }


            }

        System.out.println("Your score is :"  +mark+  "out of 10);


           }











    }



