class Radio
{  
    public void play()
   { 
       System.out.println("Plays music");
   }  
}
class Spotify extends Radio
{  
    public void play()
    { 
        System.out.println("Instant Music"); 
    }  
}

public class Mainmusic
{
public static void main(String args[])
{  
    Radio obj = new Radio();  
    obj.play();  
    Spotify c=new Spotify();
    c.play();
    
}
}
