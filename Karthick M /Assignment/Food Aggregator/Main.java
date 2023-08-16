package crud;
import java.sql.*;
import java.util.*;
public class Main {
	public static void main(String a[]) {
	Scanner s=new Scanner(System.in);
	List<Item> itemList=new ArrayList<Item>();
	Item item=new Item();
	ItemDAO dao=new ItemDAO();
	int ch;
	try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food", "root", "root")) {
            do {
            	System.out.println("Enter your choice:");
            	ch=s.nextInt();
            	switch (ch) {
            	case 1:
                	dao.addItem(item);
                	break;
                case 2:
                	dao.bulkCopy(itemList);
                	dao.addItem(item);
                	break;
                case 3:
                	System.out.print("Enter type to search: ");
                    String type = s.next();
                    List<Item> typeItemList = dao.findItem(type);
                    displayItems(typeItemList);
                    break;
                case 4:
                	System.out.print("Enter  price to search: ");
                    double price = s.nextDouble();
                    List<Item> priceItemList = dao.findItem(price);
	                displayItems(priceItemList);
	                break;
                default:
                	System.out.println("Invalid choice");
	               
            }
            }while(ch<5);
    }	
}
	catch (Exception e) {
		System.out.println(e);
	} 
}



public static void displayItems(List<Item> itemList) {
if (!itemList.isEmpty()) {
    System.out.format("%-20s %-5s %s\n", "Name", "Price", "Type");
    for (Item item : itemList) {
       System.out.format("%-20s %-5.1f %s\n", item.getName(), item.getPrice(), item.getType());
    }
} else {
    System.out.println("Not found.");
}
	
}
}
