// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Map<String, String> telephone = new TreeMap<>();
        telephone.put("Varr", "6383266501");
        telephone.put("Sneha", "9876543254");
        telephone.put("Ragzz", "7654328796");
        telephone.put("Sudha", "3421567890");
        telephone.put("Hari", "123456790");
        telephone.putIfAbsent("Sneha", "6573425679");
        //telephone.put("Sneha", "6573425679");

        for(String key:telephone.keySet())
        {
            System.out.println(key + " " + telephone.get(key));
        }

        System.out.println(telephone.get("Sneha"));
        System.out.println(telephone.keySet());
        System.out.println(telephone.values());
        System.out.println(telephone.entrySet());
    }

}