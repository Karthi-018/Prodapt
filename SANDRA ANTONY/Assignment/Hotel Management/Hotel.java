
public class Hotel
{
    String hName;
    String description;
    String hId;
    String rating;
    public Hotel(String hName, String description, String hId,String rating)
    {
        this.hName = hName;
        this.description = description;
        this.hId = hId;
        this.rating=rating;
    }

    public String gethName()
    {
        return hName;
    }

    public void sethName(String hName)
    {
        this.hName = hName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String gethId()
    {
        return hId;
    }

    public void sethId(String rNum)
    {
        this.hId = hId;
    }
    public String getRating()
    {
        return rating;
    }
    public void setRating(String rating)
    {
        this.rating = rating;
    }

    public String toString()
    {
        return hName+" "+description+" "+hId+" "+rating;
    }
}
