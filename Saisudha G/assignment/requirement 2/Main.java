import java.util.Scanner;

class Main {

    static boolean validateEmail(String email) {
        if(!alpha_lower(email.charAt(0))){
            return false;

        }
        String[] val=email.split("[@.]"); //splitting the mail id using @ and .
        if (val.length!=3){
            return false;
        }
        //email="username@domain.tld"
        String username=val[0];
        String domain=val[1];
        String tld=val[2];


        for(int i=0;i<username.length();i++){
            char c=username.charAt(i);
            if(!(alpha_lower(c) || numeric(c) || c=='.' || c=='_')){
                return false;
            }
            if(c=='@'){
                return true;
            }

        }

        for (int i=0;i<domain.length();i++){
            char c=domain.charAt(i);
            if(!(alpha_lower(c))){
                return false;
            }
            if(c=='.'){
                return true;
            }

        }

        for (int i=0;i<tld.length();i++){
            char c=tld.charAt(i);
            if(!(alpha_lower(c))){
                return false;
            }
            if(!(tld.length()>=2 && tld.length()<=6)){
                return false;
            }

        }
        return true;
    }



    static boolean alpha_lower(char c){ //method to check lowercase alphabet
        return (c>='a' && c<='z');
    }
    static boolean numeric(char c){ // method to check number
        return (c<=0 && c>=9);
    }
}
