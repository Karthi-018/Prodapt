import java.util.Scanner;

public class Quiz {
      static String[] qns = {
        "How many primitive data types are there in Java?",
        "Which of the following options is a valid class identifier in Java?",
        "Java permits a class to extend only one other class directly. This is called",
        "The ______ keyword is used to call the constructor of the parent class",
        "OOP allows a class to make use of another class. This kind of relationship is called _________"
    };

     static String[] choices = {
        "a) 5\nb) 7\nc) 6\nd) 8",
        "a) creditcard\nb) creditCard\nc) CreditCard\nd) 1creditCard",
        "a) Hierarchical inheritance\nb) single inheritance\nc) multilevel\nd) hybrid",
        "a) this\nb) Parent class name\nc) super\nd) parent",
        "a) Generalization\nb) Utilization\nc) Composition\nd) Instantiation"
    };

     static char[] answers = {'d', 'c', 'b', 'c', 'b'};


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        char inputVal;
	

        System.out.println("Choose the correct answer");

        for (int i = 0; i < qns.length; i++) {
            System.out.println((i + 1) + ". " + qns[i]);
            System.out.println(choices[i]);

            do {
                inputVal = scanner.next().charAt(0);

            } while (inputVal < 'a' || inputVal > 'd');


            if (inputVal == answers[i]) {
                score++;
            }
        }

        System.out.println("Your score: " + score);
    }
}


/* 2-d array

import java.util.Scanner;

public class Quiz {
     static String[][] qns = {
            {"How many primitive data types are there in java ?", "5", "7", "6", "8", "d"},
            {"Which of the following options is a valid class identifier in Java?", "creditcard", "creditCard", "CreditCard", "1creditCard", "c"},
            {"Java permits a class to extend only one other class directly. This is called", "Hierarchical inheritance", "single inheritance", "multilevel", "hybrid", "b"},
            {"The ______ keyword is used to call the constructor of the parent class", "this", "Parent class name", "super", "parent", "c"},
	    {"OOP allows a class to make use of another class. This kind of relationship is called _________", "Generalization","Utilization", "Composition", "Instantiation", "b"},

    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        char inputval;
        System.out.println("Choose the correct answer");

        for (int i = 0; i < qns.length; i++) {
            String question = qns[i][0];
            String[] choices = {qns[i][1], qns[i][2], qns[i][3], qns[i][4]};
            String ans = qns[i][5];

            System.out.println((i + 1) + ". " + question);
            char choiceChar = 'a';
            for (int j = 0; j < choices.length; j++) {
                System.out.println(choiceChar + ") " + choices[j]);
                choiceChar++;
            }

            do {
                inputval = scanner.next().charAt(0);
    
            } while (inputval < 'a' || inputval > 'd');

            if (inputval == ans.charAt(0)) {
                score++;
            }
        }

        System.out.println("Your score: " + score);
    }
}

*/
