import java.util.*;

public class Email {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String mail=sc.next();
        pojo ob=new pojo(mail);
        Main obj=new Main();
        if(obj.validateEmail(ob.getMail())==true){
            System.out.println("Email is valid");
        }
        else{
            System.out.println("Email is invalid");
        }
    }

}
