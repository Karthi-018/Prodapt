import java.util.*;
import java.io.*;
import java.util.Date;
import java.text.*;

class Song implements Serializable
{
	private String title;
	private String genre;
	private Date duration;
	private double rating;

public Song(){
}

public Song(String title,String genre,Date duration,double rating)
{
	this.title=title;
	this.genre=genre;
	this.duration=duration;
	this.rating=rating;
}

public String getTitle()
{
	 return title;
}
public void setTitle(String title)
{
	this.title=title;
}
public String getGenre()
{
	 return genre ;
}
public void setGenre(String genre)
{
	this.genre=genre;
}
public Date getDuration()
{
	 return duration;
}
public void setDuration(Date duration)
{
	this.duration=duration;
}
public double getRating()
{
	 return rating;
}
public void setRating(double rating)
{
	this.rating=rating;
}

static Song createSong(String line) throws Exception
{
String[] songdetails=line.split(",");
DateFormat df=new SimpleDateFormat("mm:ss");
Date date = df.parse(songdetails[2]);
return new Song(songdetails[0],songdetails[1],date,Double.valueOf(songdetails[3]));
//return new Song(title,genre,duration,rating);
}

public String toString()
 {
        return "Song{" + "title='" + title + '\'' + ", genre='" + genre + '\'' + ", duration='" + duration + '\'' + ", rating='" + rating + '\'' +'}';
 }

}



