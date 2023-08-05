import java.util.*;
public class QuizMain
{
    static int score=0;
    static pojoQuiz[] qArr= new pojoQuiz[5];
    public static void main(String[] args)
    {
    Scanner s= new Scanner(System.in);

        qArr[0] = (new pojoQuiz("1.Which planet is closest to the sun?", "A. Mars", "B. Mercury", "C. Earth", "B"));
        qArr[1] = (new pojoQuiz("2.Which is the only body part that is fully grown from birth?", "A. Nose", "B. Hair", "C. Eyes", "C"));
        qArr[2] = (new pojoQuiz("3.How many hearts does an Octopus have", "A. Three", "B. Two", "C. Eight", "A"));
        qArr[3] = (new pojoQuiz("4.Who is the Home Minister of India", "A. Modi ji", "B. Rajnath Singh", "C. Amit Shah", "C"));
        qArr[4] = (new pojoQuiz("5.Who is Defence Minister of India", "A. Rajnath Singh", "B. Nirmala Sitharam", "C.Murmu ji", "A"));

        for(int i=0;i<qArr.length;)
        {
            System.out.println(qArr[i].getQuestion());
            System.out.println(qArr[i].getOption1());
            System.out.println(qArr[i].getOption2());
            System.out.println(qArr[i].getOption3());

            System.out.println("Choose your option.");
            String choose = s.nextLine();
            System.out.println("1.next");
            System.out.println("2.previous");
            int choice = s.nextInt();

            switch(choice)
            {
                case 1:
                    if( i< qArr.length-1)
                    {
                        if(choose.equalsIgnoreCase(qArr[i].getcAns()))
                        {
                            System.out.println("Congratulations");
                            score+=10;
                        }
                        break;
                    }
                    i++;
                    break;

                case 2:
                if(i>1 && i< qArr.length-1)
                {
                    if(qArr[i].getcAns().equalsIgnoreCase(choose))
                    {
                        System.out.println("Congratulations");
                        score+=10;
                    }

                }
                i--;
                break;


            }



//            else
//            {
//                System.out.println("Sorry Incorrect");
//            }


        }
        System.out.println("Your score is"+score);






    }
}
