
public class stringMethods {

    public static void main(String[] args)
    {

        String str1 = "Hi Hello Welcome, to String in";
        String str2 = "java";
        String str3 = "JAVA";

        System.out.println(str2.charAt(3));  
        System.out.println(str1.concat(str2)); 
        System.out.println(str1.length());
        System.out.println(str2.equals(str3));  
        System.out.println(str2.equalsIgnoreCase(str3)); 
        System.out.println(str2.endsWith("a"));    
        String arr[] = str1.split("/"); 
        for(String s:arr) 
            System.out.println(s);





    }
}