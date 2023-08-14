import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Mail Id");
        String email = s.next();
        boolean a=validateEMail(email);
        if (a) System.out.println("valid");
        else System.out.println("Invalid");
    }
    static Boolean validateEMail(String email) {
        if (email.matches("[a-z][a-zA-Z0-9._]+@[a-z]+\\.[a-z]{2,6}")) return true;
         else return false;
    }
}