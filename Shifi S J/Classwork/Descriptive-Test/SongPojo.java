import java.text.*;
import java.text.DateFormat;
import java.util.Scanner;
import java.util.*;
import java.io.*;


class SongPojo implements Serializable {
    private String title;
    private String genre;
    private Date duration;
    private Double rating;

    public SongPojo(String title,String genre,Date duration,Double rating){
        this.title =title;
        this.genre=genre;
        this.duration=duration;
        this.rating=rating;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }

    public void setGenre(String genre){
        this.genre=genre;
    }
    public String getGenre(){
        return genre;
    }

    public void setDuration(Date duration){
        this.duration=duration;
    }
    public Date getDuration(){
        return duration;
    }

    public void setRating(Double rating){
        this.rating=rating;
    }
    public Double getRating(){
        return rating;
    }
public static SongPojo createSong(String line) throws Exception{
        String [] arr =line.split(",");
        String t = arr[0];
        String g =arr[1];
        DateFormat df=new SimpleDateFormat("mm:ss");  //for duration input
        Date d=df.parse(arr[2]);
        Double r =Double.parseDouble(arr[3]);
        return  new SongPojo(t,g,d,r);
    }


    public String toString (){
        return "Title: "+title+"\n Genre: "+genre+"\n Duration: "+duration+"\n Rating: "+rating;
    }

}