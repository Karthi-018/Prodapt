package org.example.quiz;


import java.util.Scanner;

public class QuizRun {


    Scanner sc = new Scanner(System.in);
    static Quiz[] list = new Quiz[5];
    static int totalScore = 0;
    public void answer( ) {
        System.out.println(list[0]);
        validateAns(list[0]);
        for(int i=1;i<5;i++){
            System.out.println("Type nx to go to next question");
            String nx = sc.next();
            if(nx.equals("nx")){
                System.out.println(list[i]);
                validateAns(list[i]);
              }
        }


    }

        public void validateAns(Quiz data){

            System.out.println("Enter the right option");
            char userAns = sc.next().charAt(0);

            if(userAns == 'a' || userAns =='b'|| userAns == 'c' || userAns == 'd'){
                if(data.getActAns() == userAns) {
                    totalScore++;
                }
            }
            else {
                System.out.println("Invalid answer");
                validateAns(data);
            }

        }






    public void question(){
        list[0] = new Quiz("1. Number of primitive data types in Java are?",
                "6","7" ,"8","9",'c');
        list[1] =  new Quiz("2. What is the size of float and double in java?",
                "32 and 64","32 and 32","64 and 64","64 and 32",'a');
        list[2] = new Quiz("3. Select the valid statement.","char[] ch = new char(5)",
                "char[] ch = new char[5]","char[] ch = new char() ",
                "char[] ch = new char[]",'b');
        list[3] = new Quiz("4. When an array is passed to a method, what does the method receive?",
                "The reference of the array","A copy of the array",
                "Length of the array","Copy of first element",'a');
        list[4] = new Quiz("5. Select the valid statement to declare and initialize an array.",
                "int[] A = {}","int[] A = {1,2,3}","int[] A = (1,2,3)",
                "int[][]A = {1,2,3}",'b');

        answer();
    }



    public static void main(String[] args) {
        System.out.println("******************* WELCOME TO JAVA QUIZ ********************");
        QuizRun qr = new QuizRun();
        qr.question();
        System.out.println("******************** RESULT ************************");
        System.out.println("Total score out of "+ list.length +" is "+totalScore);
    }
}
