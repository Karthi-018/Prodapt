import java.util.*;
public class Main {
    public static boolean validateEmail(String email) {
        
        if (email.matches("^[a-z]+")) {
            return true;
        }
        
        if (email.matches("^[a-z0-9._]+")) {
            return true;
        }
      
        if (email.contains(".") || email.contains("_")) {
             return true;
        }
       
        if (email.contains("@")) {
            return true;
        }
        
        if (email.substring(email.indexOf("@") + 1).matches("^[a-z]+")) {
            return true;
        }
       
        if (email.contains(".")) {
            return true;
        }
       
        if (email.substring(email.indexOf(".") + 1).matches("^[a-z]{2,6}$")) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Email : ");  //mohammedfazil.01@prodapt.com - valid
                                                   // MOHAMMEDffazil - invalid
        String email = scan.nextLine();
        if (validateEmail(email)) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }
}