package emailvalidater;
import java.util.*;

public class Main
{
    static Scanner sc=new Scanner(System.in);
    static boolean validateEmail(String email)
    {
       //Splitting the email into a emailArray with username in 0th index and domain address in 1st Index
       String []emailArray=email.split("@");

       //Validating '@' symbol in the email
       if(emailArray.length==1)
           return false;
       //Validating the username of the email
       if(!Character.isLowerCase(emailArray[0].charAt(0)))
          return false;
       for(int i=1;i< emailArray[0].length();i++)
       {
           if(!(Character.isLetterOrDigit(emailArray[0].charAt(i))||emailArray[0].charAt(i)=='.'||emailArray[0].charAt(i)=='_'))
               return false;

       }

       //Splitting the 1st index of emailArray into domainAddress with domain name in 0th index and TLD in 1st index
       String[] domainAddress=(emailArray[1]).split("\\.");

       //Validating the '.' in the domain address of the email
       if(domainAddress.length==1)
           return false;

       //Validating the domain name of the domain address
       for(int i=0;i<domainAddress[0].length();i++)
       {
           if(!Character.isLowerCase(domainAddress[0].charAt(i)))
               return false;
       }

       //Validating the TLD of the domain address
       if(domainAddress[1].length()>=2&& domainAddress[1].length()<=6)
       {
           for(int i=0;i<domainAddress[1].length();i++)
           {
               if(!Character.isLowerCase(domainAddress[1].charAt(i)))
                   return false;
           }
       }
       else
           return false;
       //Returns true if email validations have been passed
       return true;
   }
   public static void main(String[] args)
   {
        //Creating an EmailPojo object
        EmailPojo object=new EmailPojo();
        System.out.println("ENTER YOUR EMAIL ID");
        object.setEmail(sc.next());

        //Calling validateEmail() to valid the email id
        if(validateEmail(object.getEmail()))
            System.out.println("Email is valid");
        else
            System.out.println("Email is invalid");
   }
}
