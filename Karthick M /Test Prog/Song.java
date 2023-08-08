import java.io.Serializable;
import java.text.*;
import java.util.*;
class Song implements Serializable
{
    private String title;
    private String genre;
    private Date duration;
    private Double rating;

    public Song(String title, String genre, Date duration, Double rating)
    {
        this.title=title;
        this.genre=genre;
        this.duration=duration;
        this.rating=rating;
    }

    public Song(){}

    public String gettitle()
    {
        return title;
    }

    public void settitle(String title)
    {
        this.title=title;
    }

    public String getgenre()
    {
        return genre;
    }

    public void setgenre(String genre)
    {
        this.genre=genre;
    }

    public Date getduration()
    {
        return duration;
    }

    public void setduration(Date duration)
    {
        this.duration=duration;
    }

    public Double getrating()
    {
        return rating;
    }

    public void setrating(Double rating)
    {
        this.rating=rating;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                '}';
    }

    public static Song createSong(String detail) throws ParseException {
        String[] s = detail.split(",");
        String title = s[0];
        String genre = s[1];
        DateFormat df = new SimpleDateFormat("mm:ss");
        Date duration = df.parse(s[2]);
        Double rating = Double.parseDouble(s[3]);
        Song ss = new Song(title,genre,duration,rating);
        Songs.song.add(ss);
        return ss;
    }
}

