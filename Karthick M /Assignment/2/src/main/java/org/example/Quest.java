package org.example;

public class Quest {
    Quiz[] quizzes = new Quiz[10];
    public void question() {

        quizzes[0] = new Quiz("a.When Luffy was young,He had an idol.What was his idol's name?\n1.Roronoa Zoro\n2.Ace\n3.Shanks",3);

        quizzes[1] = new Quiz("b.Who wrote about Fifth Emperor?\n1.Morgan\n2.Elders\n3.Big Mom",1);
        System.out.println("Enter Choice Number : ");
        Quiz quiz2 = new Quiz("c.What is the highest position in Marine?\n1.Admiral\n2.Fleet Admiral\n3.Vice Admiral",2);
        quizzes[2] = quiz2;
        System.out.println("Enter Choice Number : ");
        Quiz quiz3 = new Quiz("d.Who of the eleven Supernovas ate a Zoan Devil Fruit?\n1.X Drake\n2.Bonney\n3.Kid",1);
        quizzes[3] = quiz3;
        System.out.println("Enter Choice Number : ");
        Quiz quiz4 = new Quiz("e.What are all of kuja tribe named after?\n1.Tree\n2.Flower\n3.Fruit",2);
        quizzes[4] = quiz4;
        System.out.println("Enter Choice Number : ");
        Quiz quiz5 = new Quiz("f.Who is the most wanted man in the world?\n1.Gol D Roger\n2.Monkey D Dragon\n3.Monkey D Garp",2);
        quizzes[5] = quiz5;
        System.out.println("Enter Choice Number : ");
        Quiz quiz6 = new Quiz("g.Who gave Shanks the scar on his eye?\n1.Blackbeard\n2.buggy\n3.Mihawk",1);
        quizzes[6] = quiz6;
        System.out.println("Enter Choice Number : ");
        Quiz quiz7 = new Quiz("h.Who was the first villain to defeat Luffy?\n1.Arlong\n2.Buggy\n3.Crocodile",3);
        quizzes[7] = quiz7;
        System.out.println("Enter Choice Number : ");
        Quiz quiz8 = new Quiz("i.Who was the first recruit of the Straw Hart crew?\n1.Zoro\n2.Sanji\n3.Nami",1);
        quizzes[8] = quiz8;
        System.out.println("Enter Choice Number : ");
        Quiz quiz9 = new Quiz("j.Luffy ate which Devil Fruit?\n1.Gum Gum no mi\n2.Hito Hito no mi\n3.Gura Gura no mi",2);
        quizzes[9] = quiz9;
        System.out.println("Enter Choice Number : ");
    }
}