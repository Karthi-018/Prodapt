import java.util.*;
class quiz
{
    static int checkAns(int selectedAns, int correctAns)
    {
        if (selectedAns == correctAns)
        {
            System.out.println("Congratulation!");
            return 10;
        }
        else
        {
            System.out.println("Incorrect");
            return 0;
        }
    }
    public static void main(String[] args) {

        quiz obj = new quiz();
        int Score = 0;
        int[] arr = {2, 3, 2};
        Scanner s = new Scanner(System.in);

        System.out.println("************* Welcome_to_the_quiz **************");

        System.out.println("A) Which planet is closest to the sun?");
        System.out.println("1. Mars \n2. Mercury \n3. Earth \n4. Venus");
        int choose = s.nextInt();
        Score += checkAns(choose, arr[0]);


        System.out.println("B) Which is the only body part that is fully grown from birth?");
        System.out.println("1. Nose \n2. Feet \n3. Eyes \n4. Hair");
        choose = s.nextInt();
        Score += checkAns(choose, arr[1]);


        System.out.println("C) How many hearts does an Octopus have?");
        System.out.println("1. Eight \n2. Three \n3. Five \n4. Two");
        choose = s.nextInt();
        Score += checkAns(choose, arr[2]);

        System.out.println("Your total score is: "+Score);
    }
}


