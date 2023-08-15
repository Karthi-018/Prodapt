import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    static Scanner sc = new Scanner(System.in);
    static List<Item> itemList = new ArrayList<>();

    public static void createRecord() throws SQLException, ClassNotFoundException {

        System.out.println("Enter Item Name:");
        String name = sc.next();
        System.out.println("Enter Item Price:");
        Double price = sc.nextDouble();
        System.out.println("Enter Item Type:");
        String type = sc.next();
        itemList.add(new Item(name, price, type));

    }

    static ItemDAO i = new ItemDAO();

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        int choice;
        do {
            System.out.println("Enter the choice");
            System.out.println("1. Add item \n2. To Add many item \n3.Find item based on type \n4.Find item based on price");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the String: ");
                    String food_item = sc.next();
                    String[] s = food_item.split(",");
                    Double cost = new Double(s[1]);
                    Item items = new Item(s[0],cost,s[2]);
                    i.addItem(items);
                    break;
                case 2:
                    System.out.print("\nNumber of list to added: ");
                    int bulk = Integer.parseInt(sc.next());
                    List<Item> itemList = new ArrayList<Item>();
                    for(int i=0;i<bulk;i++)
                    {
                        System.out.print("Enter the String"+i+" : ");
                        food_item = sc.next();
                        String[] s1 = food_item.split(",");
                        cost = new Double(s1[1]);
                        itemList.add(new Item(s1[0],cost,s1[2]));

                    }
                    i.bulkCopy(itemList);
                    break;
                case 3:
                    System.out.println("Enter the item type:");
                    String type=sc.next();
                    i.findItem(type);
                    break;
                case 4:
                    System.out.println("Enter price of item to find");
                    Double price = sc.nextDouble();
                    i.findItem(price);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
        while(choice!=5);

    }
}









