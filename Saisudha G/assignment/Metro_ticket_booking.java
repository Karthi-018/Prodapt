import java.util.*;
class Metro_ticket_booking{
	String Origin;
	String Destination;
	//int Tickets;
	int fare;
	
public void book(String Origin,String Destination){
	System.out.println("Origin Station:"+Origin);
	
	System.out.println("Destination Station:"+Destination);
	
}
public void book(int Tickets){
System.out.println("no.of Tickets:"+Tickets);

}

public void book(int Tickets,int fare){
	
	fare=Tickets*10;
	System.out.println("fare:"+fare);
	//System.out.println("booking successful");
}
public static void main(String a[]){
	Metro_ticket_booking o=new Metro_ticket_booking();
	o.book("chrompet","Guindy");
	o.book(2);
	o.book(2,20);
	
	
	}}