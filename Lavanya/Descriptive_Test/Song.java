import java.text.*;
import java.util.*;
import java.io.*;

public class Song implements Serializable
{
    private String title;
    private String genre;
    private Date duration;
    private Double rating;
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }
    public Date getDuration(){
        return duration;
    }
    public void setDuration(Date duration){
        this.duration=duration;
    }
    public Double getRating(){
        return rating;
    }
    public void setRating(Double rating){
        this.rating=rating;
    }

    public Song(){
    }
    public Song(String title,String genre,Date duration,Double rating){
        this.title=title;
        this.genre=genre;
        this.duration=duration;
        this.rating=rating;
    }
    public String toString(){
        return "title name : "+title+"\ngenre : "+genre+"\nduration : "+duration+"\nrating : "+rating;

    }
    static Song createSong(String line) throws Exception{
        String [] separate =line.split(",");
        String t = separate[0];
        String g =separate[1];
        DateFormat df=new SimpleDateFormat("mm:ss");
        Date d=df.parse(separate[2]);
        Double r =Double.parseDouble(separate[3]);
        return  new Song(t,g,d,r);
    }
}