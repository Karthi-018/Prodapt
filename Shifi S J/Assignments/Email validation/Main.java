import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String email = sc.next();

        boolean email_id = validateEmail(email);


        if (email_id) {

            System.out.println("Email is valid");

        } else {

            System.out.println("Email is invalid");

        }

    }


    static boolean validateEmail(String email) 
    {

        if (email.matches("^[a-z]([a-z0-9_.])+@[a-z]+.[a-z]{2,6}$"))   //checks condition as per requirements
        {

            return true;

        } else {

            return false;

        }

    }

}




