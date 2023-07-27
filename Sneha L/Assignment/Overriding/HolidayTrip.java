import java.util.*;
abstract class HolidayPlan{
	int days;
	String destination;
	String tripactivities;
	abstract void plans();
}
class RelaxationTrip extends HolidayPlan{
	void plans(){
	System.out.println("Relaxation in "+destination+" for: "+days+" days");
	System.out.println("Activities:"+tripactivities);
	}
}
class AdventureTrip extends HolidayPlan{
	void plans(){
	System.out.println("Adventure Trip in "+destination+" for: "+days+" days");
	System.out.println("Activities:"+tripactivities);
	}
}
public class HolidayTrip{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		RelaxationTrip trip1=new RelaxationTrip();
		trip1.days=sc.nextInt();
		sc.nextLine();
		trip1.destination=sc.nextLine();
		trip1.tripactivities=sc.nextLine();
		trip1.plans();
		AdventureTrip trip2=new AdventureTrip();
		trip2.days=sc.nextInt();
		sc.nextLine();
		trip2.destination=sc.nextLine();
		
		trip2.tripactivities=sc.nextLine();
		trip2.plans();
		
	}
}
	
