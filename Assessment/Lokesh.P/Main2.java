import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main2 {
    static Scanner sc = new Scanner(System.in);
    static CollegeBO colbo = new CollegeBO();

    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {
        int choice;
        do {
            System.out.println("Enter your choice");
            System.out.println("\n1.Create College Details \n2.search collegelist based on name \n3.search collegelist by startingdate \n4.search collegelist by location \n5.Exit");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter the String: ");
                    String college_details = sc.next();
                    String[] s = college_details.split(",");
                    int noofdept=Integer.parseInt(s[4]);
                    DateFormat df = new SimpleDateFormat("mm:ss");
                    Date d = df.parse(s[6]);
                    College c = new College(s[0], s[1], s[2], s[3], noofdept, s[5], d);
                    colbo.createCollege(c);
                    break;
                case 2:
                    System.out.println("Enter the name to find college details:");
                    String name = sc.next();
                    colbo.findCollege(name);
                    break;
                case 3:
                    System.out.println("Enter date to find college Details");
                    String date = sc.next();
                    colbo.findCollege(date);
                    break;
                case 4:
                    System.out.println("Enter location to find college_details:");
                    String location=sc.next();
                    colbo.findCollege(location);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
            }

        }while (choice!=5);
    }
}
