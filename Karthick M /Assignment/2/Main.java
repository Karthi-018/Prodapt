package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] ans=new int[10];
        int c = 0,d = 0;
        int[] key={3,1,2,1,3,2,1,3,1,2};
        for (int i=0;i<10;i++){
            ques(i);
            ans[i]=s.nextInt();
        }
        for(int i=0;i<10;i++) {
            if (ans[i] == key[i]){
                c++;
            }
            else d++;
        }
        System.out.println("Number of correct answer : "+c);
        System.out.println("Number of Incorrect answer : "+d);
    }
    static void ques(int a)
    {
        switch(a){
            case 0:
                System.out.println("When Luffy was young,He had an idol.What was his idol's name?");
                System.out.println("1.Roronoa Zoro");
                System.out.println("2.Ace");
                System.out.println("3.Shanks");
                System.out.println("Enter choice number");
                break;
            case 1:
                System.out.println("Who wrote about Fifth Emperor?");
                System.out.println("1.Morgan");
                System.out.println("2.Elders");
                System.out.println("3.Big Mom");
                System.out.println("Enter choice number");
                break;
            case 2:
                System.out.println("What is the highest position in Marine?");
                System.out.println("1.Admiral");
                System.out.println("2.Fleet Admiral");
                System.out.println("3.Captain");
                System.out.println("Enter choice number");
                break;
            case 3:
                System.out.println("Who of the eleven Supernovas ate a Zoan Devil Fruit?");
                System.out.println("1.X Drake");
                System.out.println("2.Kid");
                System.out.println("3.Bonney");
                System.out.println("Enter choice number");
                break;
            case 4:
                System.out.println("What are all of kuja tribe named after?");
                System.out.println("1.Tree");
                System.out.println("2.Fruit");
                System.out.println("3.Flower");
                System.out.println("Enter choice number");
                break;
            case 5:
                System.out.println("Who is the most wanted man in the world?");
                System.out.println("1.Gol D Roger");
                System.out.println("2.Monkey D Dragon");
                System.out.println("3.Monkey D Garp");
                System.out.println("Enter choice number");
                break;
            case 6:
                System.out.println("Who gave Shanks the scar on his eye?");
                System.out.println("1.Blackbeard");
                System.out.println("2.Whitebeard");
                System.out.println("3.Buggy");
                System.out.println("Enter choice number");
                break;
            case 7:
                System.out.println("Who was the first villain to defeat Luffy?");
                System.out.println("1.Arlong");
                System.out.println("2.Buggy");
                System.out.println("3.Crocodile");
                System.out.println("Enter choice number");
                break;
            case 8:
                System.out.println("Who was the first recruit of the Straw Hart crew?");
                System.out.println("1.Zoro");
                System.out.println("2.Sanji");
                System.out.println("3.Nami");
                System.out.println("Enter choice number");
                break;
            case 9:
                System.out.println("Luffy ate which Devil Fruit?");
                System.out.println("1.Gomu Gomu no mi");
                System.out.println("2.Hito Hito no mi");
                System.out.println("3.Gura Gura no mi");
                System.out.println("Enter choice number");
                break;
        }
    }
}