import java.util.*;
import java.text.*;
class Song 
{
	private String title;
	private String genre;
	private Date duration;
	private Double rating;
	
	public Song()
	{
	}

	public Song(String title,String genre,Date duration,Double rating)
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
	public void setRating(Double rating)
	{
		this.rating=rating;
	}
	public Double getRating()
	{
		return rating;
	}
		
	public static Song createSong(String line)throws Exception
	{
	
		String[] songDetails = line.split(",");
		String stitle = songDetails[0];
		String sgenre = songDetails[1];
		DateFormat df = new SimpleDateFormat("mm:ss");
		Date sduration = df.parse(songDetails[2]);
		double srating = Double.parseDouble(songDetails[3]);
		
		return new Song(stitle, sgenre, sduration,srating);
			


	}	
	public String toString()
	{
		return "Song title "+title+", Song genre "+genre+", Song duration"+duration+", rating"+rating;
	}
}






