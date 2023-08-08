import java.util.*;
import java.text.*;
class Song
{
private String title;
private String genre;
private Date duration;
private Double rating;
public Song(){
}

Song(String title,String genre,Date duration,Double rating)
{
this.title=title;
this.genre=genre;
this.duration=duration;
this.rating=rating;
}

public void settitle(String title)
{
this.title=title;
}
public String gettitle()
{
return title;
}
public void setgenre(String genre)
{
this.genre=genre;
}
public String getgenre()
{
return genre;
}
public void setduration(Date duration)
{
this.duration=duration;
}
public Date getduration()
{
return duration;
}
public void setrating(Double rating)
{
this.rating=rating;
}
public Double getrating()
{
return rating;
}


public String toString(){
		return "Song +\ntitle : "+title+"\ngenre : "+genre+"\nduration : "+duration+"\nrating : "+rating;
	}


	
public static Song createSong(String line) throws ParseException
{
String s[]=line.split(",");
String title=s[0];
String genre=s[1];
DateFormat df=new SimpleDateFormat("mm:ss");
Date duration =df.parse(s[2]);
Double rating= Double.parseDouble(s[3]);
return  new Song(title,genre,duration,rating);

}

}




