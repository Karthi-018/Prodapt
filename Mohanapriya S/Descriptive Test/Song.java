import java.util.*;
import java.text.*;
import java.io.*;
class Song extends Exception
{
private String title;
private String genre;
private Date duration;
private double rating;
Song()
{
}

public Song(String etitle, String egenre , Date eduration , double erating) 
{
title=etitle;
genre=egenre;
duration=eduration;
rating=erating;
}

public void settitle(String etitle)
{
title=etitle;
}
public String gettitle()
{
return title;
} 

public void setgenre(String egenre)
{
genre=egenre;
}
public String getgenre()
{
return genre;
}

public void setduration(Date eduration)
{
duration=eduration;
}
public Date getduration()
{
return duration;
}

public void setrating(double erating)
{
rating=erating;
}
public double getrating()
{
return rating;
}

public String toString()
{
return title+" "+genre+" "+duration+" "+rating;
}

static Song createSong(String line) throws Exception 
{
String[]details=new String[3];
details=line.split(",");
String title=details[0];
String genre=details[1];
DateFormat df=new SimpleDateFormat("mm:ss");
Date d=df.parse(details[2]);
//String duration=details[2];
Double rating=Double.parseDouble(details[3]);
return new Song(title,genre,d,rating);
}
}



 