class Booking_Ticket 
{ 

void booking(String movie,String time,int seats)
{ 
System.out.println(seats+" seats booked for the movie "+movie+" at "+time);
System.out.println("--------------------------------------------------------------------");

}

void booking(String movie,String time,int seats,char row) 
{
System.out.println(seats+" seats booked for the movie "+movie+" at "+time+" in the row "+row); 
System.out.println("--------------------------------------------------------------------");
} 

void booking(String movie,String time,int seats,char row,String...prefood)
{
  System.out.println(seats+" seats booked for the movie "+movie+" at "+time+" in the row "+row+" with pre-ordered food of ");
  for(String i:prefood) 
  { 
  System.out.print(i+" ");
  }
}

} 

class Movie_Ticket 
{ 
public static void main(String[]args) 
{ 

System.out.println("WELCOME TO XYZ MOVIE THEATRE\n");
System.out.println("List Of Movies available today: 1.AB at 10:00 am 2.ABC at 12:40pm 3.ABC at 4:00pm 4.ZZ at 10:50pm\n");
System.out.println("SEATS AVAILABLE FOR ALL MOVIES (A-D) rows and (1-10)seats in each row\n"); 
System.out.println("PRE-ORDERED Food Available- POPCORN,FRIES,COLD COFFEE,PUFFS\n");

Booking_Ticket object=new Booking_Ticket();

object.booking("AB","10:00am",4);
object.booking("ZZ","10:50pm",3,'C');
object.booking("ABC","12:40pm",5,'A',"3 PUFFS","2 POPCORN","1 COKE");

}

}