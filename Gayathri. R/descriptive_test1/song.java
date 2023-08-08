import java.util.*;
import java.text.*;
class song 
{
	private double rating;
	private String title;
	private Date duration;
	private String genre;
song()
{
	this.rating=rating;
	this.title=title;
	this.duration=duration;
	this.genre=genre;
}
public song(String title,String genre,Date duration,Double rating)
{
	this.rating=rating;
	this.title=title;
	this.duration=duration;
	this.genre=genre;
}
void settitle(String title)
{
	this.title=title;
}
String gettitle()
{
	return title;
}
void setgenre(String genre)
{
	this.genre=genre;
}
String getgenre()
{
	return genre;
}
void setduration(Date duration)
{
	this.duration=duration;
}
Date getduration()
{
	return duration;
}
void setrating(double rating)
{
	this.rating=rating;
}
double getrating()
{
	return rating;
}

public String toString()
{
	return title+" "+genre+" "+duration+" "+rating;
}
static song createsong(String line) throws Exception
{
	String[] details=new String[3];
        details=line.split(",");
	String title=details[0];
	String genre=details[1];
	//String duration=details[2];
	DateFormat df=new SimpleDateFormat("MM:SS");
	Date d=df.parse(details[2]);
	Double rating=Double.parseDouble(details[3]);
	return new song(title,genre,d,rating);
	
	
         
	 //System.out.println(o);
	
}
	//System.out.println(obj);
}
        







