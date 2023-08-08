import java.util.*;
import java.text.*;
class Song{                   //class creation
    private String title;
    private String genre;
    private Date duration;
    private Double rating;

static Song createSong(String line) throws Exception
{
String details[]=line.split(",");
String title=details[0];
String genre=details[1];
DateFormat df=new SimpleDateFormat("mm:ss");
Date duration=df.parse(details[2]);
Double rating=Double.parseDouble(details[3]);
return new Song(title,genre,duration,rating);
}



public Song(){
}
public Song(String title,String genre,Date duration,Double rating){
       this.title=title;
       this.genre=genre;
       this.duration=duration;
       this.rating=rating;
}

public void settitle(String title){
this.title=title;
}
public String gettitle(){
return title;
}

public void setgenre(String genre){
this.genre=genre;
}
public String getgenre(){
return genre;
}

public void setduration(Date duration){
this.duration=duration;
}
public Date getduration(){
return duration;
}

public void setrating(Date duration){
this.rating=rating;
}
public Double getrating(){
return rating;
}

 public String toString()
{
        return "Song{" + "title='" + title + '\'' + ", genre='" + genre + '\'' + ", duration='" + duration + '\'' + ", rating='" + rating + '\'' +'}';
}

}





