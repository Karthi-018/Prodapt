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
        System.out.println("Enter the choice");

        System.out.println("1.createRecor \n 2.findbytype \n 3.findbyprice");
        int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter How many Numbers to add in List");
                    int num= sc.nextInt();
                    for(int i=0;i<num;i++) {
                        createRecord();
                    }
                    System.out.println("Adding each item in list...");
                    i.bulkCopy(itemList);
                    break;
                case 2:
                    System.out.println("Enter type of item to find");
                    String type = sc.next();
                    i.findItem(type);
                    break;
                case 3:
                    System.out.println("Enter price of item to find");
                    Double price = sc.nextDouble();
                    i.findItem(price);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

    }
}









