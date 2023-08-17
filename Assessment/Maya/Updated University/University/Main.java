package University;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception {
        List<College> collegelist=new ArrayList<>();
        collegelist.add(College.createCollege("RIT,rit.com,12345678,hgf,3,Chennai,15:08:01"));
        collegelist.add(College.createCollege("REC,rec.com,9743,sdfg,5,Chennai,20:1:99"));


        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. Sort by Name");
            System.out.println("2. Sort by Date");
            System.out.println("3. Sort by number of departments");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                {
                    collegelist.sort(Comparator.comparing(College::getName));
                    for(College clg:collegelist)
                    {
                        System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", clg.getName(), clg.getWebsite(),clg.getMobile(),clg.getFounder(),clg.getNumberofDept(),clg.getLocation(),clg.getStartingDate());
                    }
                    break;
                } 
                case 2:
                {
                    collegelist.sort(Comparator.comparing(College::getStartingDate));
                    for(College clg:collegelist)
                    {
                        System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", clg.getName(), clg.getWebsite(),clg.getMobile(),clg.getFounder(),clg.getNumberofDept(),clg.getLocation(),clg.getStartingDate());
                    }
                    break;
                }
                case 3:
                {
                    collegelist.sort(Comparator.comparing(College::getNumberofDept));
                    for(College clg:collegelist)
                    {
                        System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", clg.getName(), clg.getWebsite(),clg.getMobile(),clg.getFounder(),clg.getNumberofDept(),clg.getLocation(),clg.getStartingDate());
                    }
                    break;
                }

                case 4:
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }

    }
}

