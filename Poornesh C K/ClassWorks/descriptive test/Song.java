import java.text.DateFormat;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;
import java.util.Scanner;
public class Song implements Serializable{
    private String Title;
    private String genre;
    private Date duration;
    private Double rating;

  
    public Song(){
    }
    public Song(String Title,String genre,Date duration,Double rating){    
        this.Title=Title;
        this.genre=genre;
        this.duration=duration;
        this.rating=rating;
    }
    public void setTitle(String Title){
        this.Title=Title;
    }
    public String getTitle(){
        return Title;
    }
    public void setgenre(String genre){
        this.genre=genre;
    }
    public String getgenre(){
        return genre;
    }
    public void setrating(Double rating){
        this.rating=rating;
    }
    public Double getrating(){
        return rating;
    }
    public void setduration(Date duration){
        this.duration=duration;

    }
    public Date getduration(){
        return duration;
    }
   static Song SongcreateSong(String line) throws Exception{  
        String [] arr =line.split(",");
        String sn = arr[0];
        String sg =arr[1]; 
        DateFormat df=new SimpleDateFormat("mm:ss");                                                                    //for duration input
        Date dd=df.parse(arr[2]);
        Double sr =Double.parseDouble(arr[3]);
        return  new Song(sn,sg,dd,sr);
    }




    public String toString (){
        return "Title:"+Title+"\ngenre"+genre+"\n duration"+duration+"\n rating"+rating;
    }    


}