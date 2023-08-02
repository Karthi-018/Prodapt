import java.util.Scanner; 
 
class QuizProgram { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    int score = 0; 
     
    System.out.println("Welcome"); 
     
    System.out.println("Question 1: Who is the Brilliant student?"); 
    System.out.println("a. Karthick"); 
    System.out.println("b. Fazil"); 
    System.out.println("c. Lavanya"); 
    String answer1 = input.nextLine().toLowerCase(); 
    if (answer1.equals("b")) { 
      System.out.println("Correct!"); 
      score++; 
    } else { 
      System.out.println("Sorry, the correct answer is Fazil."); 
    } 
     
    System.out.println("Question 2: Which is the most awaited movie ?"); 
    System.out.println("a. Leo"); 
    System.out.println("b. Vikram"); 
    System.out.println("c. kaithi"); 
    String answer2 = input.nextLine().toLowerCase(); 
    if (answer2.equals("a")) { 
      System.out.println("Correct!"); 
      score++; 
    } else { 
      System.out.println("Sorry, the correct answer is Leo."); 
    } 
     
    
    System.out.println("Your final score is: " + score); 
  } 
} 