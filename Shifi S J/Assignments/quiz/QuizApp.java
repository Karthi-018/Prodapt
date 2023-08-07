import java.util.*;
class QuizApp 
{
    static QuizApp Question[] = new App[5];
    static int i=0;

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);


        Question[0] = new quizPojo("1.The default value of a static integer variable of a class in Java is \n a)0 \n b)null \n c)garbage value \n d)1");

        Question[1] = new App("2.Which of the following options is a valid class identifier in Java ","c","\na.creditcard","\nb.creditCard","\nc.CreditCard","\nd.1creditCard");

        Question[2] = new quizPojo("3.The ______ keyword is used to call the constructor of the parent class ","c","\na.this","\nb.parent class name","\nc.super","\nd.parent");

        Question[3] = new App("3.Which of the following variable declaration would NOT compile in a java program \n a)int var \n b)int VAR \n c)int var_1 \n d)int 1_var");

        Question[4] = new quizPojo("4.Which of the following is a member of the java.lang package \n a)Math \n b)List \n c)Queue \n d)Stack");

        Question[5] = new quizPojo("5.What is the initial quantity of the ArrayList list? \n a)5 \n b)10 \n c)0 \n d)100");
       
        Question[0].setOption4("\nd.10");//for updating incorrect option

        System.out.println("WELCOME TO MY QUIZ APP");
        
       	int mark = 0;

        for(int i=0;i<Question.length;) {
            System.out.println(Question[i].getQuestion());
            System.out.println(Question[i].getOption1());
            System.out.println(Question[i].getOption2());
            System.out.println(Question[i].getOption3());
            System.out.println(Question[i].getOption4());

            System.out.println("Enter Answer");
            String user_ans = sc.next();

            System.out.println("1.NEXT QUESTION");
            System.out.println("2.PREVIOUS QUESTION");
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

        System.out.println("Thank you. Your score is :"  +mark+  "out of 10);
    }
}











    }


