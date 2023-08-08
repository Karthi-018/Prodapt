package songs;
import java.util.*;
import java.text.*;
import java.io.*;

public class Song implements Serializable
{
	private String title;
	private String genre;
	private Date duration;
	private double rating;

	// default constructor
	public Song()
	{
		
	}

	// parameterized constructor
	public Song(String title,String genre, Date duration, double rating)
	{
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rating = rating;
	}
	
	// setter methods
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	public void setDuration(Date duration)
	{
		this.duration = duration;
	}
	public void setRating(double rating)
	{
		this.rating = rating;
	}
	
	// getter methods
	public String getTitle()
	{
		return title;
	}
	public String getGenre()
	{
		return genre;
	}
	public Date getDuration()
	{
		return duration;
	}
	public double getRating()
	{
		return rating;
	}
	
	public String toString()
	{
		return title+" "+genre+" "+duration+" "+rating;
	}

	public static Song createSong(String song_detail) throws ParseException
	{
		String temp[] = song_detail.split(",");
		String tit = temp[0];
		String gen = temp[1];
		DateFormat df = new SimpleDateFormat("mm:ss");
		Date d = df.parse(temp[2]);
		double rate = Double.parseDouble(temp[3]);
		return new Song(tit,gen,d,rate);
	}
}