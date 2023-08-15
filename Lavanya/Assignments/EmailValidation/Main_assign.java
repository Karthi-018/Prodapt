import java.util.*;
public class Main_assign {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String email=scan.next();
        if(validateEmail(email)==true)
            System.out.println("Email is valid");
        else{
            System.out.println("Email is invalid");

        }
    }
    static Boolean validateEmail(String email){

        String str = "";
        int N = email.length();
        for(int i = 0; i < N; i++){
            if(email.charAt(i) != '@'){
                str += email.charAt(i);
            }
            else if(isValid(str)){
                i++;
                while(i < N && email.charAt(i) != '.'){
                    if(email.charAt(i) >= 'A' && email.charAt(i) <= 'Z'){
                        return false;
                    }
                    i++;
                }
                String temp = "";
                i++;
                while(i < N){
                    if(email.charAt(i) >= 'a' && email.charAt(i) <= 'z'){
                        temp += email.charAt(i);
                        i++;}
                    else{
                        return false;
                    }
                }
                if(temp.length() <=1 || temp.length() > 6){
                    return false;
                }
            }
            else{
                return false;

            }
        }
        return true;

    }
    static boolean isValid(String str){
        int N = str.length();
        if(str.charAt(0) == '.' || str.charAt(0) == '_' || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')){
            return false;
        }
        boolean val = true;
        for(int i = 1; i < N; i++){
            if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || str.charAt(i) == '.'
                    || str.charAt(i) == '_' ||( str.charAt(i)>=0 || str.charAt(i)<=9)) continue;
            else{
                val = false;
                break;
            }
        }
        return val;
    }
}