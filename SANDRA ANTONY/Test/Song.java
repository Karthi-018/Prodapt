import java.text.*;
import java.util.*;
import java.io.*;
class Song implements Serializable
{

	
	private String title;
	private String genre;
	private Date duration;
	private Double rating;
	
	
		
		public Song(String title, String genre, Date duration, Double rating)
		{
			this.title = title;
			this.genre = genre;
			this.duration = duration;
			this.rating = rating;
		}
		
		public void setTitle(String title)
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



		public String toString()
		{
			return title+"\n"+genre+"\n"+duration+"\n"+rating;
		}


		public static Song createSong(String music) throws ParseException
		{
			
			String arr[]=music.split(",");
			String title = arr[0]; 
			String genre = arr[1];
			DateFormat df = new SimpleDateFormat("mm:ss");
			Date d = df.parse(arr[2]);
			Double rating = new Double(arr[3]);
			
			Song obj = new Song(title,genre,d,rating);
	
			return obj;
			
			
		}
	
}
	
