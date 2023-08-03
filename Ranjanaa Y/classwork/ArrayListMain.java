package org.example;
import java.util.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrayListMain {
    public static void main(String[] args) {

        ArrayList<PojoTelephone> at = new ArrayList<>();

        PojoTelephone t1 = new PojoTelephone("Alia","9003291897");
        PojoTelephone t2 = new PojoTelephone("Aysha","9003291897");
        PojoTelephone t3 = new PojoTelephone("Aira","9003291897");
        PojoTelephone t4 = new PojoTelephone("Aila","9003298979");
        PojoTelephone t5 = new PojoTelephone("Arya","1234567890");

        at.add(t1);
        at.add(t2);
        at.add(t3);
        at.add(t4);
        at.add(t5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to get Phone no: ");
        String uname = sc.next();

        Iterator<PojoTelephone> i = at.iterator();
        while(i.hasNext())
        {
            PojoTelephone t = i.next();
            if(uname.equals(t.getName()))
            {
                System.out.println(t);
            }
        }
    }
}
