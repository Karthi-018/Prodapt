package test4;

import java.util.*;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        College college=new College();

        CollegeBO collegebo=new CollegeBO();

        try (Scanner s = new Scanner(System.in)) {
			List<College> list=new ArrayList<>();
 
			int ch;

			try {

			    Class.forName("com.mysql.cj.jdbc.Driver");

			    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

			    do {

			        System.out.print("");

			        ch=s.nextInt();

			        switch(ch){

			        case 1:

			            collegebo.add(list);

			            break;

			        case 2:

			            System.out.print("Enter location");

			            String loc=s.next();

			            collegebo.findCollege(loc);

			        }

   

			    }while (ch<7);

			}

			catch(Exception e) {

			    System.out.print(e);

			}
		}

    }

}