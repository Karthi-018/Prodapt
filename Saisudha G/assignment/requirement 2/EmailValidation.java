import java.util.Scanner;

public class EmailValidation {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter email Id ");
        String email=sc.next();
        boolean result= Main.validateEmail(email);
        if(result){
            System.out.println("Email is Valid");
        }
        else{
            System.out.println("Email is Invalid");
        }
    }

}

