public class mail {
    public static boolean validateEmail(String email) {
        int tldLength = 0;
        for (char c : email.toCharArray()) {
            //RULE-1
            if (Character.isLowerCase(c)) {
                tldLength++;
            }
            //RULE-2
            if ((email.contains(".") && email.contains("_"))) {
                return true;
            }
            //RULE-3
            if (email.contains("@") && tldLength >= 2 && tldLength <= 6) {
                return true;
            }
        }
        return false;
    }
}
