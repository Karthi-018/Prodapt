import java.util.*;
import java.text.*;
import java.io.*;
class songPojo implements Serializable
{
	// Attributes
	private String title;
	private String genre;
	private Date duration;
	private Double rating;
	
	// constructor
	songPojo(String title,String genre,Date duration,Double rating)
	{
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rating = rating;
	}
	
	// getters
	public String gettitle()
	{
		return title;
	}
	public String getgenre()
	{
		return genre;
	}
	public Date getduration()
	{
		return duration;
	}
	public Double getrating()
	{
		return rating;
	}
	
	// setters
	public void settitle(String title)
	{
		this.title = title;
	}
	public void setgenre(String genre)
	{
		this.genre = genre;
	}
	public void setduration(Date duration)
	{
		this.duration = duration;
	}
	public void setrating(Double rating)
	{
		this.rating = rating;
	}
	
	//song method
	public static songPojo createSong(String songlist)throws Exception
	{
		String[] slist = songlist.split(",");
		String title = slist[0];
		String genre = slist[1];
		DateFormat df  = new SimpleDateFormat("mm:ss");
		Date d  = df.parse(slist[2]);
		double rating = Double.parseDouble(slist[3]);
		return new songPojo(title,genre,d,rating);
	}
	
	// toString method
	public String toString()
	{
		return title+" "+genre+" "+duration.getMinutes()+":"+duration.getSeconds()+" "+rating;
	}
}