package demo;
import sun.awt.geom.AreaOp;

import java.util.*;

public class phoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> phoneBook=new TreeMap<>();

        phoneBook.put("AAA","1626367388449");
        phoneBook.put("BBB","28388345939");
        phoneBook.put("DDD","33838838339");
        phoneBook.put("CCC","98929827272");
        phoneBook.put("EEE","29298288222");
        phoneBook.put("FFF","8278272625");
        phoneBook.remove("FFF");
        System.out.println( "Enter your choice:");
        String s = scanner.next();
        System.out.println(phoneBook.keySet());
        System.out.println(phoneBook.entrySet());
        System.out.println(phoneBook.get(s));
        for(String key:phoneBook.keySet())
        {
            System.out.println(key+" "+phoneBook.get(key));
        }

   }


}
