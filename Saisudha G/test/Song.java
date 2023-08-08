import java.util.*;
import java.text.*;
import java.io.*;

class Song implements Serializable{
	


	private String title;
	private String genre;
	private Date duration;
	private double rating;

Song(){}

public Song(String title,String genre,Date duration,double rating)
	
	{
	
	this.title=title;
	this.genre=genre;
	this.duration=duration;
	this.rating=rating;
	
	}

public String gettitle()

{
return title;
}
public void settitle(String title)
{
this.title=title;
}

public String getgenre()
{
return genre;
}
public void setgenre(String title)
{
this.genre=genre;
}

public Date getduration()
{
return duration;
}
public void setduration(Date duration)
{
this.duration=duration;
}

public double getrating()
{
return rating;
}
public void setrating(double rating)
{
this.rating=rating;
}


static Song createSong(String details)throws Exception{


String[] ds =details.split(",");
String title=ds[0];
String genre=ds[1];
DateFormat df= new SimpleDateFormat("mm:ss");
Date d=df.parse(ds[2]);
Double rating=Double.parseDouble(ds[3]);
return new Song(title,genre,d,rating);
}

@Override
public String toString(){


return "Song Title:  "+title+"\n genre:  "+genre+"\n duration:  "+duration+"\n rating:  "+rating;

}


}








