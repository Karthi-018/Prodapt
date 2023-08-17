package a;
import java.util.*;

import java.sql.*;
public class Main {
	public static void main(String[] args) {
		College college=new College();
		CollegeBO collegebo=new CollegeBO();
		Scanner s=new Scanner(System.in);
		List<College> list=new ArrayList<>();
		int ch;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			do {
				System.out.print("Enter choice:");
				ch=s.nextInt();
				switch(ch){
				case 1:
					collegebo.add(list);
					break;
				case 2:
					System.out.print("Enter location to search");
					String loc=s.next();
					collegebo.findCollege(loc);
					break;
				case 3:
					Collections.sort(list, (l1, l2) -> l1.getName().compareTo(l2.getName()));
                    for (College i : list) {
                        System.out.println(i);
                    }
                    break;
				}
				
			}while (ch<5);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
