import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapDemo
{
    public static void main(String[] args)
    {
        Map<String,String> phoneBook=new HashMap<String,String>();

        phoneBook.put("AAA","111111");
        phoneBook.put("BBB","222222");
        phoneBook.put("CCC","333333");
        phoneBook.put("DDD","444444");
        phoneBook.putIfAbsent("DDD","7777");

        System.out.println(phoneBook.values());      //will get value o/p -> k=v
        System.out.println(phoneBook.entrySet());    //both key and value
        System.out.println(phoneBook.get("AAA"));    //particular value
        System.out.println(phoneBook.keySet());      //only key

//--------------------------------------------------------------------------------------------------
        Map<String,String> phoneBook1=new TreeMap<String,String>();
        phoneBook1.put("AAA","111111");
        phoneBook1.put("BBB","222222");
        phoneBook1.put("CCC","333333");
        phoneBook1.put("DDD","444444");

        System.out.println(phoneBook1.values());    //will get value o/p -> k=v
        System.out.println(phoneBook1.entrySet());  //both key and value
        System.out.println(phoneBook1.get("AAA"));    //particular value
        System.out.println(phoneBook1.keySet());

 //-------------------------------------------------------------------------------------------

        Map<String,Long> phoneBook2=new LinkedHashMap<String,Long>();

        phoneBook2.put("AAA",11111l);
        phoneBook2.put("BBB",222222l);
        phoneBook2.put("CCC",333333l);
        phoneBook2.put("DDD",444444l);

        System.out.println(phoneBook2.values());           //will get value o/p -> k=v
        System.out.println(phoneBook2.entrySet());         //both key and value
        System.out.println(phoneBook2.get("AAA"));         //particular value
        System.out.println(phoneBook2.keySet());

        for(String key:phoneBook2.keySet())                             //To print one by one
        {
            System.out.println(key+" "+phoneBook2.get(key));
        }
    }



}