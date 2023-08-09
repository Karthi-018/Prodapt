import java.text.*;
import java.util.*;
public class Song {
    private String title;
    private String genre;
    private Date duration;
    private Double rating;

    Song(){} //Default constructor

    public Song(String title,String genre,Date duration,Double rating) //parameterized constructor
    {
        this.title=title;
        this.genre=genre;
        this.duration=duration;
        this.rating=rating;
    }
    //Getters and Setter Method:
    public String getTitle(){
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
    @Override
    public String toString() {
        return (title + " "+ genre + " " +duration + " " +rating);
    }


    public static Song createSong(String a) throws ParseException {
        String[]t=a.split(",");
        String title=t[0];
        String genre=t[1];
        Double rating=Double.parseDouble(t[3]);
        DateFormat dt=new SimpleDateFormat("mm:ss");
        Date d=dt.parse(t[2]);
        Song ss=new Song(title,genre,d,rating);
        return ss;
    }
}
