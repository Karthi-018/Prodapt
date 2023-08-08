package songs; 

import java.util.*;  
import java.lang.String;
import java.text.*; 
import java.io.*; 

public class Song implements Serializable
{
 
private String title;

private String genre;

private Date duration;

private double rating; 

//Default Constructor
public Song()
{

}

//Parameterized Constructor
public Song(String title,String genre,Date duration,double rating)
{ 

this.title=title;

this.genre=genre;

this.duration=duration;

this.rating=rating;

}

void setTitle(String title) 
{ 
this.title=title;
} 

void setGenre(String genre) 
{ 
this.genre=genre;
} 

void setDuration(Date duration) 
{ 

this.duration=duration;
}

void setRating(double rating) 
{ 
this.rating=rating;
} 

String getTitle() 
{ 
return title;
} 

String getGenre() 
{ 
return genre;
} 

Date getDuration() 
{ 
return duration;
}

double getRating() 
{ 
return rating;
}

//Method to create a song object 
static Song createSong(String input)
{ 

String[] songdetail=input.split(","); 
Song obj=null;

try 
{
  DateFormat df=new SimpleDateFormat("mm:ss");
  Date date=df.parse(songdetail[2]); 
  obj=new Song(songdetail[0],songdetail[1],date,Double.valueOf(songdetail[3]));  
}
catch(ParseException e) 
{ 

System.out.print(e);

} 
 return obj;  

}

public String toString()
{ 
return "Song Title: "+title+" Song Genre: "+genre+" Song Duration: "+duration+" Song Rating: "+rating+"\n";
}

}