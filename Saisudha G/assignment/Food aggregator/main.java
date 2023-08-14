package edu.prodapt.item;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        System.out.println("1->store items in the database");
        System.out.println("2->Bulkcopy");
        System.out.println("3->search items by type");
        System.out.println("4->search items by price");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                ItemDAO o=new ItemDAO();
                o.addItem(new Item());
                break;
            case 2:
                ItemDAO o1=new ItemDAO();
                List<Item> itemList=new ArrayList<>();
                itemList.add(new Item());
                o1.bulkCopy(itemList);
                break;
            case 3:
                ItemDAO o2=new ItemDAO();
                System.out.println("Enter type");
                String searchbytype=sc.next();

                itemList = o2.findItem(searchbytype);
                System.out.format("%-20s %-5s %s\n","Name","Price","Type");
                for(Item i:itemList) {
                    System.out.format("%-20s %-5s %s\n",i.getName() +","+i.getPrice()+","+i.getType());
                }

                break;

            case 4:
                ItemDAO o3=new ItemDAO();
                System.out.println("Enter price");
                double searchbyprice= sc.nextDouble();
                itemList=o3.findItem(searchbyprice);
                System.out.format("%-20s %-5s %s\n","Name","Price","Type");
                for(Item i:itemList) {
                    System.out.format("%-20s %-5s %s\n",i.getName() +","+i.getPrice()+","+i.getType());
                }

                break;

            default:
                System.out.println("Invalid choice");







        }
    }
}
