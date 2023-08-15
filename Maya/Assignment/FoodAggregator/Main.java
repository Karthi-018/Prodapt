package FoodAggregator;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;


    public class Main {
        public static void main(String[] args) throws SQLException, ClassNotFoundException {
            List<Item> items = new ArrayList<>();
//            items.add(new Item("Icecream", 70.0, "Desserts"));
//            items.add(new Item("Popcorn", 50.0, "Snacks"));
//            items.add(new Item("Pepsi", 30.75, "Bevarages"));

            ItemDAO itemDAO = new ItemDAO();
            itemDAO.bulkCopy(items);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("1. Search by Type");
                System.out.println("2. Search by Price");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) 
		{
                    case 1:
                        System.out.print("Enter type to search: ");
                        String searchType = scanner.nextLine();
                        List<Item> foundItemsByType = itemDAO.findItem(searchType);
                        if (foundItemsByType.isEmpty())
                        {
                            System.out.println("No such item is present.");
                        } 
			else
                        {
                            System.out.format("%-20s %-55s %s\n", "Name", "Price", "Type");
                            for (Item item : foundItemsByType)
                            {
                                System.out.format("%-20s %-55s %s\n", item.getName(), item.getPrice(), item.getType());
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Enter price to search: ");
                        double searchPrice = scanner.nextDouble();
                        List<Item> foundItemsByPrice = itemDAO.findItem(searchPrice);

                        if (foundItemsByPrice.isEmpty())
                        {
                            System.out.println("No such item is present.");
                        }
                        else
                        {
                            System.out.format("%-20s %-55s %s\n", "Name", "Price", "Type");
                            for (Item item : foundItemsByPrice)
                            {
                                System.out.format("%-20s %-55s %s\n", item.getName(), item.getPrice(), item.getType());
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }

    /*
    mysql:
create database item;
use item;
Create table items(
name varchar(50),
price double,
type varchar(50)
);
select * from items;
*/