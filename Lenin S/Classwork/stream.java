import java.sql.SQLOutput;

public class stream {

    public static void main(String[] args)
    {

        String str1 = "Hi Hello Welcome, to String in";
        String str2 = "java";
        String str3 = "JAVA";

        System.out.println(str2.charAt(3));  //index - to get particular character
        System.out.println(str1.concat(str2));  //concatenation...
        System.out.println(str1.length());
        System.out.println(str2.equals(str3));  //content same or not
        System.out.println(str2.equalsIgnoreCase(str3)); //ignore - equals condition
        System.out.println(str2.endsWith("a"));    //the given string ends with a or not
        String arr[] = str1.split("/");  // split based on the space... give the specific character it won't print it...
        for(String s:arr)  //we can iterate and also print...
            System.out.println(s);





    }
}
