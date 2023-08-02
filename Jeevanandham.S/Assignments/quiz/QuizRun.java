package org.example.quiz;


import java.util.Scanner;

public class QuizRun {


    Scanner sc = new Scanner(System.in);
    static Quiz[] list = new Quiz[6];
    int count = 0;
    public void answer(String question, char answer ){
        System.out.println(question);
        System.out.println("Enter the answer");
        char userAns = sc.next().charAt(0);
        if(userAns == 'a' || userAns =='b'|| userAns == 'c' || userAns == 'd'){
            list[count] = new Quiz(question, answer, userAns);
            count++;

        }
        else {
            System.out.println("Invalid answer");
            answer(question,answer);
        }

    }

    public int validateAnswer(){
        int totalScore = 0;
        for(Quiz data:list){
            if(data.getActAns() == data.getUserAns()){
                totalScore++;
            }
        }
        return totalScore;
    }

    public void question(){
        answer("1. Number of primitive data types in Java are?" +
                "\n a.6\n b.7\n c.8\n d.9",'c');
        answer("2. What is the size of float and double in java?" +
                "\n a.32 and 64\n b.32 and 32 \n c.64 and 64 \n d.64 and 32",'a');
        answer("3. Select the valid statement.\na.char[] ch = new char(5)" +
                "\nb.char[] ch = new char[5] \nc.char[] ch = new char() " +
                "\nd.char[] ch = new char[]",'b');
        answer("4. When an array is passed to a method, what does the method receive?" +
                "\na.The reference of the array\nb.A copy of the array" +
                "\nc.Length of the array\nd.Copy of first element",'a');
        answer("5. Select the valid statement to declare and initialize an array." +
                "\na.int[] A = {}\nb.int[] A = {1,2,3}\nc.int[] A = (1,2,3)" +
                "\nd.int[][]A = {1,2,3}",'b');
        answer("6. Find the output of the following program.\n" +
                "\n" +
                "public class Solution{\n" +
                "       public static void main(String[] args){\n" +
                "               int[]  x = {120, 200, 016};\n" +
                "               for(int i = 0; i < x.length; i++){\n" +
                "                        System.out.print(x[i] + “ “);\n" +
                "               }                   \n" +
                "       }\n" +
                "}\na.120 200 016\nb.120 200 14\nc.120 200 16\nd.None",'b');

    }



    public static void main(String[] args) {
        System.out.println("******************* WELCOME TO JAVA QUIZ ********************");
        QuizRun qr = new QuizRun();
        qr.question();
        System.out.println("******************** RESULT ************************");
        System.out.println("Total score out of 6 is "+qr.validateAnswer());
        for(Quiz i:list){
            System.out.println(i);
        }




    }
}
