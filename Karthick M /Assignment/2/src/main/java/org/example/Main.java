package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Quest obj=new Quest();
        int[] ans=new int[10];
        int c=0,d=0;
        //int[] key={3,1,2,1,3,2,1,3,1,2};
        obj.question();

        System.out.println(obj.quizzes[0].getQues());
        ans[0]=s.nextInt();
        System.out.println("Enter b for Next");
        char z=s.next().charAt(0);
        if(z=='b'){
            System.out.println(obj.quizzes[1].getQues());
            ans[1]=s.nextInt();
            int i=1;
            while (i < 8) {
                System.out.println("Enter a for previous");
                System.out.println("Enter b for Next");
                z = s.next().charAt(0);
                if (z == 'a') {
                    System.out.println(obj.quizzes[i - 1].getQues());
                    System.out.println("Enter Choice Number : ");
                    int n = s.nextInt();
                    ans[i - 1] = n;
                    i--;
                } else if (z == 'b') {
                    System.out.println(obj.quizzes[i + 1].getQues());
                    System.out.println("Enter Choice Number : ");
                    int n = s.nextInt();
                    ans[i + 1] = n;
                    i++;
                } else {
                    System.out.println("Invalid choice");
                    i++;
                }
            }
            System.out.println(obj.quizzes[9].getQues());
            System.out.println("You have successfully submitted your test!!!");
            ans[9] = s.nextInt();

            for (int j = 0; j < 10; j++) {
                if (ans[j] == obj.quizzes[i].getAnswer()) {
                    c++;
                } else d++;
            }
            System.out.println("Number of correct answer : " + c);
            System.out.println("Number of Incorrect answer : " + d);
        }
    }
}