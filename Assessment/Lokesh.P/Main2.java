import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
                    SimpleDateFormat df=new SimpleDateFormat("dd:mm:yy");
                    Date date=(Date) df.parse(s[6]);
                    College c = new College(s[0], s[1], s[2], s[3], noofdept, s[5], date);
                    colbo.createCollege(c);
                    break;
                case 2:
                    ArrayList<String> l = new ArrayList<>();
                    System.out.println("Enter the name to find college details:");
                    String[] collegeNames = sc.next().split(",");
                    for(String s1 : collegeNames){
                        l.add(s1);
                    }
                    List<College>collegeDetails=colbo.findCollege(l);
                    System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
                    for(College cd:collegeDetails)
                    {
                        System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",cd.getName(),cd.getWebsite(),cd.getMobile(),cd.getFounder(),cd.getNumberOfDept(),cd.getLocation(),cd.getStartingDate());
                    }
                    break;
                case 3:
                    System.out.println("Enter date to find college Details");
                    SimpleDateFormat dfs=new SimpleDateFormat("dd:mm:yy");
                    Date date1=(Date) dfs.parse(sc.next());
                    List<College> college_Details=colbo.findCollege(date1);
                    System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
                    for(College cd:college_Details)
                    {
                        System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",cd.getName(),cd.getWebsite(),cd.getMobile(),cd.getFounder(),cd.getNumberOfDept(),cd.getLocation(),cd.getStartingDate());
                    }
                    break;
                case 4:
                    System.out.println("Enter location to find college_details:");
                    String location=sc.next();
                    List<College> College_details=colbo.findCollege(location);
                    System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
                    for(College cd:College_details)
                    {
                        System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",cd.getName(),cd.getWebsite(),cd.getMobile(),cd.getFounder(),cd.getNumberOfDept(),cd.getLocation(),cd.getStartingDate());
                    };
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
