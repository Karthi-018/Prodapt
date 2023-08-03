package org.example;
import java.util.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Mainmap {
    public static void main(String[] args)
    {
        Map<String,String> map = new HashMap<>();
        map.put("Alia","1234567890");
        map.put("Kiara","1234567891");
        map.put("Ananya","1234567830");
        map.put("sara","1234567893");
        map.put("Khushi","1234567870");
        /*System.out.println(map.keySet());
        System.out.println(map);
        System.out.println(map.values());
        map.remove("Alia");
        System.out.println(map.get("Alia"));
        */
        System.out.println("Enter the name to get phone number : ");
        Scanner sc = new Scanner(System.in);
        String uname = sc.next();
        /*for(Map.Entry<String,String> entry : map.entrySet())
        {
            if(uname.equals(entry.getKey()))
            {
                System.out.println(entry.getValue());
            }
        }*/
        System.out.println(map.get(uname));
    }
}
