import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Main {
 
    static Boolean validateEmail(String email){
        String unpart=null;
        String Etld=null;
        String edomain=null;

        int elen= email.length();
        boolean d=false;
        for(int i=0;i<elen;i++) {  //for checking @ present
            char c = email.charAt(i);

            if ('@' == c) {
                d = true;


            }

        }

        if(!d){
           
            return false;
        }
        else {

            String[] arrofstr=email.split("[@.]");
            
            for (String a:arrofstr
            ) {
                unpart=arrofstr[0];
                edomain=arrofstr[1];
                Etld=arrofstr[2];



            }
            
        }
       


        for(int a=0;a<unpart.length();a++){ //username part checking condition

            
            char[] up =unpart.toCharArray();
            char fc=unpart.charAt(0);
            if(isUpperCase(fc) ) {
                
                return false;
            }
            if (((up[a] == '.') && (up[a] == '_'))) {
                
                return false;

            }




        }

        char [] domain_arr=edomain.toCharArray(); //domain name part condition
        for(int j=0;j<domain_arr.length;j++){
            if (!Character.isLowerCase(domain_arr[j])){
                return false;
                
            }

        }
        char [] tlc_arr=Etld.toCharArray();    //tld part checking condition
        for(int k=0;k<Etld.length();k++){
            if(!(Etld.length()>=2 && Etld.length()<=6 && isLowerCase(tlc_arr[k]))){
                
                return false;

            }

        }

    return true;
    }





}
