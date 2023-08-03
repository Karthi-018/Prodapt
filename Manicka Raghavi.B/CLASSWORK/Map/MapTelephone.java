package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTelephone
{
    Map<String,Long > mapList=new HashMap<String,Long>();
    Map<String,Long>  treeMap=new TreeMap<String,Long>();
   void searchHashMapList(String name)
   {   boolean flag=false;
       for(String i:mapList.keySet())
       {
           if(i.equals(name))
           {
               System.out.println("THE TELEPHONE DETAILS ARE:"+mapList.get(i));
               flag=true;
               break;
           }
       }
       if(flag==false)
           System.out.println("DETAILS NOT FOUND");

   }

    void searchTreeMapList(String name)
    {   boolean flag=false;
        for(String i:treeMap.keySet())
        {
            if(i.equals(name))
            {
                System.out.println("THE TELEPHONE DETAILS ARE:"+treeMap.get(i));
                flag=true;
                break;
            }
        }
        if(flag==false)
            System.out.println("DETAILS NOT FOUND");

    }

   void createHashMapList()
   {
       mapList.put("AAA", 1232234567L);
       mapList.put("BBB", 9886768767L);
       mapList.put("CCC", 6532623567L);
       mapList.put("BBB",72873827387L);
       mapList.get("BBB");

   }

   void createTreeMapList()
   {
       treeMap.put("AAA", 1232234567L);
       treeMap.put("BBB", 9886768767L);
       treeMap.put("XYB",456827387L);
       treeMap.put("CCC", 6532623567L);
       treeMap.put("BBB",72873827387L);
       treeMap.putIfAbsent("1",373647L);
   }

   void display()
   {
       //DISPLAYING USING THE MAP METHODS

       System.out.println("ENTRY SET:"+mapList.entrySet());
       System.out.println("KEY SET:"+mapList.keySet());
       System.out.println("MAP LIST SIZE: "+mapList.size());
       System.out.println("MAP LIST VALUES: "+mapList.values());
       mapList.remove("BBB");
       System.out.println("AFTER REMOVING KEY-BBB"+mapList.entrySet());

       System.out.println("TREE MAP -ENTRY SET"+treeMap.entrySet());
       System.out.println("VALUES OF TREE MAP"+treeMap.values());
       System.out.println("KEY VALUES OF TREE MAP"+treeMap.keySet());
       System.out.println(treeMap.remove("CCC"));
       System.out.println("TREE MAP SIZE"+treeMap.size());


   }
    public static void main(String[] args)
    {
     MapTelephone object=new MapTelephone();

     object.createHashMapList();
     object.createTreeMapList();
     object.searchHashMapList("AAA");
     object.searchTreeMapList("BBB");
     object.display();


    }
}
