package FoodAggregator;

import java.util.Scanner;

public class EmailMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your email");
        String email = sc.next();

        if (validateEmail(email))
        {
            System.out.println("Email is valid");
        }
        else {
            System.out.println("Email is invalid");
        }
    }

    public static boolean validateEmail(String email)
    {
        String regex = "^[a-z]+[a-z0-9._]*[a-z0-9]@[a-z]+\\.[a-z]{2,6}$";
        return email.matches(regex);
    }
}
