import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Telephone> tele = new ArrayList<Telephone>();
        tele.add(new Telephone("ABC","983456778"));
        tele.add(new Telephone("CDE","983467899"));
        tele.add(new Telephone("EFG","913245488"));
        tele.add(new Telephone("IJK","864567438"));
        tele.add(new Telephone("LMN","768839949"));

        System.out.println("Enter Name");
        String nameS = sc.next();;


        Iterator<Telephone> i = tele.iterator();
        while(i.hasNext())
        {
            Telephone t = i.next();

            if(t.getName().equals(nameS))
            {
                System.out.println(t.getPhn());

            }
        }



    }
}