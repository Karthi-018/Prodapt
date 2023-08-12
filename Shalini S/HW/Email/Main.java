import java.util.*;
public class Main {
    static Boolean validateEmail(String email){
        char arr[]=email.toCharArray();
        boolean x=true;
        int index=0;
        //--------------identifying the index of @ -------------------------------------
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='@'){
                index=i;
                break;
            }
        }
        //System.out.println("index:"+index);
        //----------------checking if the user name is valid------------------------------
        for(int i=0;i<index;i++){
            if(Character.isLowerCase(arr[i])||arr[i]=='.' || arr[i]=='_'||Character.isDigit(arr[i])){
                continue;
            }
            else{
                x=false;
                break;
            }
        }
        //-----------checking the domain and TLD --------------------------------------------------
        if(x!=false) {
            int index2 = 0;
            int count = 0;
            //------------finding the index of . -------------------------------------
            for (int i = index + 1; i < email.length(); i++) {
                if (arr[i] == '.') {
                    index2 = i;
                    break;
                }
            }
            //System.out.println("index2:"+index2);
            //-----------------checking if the domain name is lower------------------
            for(int i=index+1;i<index2;i++){
                if(Character.isLowerCase(arr[i])){
                    continue;
                }
                else{
                    x=false;
                    break;
                }
            }
            //---------------checking if the TLD is between 2 and 6--------------
            int tld=email.length()-(index2+1);
            //System.out.println(tld);
            if(tld>=2 && tld<=6) {
                for (int i = index2 + 1; i < email.length(); i++) {
                    if (Character.isLowerCase(arr[i])) {
                        continue;
                    } else {
                        x = false;
                        break;
                    }
                }
            }
            else{
                x=false;
            }
        }
        return x;
    }
}
