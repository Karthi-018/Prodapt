import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    {
        public static void main(String[] args) throws Exception {
        List<College> clg = new ArrayList<>();
        clg.add(College.createCollege(""));


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Sort by Name");
            System.out.println("2. Sort by Date");
            System.out.println("3. Sort by location");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    clg.sort(Comparator.comparing(College::getName));
                    for (College cl : clg) {
                        System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", cl.getName(), cl.getWebsite(), cl.getMobile(), cl.getFounder(), cl.getNumberofDept(), cl.getLocation(), cl.getStartingDate());
                    }
                    break;
                }
                case 2: {
                    clg.sort(Comparator.comparing(College::getStartingDate));
                    for (College cl : clg) {
                        System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", cl.getName(), cl.getWebsite(), cl.getMobile(), cl.getFounder(), cl.getNumberofDept(), cl.getLocation(), cl.getStartingDate());
                    }
                    break;
                }
                default:
                    System.out.println("Invalid choice!");
            }
        }

    }}}
