import java.util.Scanner;

 class Question {
    private String question;
    private String choices;
    private char answer;

    public Question(String question, String choices, char answer) {
        this.question = question;
        this.choices = choices;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getChoices() {
        return choices;
    }

    public char getAnswer() {
        return answer;
    }
}


 class Quiz {
    static Question[] questions = {
        new Question("How many primitive data types are there in Java?", "a) 5\nb) 7\nc) 6\nd) 8", 'd'),
        new Question("Which of the following options is a valid class identifier in Java?", "a) creditcard\nb) creditCard\nc) CreditCard\nd) 1creditCard", 'c'),
        new Question("Java permits a class to extend only one other class directly. This is called", "a) Hierarchical inheritance\nb) single inheritance\nc) multilevel\nd) hybrid", 'b'),
        new Question("The ______ keyword is used to call the constructor of the parent class", "a) this\nb) Parent class name\nc) super\nd) parent", 'c'),
        new Question("OOP allows a class to make use of another class. This kind of relationship is called _________", "a) Generalization\nb) Utilization\nc) Composition\nd) Instantiation", 'b')
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        char[] inputVal = new char[questions.length];

        System.out.println("Choose the correct answer");


        for (int i = 0; i < questions.length; i++)
	 {

                System.out.println((i + 1) + ". " + questions[i].getQuestion());
                System.out.println(questions[i].getChoices());

            do
	    {
		System.out.println("Enter valid option");
                inputVal[i] = scanner.next().charAt(0);
            } while (inputVal[i] < 'a' || inputVal[i] > 'd');


            System.out.println("Enter 'p' for previous and 'n' for next question");
            char norp = scanner.next().charAt(0);

                if (norp == 'p') 
		{
		    if(i==0)
		    {
			System.out.println("You are already at first question");
			i++;
		    }
		    i = i - 2;

                }														
          
	}

	for(int i=0;i<questions.length;i++)
            if (inputVal[i] == questions[i].getAnswer()) 
	    {
                 score++;
            }
	{
	}

        System.out.println("Your score: " + score);
        System.out.println("Quiz finished");
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
