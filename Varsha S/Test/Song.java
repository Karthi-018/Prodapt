import java.util.*;
import java.text.*;
import java.io.*;

class Song implements Serializable 
{
    private String title;
    private String genre;
    private Date duration; 
    private Double rating;

public Song() //default constructor
{

}

public Song(String title, String genre, Date duration, Double rating) //parameterized constructor
{
    this.title = title;
    this.genre = genre;
    this.duration = duration;
    this.rating = rating;
}

//getter and setter method for title

public void settitle(String title)
{
    this.title = title;
}

public String gettitle()
{
    return title;
}

//getter and setter method for genre

public void setgenre(String genre)
{
    this.genre = genre;
}

public String getgenre()
{
    return genre;
}

//getter and setter method for duration

public void setduration(Date duration)
{
    this.duration = duration;
}

public Date getduration()
{
    return duration;
}

//getter and setter method for rating

public void setrating(Double rating)
{
    this.rating = rating;
}

public Double getrating()
{
    return rating;
}


static Song createSong(String details) throws Exception
{
    String[] s = details.split(",");
    String title = s[0];
    String genre = s[1];
    DateFormat df = new SimpleDateFormat("mm:ss");
    Date d=df.parse(s[2]);
    Double rating = Double.parseDouble(s[3]);
    return new Song(title, genre, d, rating);
}
 
public String toString()
{
return "\nTitle: "+title+"\t Genre: "+genre+"\t Duration: "+duration+"\t Rating:"+rating; 
}

}
