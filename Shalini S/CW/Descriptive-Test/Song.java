import java.util.*;
import java.text.*;
class Song{
    private String title;
    private String genere;
    private Date duration;
    private double rating;
    Date date = new Date();

    Song(String title,String genere,Date duration,double rating){
        this.title=title;
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
    public void setGenere(String genere){
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
    public void setRating(double rating){
        this.rating=rating;
    
    }
    public String getRating(){
        return rating;
    }
    public String toString() {
        return "Song(" +
                "title=" + title +
                ", genre='" + genre + '\'' +
                ", duration='" + durtion + '\'' +
                ", rating=" + rating +
                ")";
    }
    static Song createSong(String line){  
	String arr[]=line.split(",");
	String title=arr[0];
	String genre=arr[1];
	DateFormat df=new SimpleDateFormat("mm:ss");
	Date date=df.parse(arr[2])
	double rating=Double.parseDouble(arr[3]);
	return new Song(title,genre,date,rating);
	
    }