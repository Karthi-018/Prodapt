package org.example;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<telephone> t = new ArrayList<>();
        t.add(new telephone("malini", 987672341));
        t.add(new telephone("divya", 987672342));
        t.add(new telephone("abi", 977672341));
        t.add(new telephone("abi",984367239));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur choice:");
        String choice = sc.next();
        int x=0;
        for(int i=0;i<t.size();i++) {
            if (t.get(i).getName().equals(choice)) {
                System.out.println(t.get(i).getNumber());
                x= 1;
            }
        }
        if (x==0){
            System.out.println("name not found");
        }
        //Iterator i = t.iterator();
        //int flag=0;
//        while (i.hasNext()) {
//            telephone tp = (telephone) i.next();
//            if (tp.getName().equals(choice)) {
//                System.out.println(tp.getNumber());
//                flag=1;
//            }
//            }
//        if(flag==0) {
//            System.out.println("name not exist");
//        }

    }
}