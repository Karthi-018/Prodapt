import java.util.*;
import java.text.*;
import java.io.*;
public class Song implements Serializable
{
	private String title;
	private String genre;
	private Date duration;
	private double rating;
	Song()
	{
	}
	public Song(String title,String genre,Date duration,double rating)
	{
		this.title=title;
		this.genre=genre;
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
	public void setGenre(String genre)
	{
		this.genre=genre;
	}
	public String getGenre()
	{
		return genre;
	}
	public void setDuration(Date duration)
	{
		this.duration=duration;
	}
	public Date getDuration()
	{
		return duration;
	}
	public void setRating(double rating)
	{
		this.rating=rating;
	}
	public double getRating()
	{
		return rating;
	}
	public String toString()
	{

		return title+" "+genre+" "+duration+" "+rating;
	}
	public static Song createSong(String music)
	{

		String arr[]=music.split(",");
		Song obj=null;
		
		try
		{
		DateFormat df = new SimpleDateFormat("mm:ss");
		Date d = df.parse(arr[2]);
		Double dr = new Double(arr[3]);
		obj = new Song(arr[0],arr[1],d,dr);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return obj;
		
	}
	
	
}