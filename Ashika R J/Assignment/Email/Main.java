import java.util.Scanner;
public class Main {
    public static void main(String a[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Email: ");
        String email= sc.nextLine();
        if (mail.validateEmail(email)){
            System.out.println("Email is VALID");
        }
        else {
            System.out.println("Email is INVALID!!");
        }
    }
}