package feature;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static List<College> sortByName(List<College> colleges){
		Collections.sort(colleges, (o1,o2) -> (o1.getName().compareTo(o2.getName())<0)? -1 : (o1.getName().compareTo(o2.getName())>0)? 1:0);
		return colleges;
	}
	
	public static List<College> sortByDate(List<College> colleges){
		Collections.sort(colleges, (o1,o2) -> (o1.getStartingDate().compareTo(o2.getStartingDate())<0)? -1 : (o1.getStartingDate().compareTo(o2.getStartingDate())>0)? 1:0);
		return colleges;
	}
	
	public static List<College> sortByNoOfDept(List<College> colleges){
		Collections.sort(colleges, (o1,o2) -> (o1.getNumberOfDept()<o2.getNumberOfDept())? -1 : (o1.getNumberOfDept()<o2.getNumberOfDept())? 1:0);
		return colleges;
	}
	public static void display(List<College> colleges) {
		for(College c : colleges) {
			System.out.println(c);
		}
	}
	

	public static void main(String[] args) throws ParseException {
		List<College> colleges = new ArrayList<College>();
		boolean loopCondition = true;
		System.out.println("Enter number of colleges");
		Scanner sc = new Scanner(System.in);
		int noOfColleges = sc.nextInt();
		for(int i=0;i<noOfColleges;i++) {
			System.out.println("Enter details of college "+(i+1)+":");
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter website");
			String website = sc.next();
			System.out.println("Enter mobile");
			String mobile = sc.next();
			System.out.println("Enter founder");
			String founder = sc.next();
			System.out.println("Enter Number of dept");
			int noOfDept = sc.nextInt();
			System.out.println("Entaer Location");
			String location = sc.next();
			System.out.println("Enter Starting Date:");
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
			String dateInString = sc.next();
			Date startingDate = formatter.parse(dateInString);
			College c = new College(name,website,mobile,founder,noOfDept,location,startingDate);
			colleges.add(c);
		}
		System.out.println("Colleges list");
		display(colleges);
		System.out.println("Enter 1 to sort by name");
		System.out.println("Enter 2 to sort by Date");
		System.out.println("Enter 3 to sort by Number of Departments");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				colleges = sortByName(colleges);
				System.out.println("After sorting by name");
				display(colleges);
				break;
			case 2: 
				colleges = sortByDate(colleges);
				System.out.println("After sorting by dates");
				display(colleges);
				break;
			case 3:
				colleges = sortByNoOfDept(colleges);
				System.out.println("After sorting by no of depts");
				display(colleges);
				break;
			default:
				System.out.println("Invalid option");
				break;
		}
		
		

	}

}
