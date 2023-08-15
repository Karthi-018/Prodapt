public class mail {
    public static boolean validateEmail(String email) {
        int tldLength = 0;
        //RULE-1
        if (Character.isLowerCase(email.charAt(0))) {
            return true;
        }
        //RULE-2
        if ((email.contains(".") && email.contains("_"))) {
            return true;
        }
        //RULE-3
        if (email.contains("@") && tldLength >= 2 && tldLength <= 6) {
            return true;
        }
        return false;
    }
    }
