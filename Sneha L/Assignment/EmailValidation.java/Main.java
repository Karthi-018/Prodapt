import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email address:");
        String mailId = sc.next();
        EmailPojo mail = new EmailPojo(mailId);

        if (validateEmail(mail.getEmail())) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is Invalid");
        }
    }

    static Boolean validateEmail(String email) {
        //Check if "@" present in the email or not
        int atIndex = email.indexOf("@");
        if (atIndex == -1) {
            return false;
        }
        //Split the email address into username and domain name
        String s1 = email.substring(0, atIndex);
        String s2 = email.substring(atIndex + 1);
        
        //Validate the username 
        for (char i : s1.toCharArray()) {
            if ((!Character.isLowerCase(i)) && (!Character.isDigit(i)) && i != '.' && i != '_') {
                return false;
            }
        }
        //Check if "." present in the email or not
        int atIndex1 = s2.indexOf(".");
        if (atIndex1 == -1) {
            return false;
        }
        // split the domain parts of email
        String[] parts = s2.split("\\.");
        String domainName = parts[0];
        String tldName = parts[1];
        
        //Validate the domain name
        for (char c : domainName.toCharArray()) {
            if (!Character.isLowerCase(c))
                return false;
        }
        // Validate the TLD 
        if (tldName.length() >= 2 && tldName.length() <= 6) {
            for (char c : tldName.toCharArray()) {
                if (!Character.isLowerCase(c))
                    return false;
                break;
            }
        }
        else{
            return  false;
        }
        //All validations passed,
            return true;
        }
    }
