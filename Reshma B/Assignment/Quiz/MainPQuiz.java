import java.util.*;
class MainPQuiz
{
    public static void main(String args[])
    {
        MainPQuiz mpq = new MainPQuiz();
        PQuiz arr[]= new PQuiz[7];
        String s1 = "Which do you think is your best trait? \n1. Independant \n2. Adaptability \n3. Protectiveness \n4. Cheerfulness \n ";
        String s2 = "\nWhich of these do you think is your worst trait? \n1. Stubborness \n2. Shyness \n3. Anxiousness \n4. Possessiveness \n ";
        String s3 = "\nHow good are you as a team player? \n1. I prefer working on my own \n2. I do all my tasks but I have trouble voicing my opinions \n3. I actively take part in every activity and discussion within my team \n4. I bring the snacks :) !!!! \n ";
        String s4 = "\nWhat would you be doing at a party? \n1. Probably wander off somewhere alone \n2. A party? I'd rather stay at home!!! \n3. Stick with my group of friends the entire time \n4. There's no party WITHOUT ME!!!! \n ";
        String s5 = "\nChoose a movie that came out this year? \n1. Oppenheimer \n2. Spiderman Across the Spiderverse \n3. Creed 3 \n4. Barbie \n ";
        String s6 = "\nWhich of these places do you want to go to? \n1. New York \n2. Australia \n3. London \n4. Japan \n ";
        String s7 = "\nFinally, did you like this quiz? \n1. Waste of time -.- \n2. It was cool ig :/ ... \n3. It's dumb, but I had fun :) \n4. MORE OF THIS PLEASE :D !!!!!!! \n ";
        arr[0]=new PQuiz(s1, 1, 2, 3, 4);
        arr[1]=new PQuiz(s2, 1, 2, 3, 4);
        arr[2]=new PQuiz(s3, 1, 2, 3, 4);
        arr[3]=new PQuiz(s4, 1, 2, 3, 4);
        arr[4]=new PQuiz(s5, 1, 2, 3, 4);
        arr[5]=new PQuiz(s6, 1, 2, 3, 4);
        arr[6]=new PQuiz(s7, 1, 2, 3, 4);  
        mpq.eval(arr);   
    }

    public void eval(PQuiz arr[])
    {
        int cone=0;
        int ctwo=0;
        int cthree=0;
        int cfour=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------------QUIZ: WHICH DOG BREED ARE YOU?-----------------");
        System.out.println("IN THIS QUIZ, GET TO KNOW WHICH DOG BREED SUITS YOUR PERSONALITY");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].q);
            System.out.println("Choose your answer: ");
            int answer=sc.nextInt();
            if(answer==arr[i].one)
            {
                cone=cone+5;
            }

            else if(answer==arr[i].two)
            {
                ctwo=ctwo+5;
            }

            else if(answer==arr[i].three)
            {
                cthree=cthree+5;
            }

            else if(answer==arr[i].four)
            {
                cfour=cfour+5;
            }

            else 
            {
               break;
            }
        }
        
        if(cone>ctwo && cone>cthree && cone>cfour)
        {
            System.out.println("You're a Husky");
            System.out.println("Congratulations!!! You personality matches that of the Husky.");
            System.out.println("You tend to be a lone wolf and not rely on others to do your job. This may result in you struggling to open up to others but your fearless nature enables you to very much tackle the challenges that come your way head-on.");
        }
        

        else if(ctwo>cthree && ctwo>cfour)
        {
            System.out.println("You're a Chihuahua");
            System.out.println("Congratulations!!! You personality matches that of the Chihuahua.");
            System.out.println("You mostly tend to keep to yourself and so people may end up underestimate you but you definitely pack a punch. You're witty, agile and bursting with ideas and solutions");
    
        }
        

        else if(cthree>cfour)
        {
            System.out.println("You're a Great Dane");
            System.out.println("Congratulations!!! You personality matches that of the Great Dane.");
            System.out.println("You are protective of the people you love and would very much do anything for them. Although you are prone to making poor decisions and jeopardizing your relationships in that process, people around you know that you are an absolute keper...");
        }

        else 
        {
            System.out.println("You're a Golden Retriever");
            System.out.println("Congratulations!!! You personality matches that of the Golden Retriever.");
            System.out.println("You are very much the life of the party and your mere presence lights up the entire place. People love you just for it and you make friends with people easily. Sometimes, you may get a tad bit possessive towards the people you love but your infectious energy makes people want to have you around.");
        
        }
    }
}
