package phone;
import phone.org.phonebook;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        List<phonebook> phBook=new ArrayList<>();
        phBook.add( new phonebook("AAA", "98756788"));
        phBook.add(new phonebook("DDD","7990318415"));
        phBook.add(new phonebook("CCC","9737190597"));
        phBook.add(new phonebook("BBB","8807485235"));

        System.out.println("Enter your name");
        String Name= s.nextLine();

        phBook.sort(new Comparator<phonebook>()
        {
            @Override
            public int compare(phonebook t2, phonebook t1)
            {
                return t2.getName().compareTo(t1.getName());
            }
        });
        System.out.println(phBook);



        Iterator<phonebook> i =phBook.iterator();
        while(i.hasNext())
        {
            phonebook ph = i.next();                       //className ref =i.hasNext();
            if(ph.getName().equals(Name))                //if(ref.getName().equals(from user);
            {
                System.out.println(ph);

            }
        }

    }
}