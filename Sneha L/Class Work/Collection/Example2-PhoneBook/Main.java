import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     ArrayList<TelePhone> telePhone = new ArrayList<>();
//        HashSet<TelePhone> telePhone = new HashSet<>();
//        System.out.println("Enter Name"+"    "+"Enter Telephone");
//        TelePhone t=new TelePhone("Raghavi","12345678");
//        telePhone.add(t);
        Scanner sc = new Scanner(System.in);
//        for(int i=0;i<5;i++)
//        {
        telePhone.add(new TelePhone("Sneha", "829721287"));
        telePhone.add(new TelePhone("Shalini", "8297235787"));
        telePhone.add(new TelePhone("Hari", "82972132672"));
        telePhone.add(new TelePhone("Sudha", "8297217932"));


//        }
//        telePhone.forEach(System.out::println);


        String foundNum = sc.next();
        /*for (TelePhone i : telePhone) {

            if (i.getTname().equals(foundNum)) {
                System.out.println("Phone number:" + i.getTnum());
                break;
            } else {
                System.out.println("Details is not found in database");
            }
        }*/
       Iterator<TelePhone> i = telePhone.iterator();
        while(i.hasNext()) {
            TelePhone t = i.next();
            if (t.getTname().equals(foundNum)) {
                System.out.println("Phone Number"+t.getTnum());
            }
        }
    }
}
