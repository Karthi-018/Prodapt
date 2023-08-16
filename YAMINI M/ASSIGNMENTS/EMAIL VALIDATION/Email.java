import java.util.*;

public class Email {

    public static void main(String args[])
    {

        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Email ID to validate:");
        String email=sc.next();
        Boolean correct =validateEmail(email);

        if(correct)
        {
            System.out.println(email+" Entered Email ID is Valid");
        }
        else {
            System.out.println(email+" Entered Email ID is Invalid" );
        }

    }
    static Boolean validateEmail(String email)
    {
        int at=email.indexOf('@');
        int dot=email.indexOf('.');
        if(at==-1 || dot==-1) {
            return false;
        }
        
        String username = email.substring(0,at);
        String domain=email.substring(at+1,dot);
        String tld=email.substring(dot+1);

    if(!username.matches("[a-z0-9._()]+"))
    {
        return false;
    }
        if(!domain.matches("[a-z]+"))
    {
        return false;
    }

        if(!tld.matches("[a-z]{2,6}"))
    {
        return false;
    }

       return true;

}

}
