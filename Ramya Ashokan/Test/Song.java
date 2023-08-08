import java.util.*;
import java.text.*;
import java.io.*;
class Song implements Serializable
{
private String title;
private String genere;
private Date duration;
private Double rating;
Song(){}

Song(String title,String genere,Date duration,Double rating)
{
 this.title=title;
 this.genere=genere;
 this.duration=duration;
 this.rating=rating;
}

public void setTitle(String title)
{
 this.title=title;
}
public String getTitle()
{
 return title;
}

public void setGenere(String genere)
{
 this.genere=genere;
}
public String getGenere()
{
 return genere;
}

public void setDuration(Date duration)
{
 this.duration=duration;
}
public Date getDuration()
{
 return duration;
}
public void setRating(Double rating)
{
 this.rating=rating;
}
public double getRating()
{
 return rating;
}
public  static Song createSong(String line) throws Exception
{

String sarr[]=line.split(",");



String t=sarr[0];
String g=sarr[1];
SimpleDateFormat df=new SimpleDateFormat("mm:ss");
Date d=df.parse(sarr[2]);
double rate=Double.parseDouble(sarr[3]);

return new Song(t,g,d,rate);
}
public String toString()
{
 return "Song{" + "title='" + title + '\'' + ", genere='" + genere + '\'' + ", duration='" + duration + '\'' + ", rating='" + rating + '\'' +'}';
}}