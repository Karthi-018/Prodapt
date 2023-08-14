import java.util.Scanner;
public class Main1
  {
    static Boolean validateEmail(String email) {
        String regex = "^[a-z][a-z0-9._]*@[a-z]{2,6}\\.[a-z]{2,6}$";
        return email.toLowerCase().matches(regex);
    }
    public static void main(String[] args) 
   {
        Scanner sc=new Scanner(System.in);
        String em =sc.nextLine();
//        System.out.println(em + " : " + validateEmail(em));
        if(validateEmail(em)) 
        {
            System.out.println(em + " : " + "Email is Valid");
        }
        else 
        {
            System.out.println(em + " : " + "Email is InValid");
        }
    }
}

 
