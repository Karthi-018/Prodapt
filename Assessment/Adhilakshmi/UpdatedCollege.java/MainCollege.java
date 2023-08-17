package College;

import java.text.SimpleDateFormat;
import java.util.*;

public class MainCollege {
public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
CollegeBO b = new CollegeBO();

while (true) {
System.out.println("Options\n 1.College Details Based on Name\n 2.College Details Based on StartingDate\n 3.College Details Based on Location\n 4.Sort the Data to College");
int choice = sc.nextInt();
switch (choice) {
case 1:
          List college = new ArrayList<>();
          System.out.print("Enter College Name: ");
          String Input = sc.next();
          college.add(Input);
          List<College> l1 = b.findCollege(college);
          l1.sort(Comparator.comparing(College::getName));
          printCollegeList(l1);
     System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %-20s\n","Name","Website","Mobile","Founder","NumberOfDept","location","StartingDate");
     System.out.println("-----------------------------------");
     for (College clg : l1) {
             System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %-20s\n",
             clg.getName(), clg.getWebsite(), clg.getMobile(),
             clg.getFounder(), clg.getNumberOfDept(), clg.getLocation(), clg.getStartingDate());
     }
break;
case 2:
        System.out.print("Enter the StartingDate (dd-mm-yyyy): ");
        String Input2 = sc.next();
        java.util.Date d = new SimpleDateFormat("dd-MM-yyyy").parse(Input2);
        List<College> l2 = b.findCollege(new java.sql.Date(d.getTime()));
        l2.sort(Comparator.comparing(College::getStartingDate));
        printCollegeList(l2);
        for (College clg : l2) {
                  System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",
                  clg.getName(), clg.getWebsite(), clg.getMobile(),
                  clg.getFounder(), clg.getNumberOfDept(), clg.getLocation(), clg.getStartingDate());
    }
break;
case 3:
             System.out.print("Enter the Location: ");
             String Input3 = sc.next();
             List<College> l3 = b.findCollege(Input3);
             l3.sort(Comparator.comparing(College::getLocation));
             printCollegeList(l3);
             for (College clg : l3) {
                      System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",
                      clg.getName(), clg.getWebsite(), clg.getMobile(),
                      clg.getFounder(), clg.getNumberOfDept(), clg.getLocation(), clg.getStartingDate());
         }
break;
case 4:
            System.out.println("CREATE THE DATA\nEnter the details (name,website, etc.):");
            Scanner sc1 = new Scanner(System.in);
            String input4 = sc1.nextLine();
            String arr1[] = input4.split(",");
            java.util.Date d1 = new SimpleDateFormat("dd-MM-yyyy").parse(arr1[6]);
            College l4 = new College(arr1[0], arr1[1], arr1[2], arr1[3], Integer.parseInt(arr1[4]), arr1[5], d1);
            b.create(l4);

break;
default:
System.out.println("Invalid option.");
break;
}
}
}

private static void printCollegeList(List<College> colleges) {
for (College s : colleges) {
System.out.println(s);
}
}
}
