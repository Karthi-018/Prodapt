package org.example;
import java.util.*;

public class MainTelephone
{
    public static void gettingArray()
    {
        Scanner s = new Scanner(System.in);
        List<Telephone> l = new ArrayList<>();
        l.add(new Telephone(98665,"AAA"));
        l.add(new Telephone(65456,"BBB"));
        l.add(new Telephone(75645,"CCC"));
        String Name=s.next();
        Iterator<Telephone> i= l.iterator();
        while(i.hasNext())
        {
            Telephone ph = i.next();
            if(ph.getName().equals(Name)){
                System.out.println(ph.getPhno());
                return;
            }
        }
        System.out.println("Telephone not found");
    }

    public static void main(String[] a)
    {
        gettingArray();
    }
}
