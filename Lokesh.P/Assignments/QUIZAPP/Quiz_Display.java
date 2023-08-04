
import java.util.*;

public class Quiz_Display {

    Scanner sc=new Scanner(System.in);


    public void display(ArrayList<Question> questions){

        List<String> d=new ArrayList<>();

        System.out.println(questions.get(0).getQuestion());

        String a=sc.next();

        d.add(0,a);

        System.out.println("Enter 2 for next:");

        int n = sc.nextInt();

        if(n==2) {

            System.out.println(questions.get(1).getQuestion());

            a=sc.next();

            d.add(1,a);

            int i = 1;

            while (i < questions.size()-2) {

                System.out.println("Enter 1 for previous:");

                System.out.println("Enter 2 for next");

                n = sc.nextInt();

                if (n == 1) {

                    System.out.println(questions.get(i - 1).getQuestion());

                    a=sc.next();

                    d.add(i,a);

                    i = i - 1;

                } else if (n == 2) {

                    System.out.println(questions.get(i + 1).getQuestion());

                    a=sc.next();

                    d.add(i,a);

                    i = i + 1;

                } else {

                    System.out.println("Invalid input");

                    i++;

                }

            }

        }

        System.out.println(questions.get(9).getQuestion());


        System.out.println("Enter 1 for previous:");

        n = sc.nextInt();

        if(n==1){

            System.out.println(questions.get(8).getQuestion());

            a=sc.next();

            d.add(8,a);

            System.out.println("Enter 2 for next:");

            n=sc.nextInt();

            System.out.println(questions.get(9).getQuestion());

            a=sc.next();

            d.add(9,a);

        }

        else {
            int total=0;
            /*System.out.println(d);*/
            for(int i=0;i<d.size();i++)
            {
                if(d.get(i).equals(questions.get(i).getAnswer()))
                {
                    total+=1;
                }
            }

            System.out.println("Your total score is "+ total);
        }


    }


}