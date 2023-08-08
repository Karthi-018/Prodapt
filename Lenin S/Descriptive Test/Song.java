import java.util.*;
import java.io.Serializable;
import java.text.*;
class Song implements Serializable
{

//pojo attriubtes
	private String title;
	private String genre;
	private Date duration;
	private Double rating;

	public Song(){}

	public Song(String title, String genre, Date duration, Double rating)
	{
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rating = rating;
	}

//getter setter methods
	
	public void setTitle(String tile)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return title;
	}



	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	public String getGenre()
	{
		return genre;
	}



	public void setDuration(Date duration)
	{
		this.duration = duration;
	}
	public Date getDuration()
	{
		return duration;
	}


	
	public void setRating(Double rating)
	{
		this.rating = rating;
	}
	public Double getRating()
	{
		return rating;
	}


	public static Song createSong(String line) throws Exception
	{

//split - , (&) Tostring method:
//Date
 
		String[] arr = line.split(",");
		String title = arr[0];
		String genre = arr[1];

		DateFormat df = new SimpleDateFormat("mm:ss");
		Date duration = df.parse(arr[2]);
		Double rating = new Double(arr[3]);
		return new Song(title,genre,duration,rating);
	}

	public String toString()
	{
		return title+" "+genre+" "+duration+" "+rating;    //printformat
	}



	
	
}
