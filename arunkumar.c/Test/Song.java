import java.util.*;
import java.text.*;
class Song{
	private String title;
	private String genre;
	private Date duration;
	private double rating;
	public Song(){
	}
	public Song(String title,String genre,Date duration,double rating){
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rating = rating;	
	}

	public void setTitle(String title){
		this.title = title;
	}
	public void setGenre(String genre){
		this.genre = genre;
	}
	public void setDuration(Date duration){
		this.duration = duration;
	}
	public void setRating(double rating){
		this.rating = rating;
	}

	public String getTitle(){
		return this.title;
	}
	public String getGenre(){
		return this.genre;
	}
	public Date getDuration(){
		return this.duration;
	}
	public double getRating(){
		return this.rating;
	}
	public String toString(){
		return "Song +\nTitle : "+title+"\nGenre : "+genre+"\nDuration : "+duration+"\nRating : "+rating;
	}

	Song createSong(String line) throws ParseException{
		String[] s = line.split(",");
		this.title = s[0];
		this.genre = s[1];
		DateFormat df = new SimpleDateFormat("MM:SS");
		this.duration = df.parse(s[2]);
		this.rating = Double.parseDouble(s[3]);
		return this;
	}
}