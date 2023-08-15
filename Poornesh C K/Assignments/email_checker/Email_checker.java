import java.util.Scanner;

public class Email_checker {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Email-id");
        String email= sc.next();
        if(Main.validateEmail(email)){
            System.out.println(email+" is a valid email id.");
        }
        else{
            System.out.println("Email is invalid");
        }
    }
}