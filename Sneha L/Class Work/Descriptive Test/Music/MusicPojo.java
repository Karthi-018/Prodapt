import java.util.*;
import java.text.*;
import java.io.*;
public class MusicPojo implements Serializable{
    private String title;
    private String genre;
    private Date duration;
    private double rating;

    MusicPojo(String title,String genre,Date duration,double rating){
	this.title=title;
	this.genre=genre;
	this.duration=duration;
	this.rating=rating;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setGenre(String genre){
		this.genre=genre;
        }
	public void setDuration(Date duration)
	{	
		this.duration=duration;
	}
	public void setRating(double rating)
	{	
		this.rating=rating;
	}
	public String getTitle(){
		return title;
	}
	public String getGenre(){
		return genre;
	}
	public double getRating(){
		return rating;
	}
	public Date getDuration(){
		return duration;
	}

	public static MusicPojo createSong(String a)
	{
		String[] strar=a.split(",");
		MusicPojo sg=null;
		DateFormat df=new SimpleDateFormat("mm:ss");
		try{
		Date d=df.parse(strar[2]);
		sg=new MusicPojo(strar[0],strar[1],d,Double.valueOf(strar[3]));
		
		}
		catch( ParseException e){
			System.out.println(e);
			
		}
		return sg;
	}

	public String toString(){
		return "Song Details:\n Title:"+title+"\nGenre:"+genre+"\nDuration:"+duration+"\nRating:"+rating;
	}	
}
