import java.util.*;

public class Details {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //by using map we can get phone number
        Map<String,String> map = new HashMap();
        map.put("Lokesh","9800966909");
        map.put("Arun","9580896690");
        map.put("Charan","6970096780");
        map.put("Ram","9780096690");
        System.out.println(map.get("Ram"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        //iteration in map
        for(String key: map.keySet())
        {
            System.out.println(key+" "+map.get(key));
        }
        //by using list if we call name it will display details
        List<TelephoneBook> l = new ArrayList<>();
        l.add(new TelephoneBook("Lokesh","9800966909"));
        l.add(new TelephoneBook("Arun","9580896690"));
        l.add(new TelephoneBook("Charan","6970096780"));
        l.add(new TelephoneBook("Ram","9780096690"));
        l.add(new TelephoneBook("Nanda","8998966902"));
        l.add(new TelephoneBook("Kishore","9800967801"));
        System.out.println(l);
        String searchName = sc.next();
        Iterator i = l.iterator();
        while(i.hasNext())
        {

            TelephoneBook t = (TelephoneBook) i.next();
            if(t.getName().equals(searchName))
            {
                System.out.println(t);
            }
        }
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                    //sortbyname
                    l.sort(new Comparator<TelephoneBook>() {
                        @Override
                        public int compare(TelephoneBook telephoneBook, TelephoneBook t1) {
                            return telephoneBook.getName().compareTo(t1.getName());
                        }
                    });


        }
        for(TelephoneBook t : l)
        {
            System.out.println(t);
        }
    }



}
