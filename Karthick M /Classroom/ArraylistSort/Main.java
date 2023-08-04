import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Employ> al=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name,id,sal");
            al.add(new Employ(s.next(),s.nextInt(),s.nextInt()));
        }
        System.out.println("1.Sort by Id\n2.sort by name");
        int ch=s.nextInt();
        switch (ch){
            case 1:
                al.sort(new Comparator<Employ>() {
                    @Override
                    public int compare(Employ employ, Employ t1) {
                        if (employ.getId()> t1.getId())return 1;
                        else if (employ.getId()< t1.getId()) {
                            return -1;
                        }
                        else
                        return 0;
                    }
                });
                al.forEach((n)->System.out.println(n));



                break;
            case 2:
                al.sort(new Comparator<Employ>() {
                    @Override
                    public int compare(Employ employ, Employ t1) {
                        return employ.getName().compareTo(t1.getName());
                    }
                });
                al.forEach((n)->System.out.println(n));
        }
    }
}