package org.example;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main1 {
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
                o.addItem(new Items());
                break;
            case 2:
                ItemDAO d=new ItemDAO();
                List<Items> itemList=new ArrayList<>();
                itemList.add(new Items());
                d.bulkCopy(itemList);
                break;
            case 3:
                ItemDAO d1=new ItemDAO();
                System.out.println("Enter type");
                String searchbytype=sc.next();

                itemList = d1.findItem(searchbytype);
                //System.out.format("%-20s %-5s %s\n","Name","Price","Type");
                for(Items i:itemList) {
                    System.out.format("%-20s %-5s %s\n",i.getName() +","+i.getPrice()+","+i.getType());
                }

                break;

            case 4:
                ItemDAO t=new ItemDAO();
                System.out.println("Enter price");
                double searchbyprice= sc.nextDouble();
                itemList=t.findItem(searchbyprice);
                //System.out.format("%-20s %-5s %s\n","Name","Price","Type");
                for(Items i:itemList) {
                    System.out.format("%-20s %-5s %s\n",i.getName() +","+i.getPrice()+","+i.getType());
                }

                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
