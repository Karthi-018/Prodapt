import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class PhoneBook {
    static ArrayList<TelePhone> Phonebook = new ArrayList<>();

    public static void main(String[] args) {
        Phonebook.add(new TelePhone("AAA", "987644578"));
        Phonebook.add(new TelePhone("BBB", "768903457"));
        Phonebook.add(new TelePhone("CCC", "876425576"));

        System.out.println("Telephone Directory");
        for (TelePhone p : Phonebook) {
            System.out.println(p);
        }
        search();

    }
    public static void search() {
        System.out.println("Enter the Name to search:");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.next();

        Iterator<TelePhone> i = Phonebook.iterator();
        while (i.hasNext()) {
            TelePhone p = i.next();
            if (p.getName().equals(searchName)) {
                System.out.println(p.getNumber());
            }
        }
    }
}
