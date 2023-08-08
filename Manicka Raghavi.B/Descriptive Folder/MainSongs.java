package songs;

import java.util.*; 
import java.io.*;
import java.text.*;

class MainSongs implements Serializable
{ 

static Scanner sc=new Scanner(System.in);

//ArrayList for Storing Song Details 
static ArrayList<Song> songlist=new ArrayList<Song>();

//Method to create Song List
static void create()
{ 

songlist.add(Song.createSong("AAA,Jazz,04:00,5")); 

songlist.add(Song.createSong("BBB,HipPop,03:00,4.5")); 

songlist.add(Song.createSong("CCC,Melody,04:58,4.8")); 

songlist.add(Song.createSong("DDD,Carantic,06:30,3")); 

songlist.add(Song.createSong("ABD,Rap,02:30,3.5"));  

}

//Method to search the Song Name
static void search(String song_name) throws SongNotFoundException,Exception
{ 

 int flag=0; 

 File file=new File("Raghavi.txt");

 try(FileOutputStream fos=new FileOutputStream(file); ObjectOutputStream oos=new ObjectOutputStream(fos);) 
  {

   for(Song obj:songlist)
   { 
    if((obj.getTitle()).equals(song_name))
    {
       System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating"); 
       System.out.format("%-20s %-10s %-12s %-12s\n",obj.getTitle(),obj.getGenre(),new SimpleDateFormat("mm:ss").format(obj.getDuration()),obj.getRating());
       oos.writeObject(obj); 
       System.out.print("Object Serialized");
       flag=1;
       break;
    } 
   }
  
   if(flag==0) 
   throw new SongNotFoundException(song_name); 
 }
 
 catch(IOException e) 
  {  
   System.out.print(e);
  }
} 


//Main Method
public static void main(String[]args) 
{

create();

System.out.println("\nEnter your choice\n1-Sort the song list based on duration\n2-Sort the song list based on rating\n3-Search Song name");
int choice=sc.nextInt();

switch(choice) 
{ 

  case 1:System.out.println("Sorting the Song List based on Duration"); 

       songlist.sort((object1,object2)->(object1.getDuration().compareTo(object2.getDuration())));    

       System.out.format("%-20s %-10s %-33s %-15s\n","Title","Genre","Duration","Rating");
    
       for(Song i: songlist) 
       {
         System.out.format("%-20s %-10s %-33s %-15s\n",i.getTitle(),i.getGenre(),new SimpleDateFormat("mm:ss").format(i.getDuration()),i.getRating());
       }
       break;


  case 2: System.out.println("Sorting the Song List based on Rating"); 

        songlist.sort( (object1,object2)->( (object1.getRating()>object2.getRating()) ?1:-1));  

        System.out.format("%-20s %-10s %-33s %-15s\n","Title","Genre","Duration","Rating");
    
        for(Song i: songlist) 
        {
         
         System.out.format("%-20s %-10s %-33s %-15s\n",i.getTitle(),i.getGenre(),new SimpleDateFormat("mm:ss").format(i.getDuration()),i.getRating());
        }
        break;


  case 3: System.out.println("Search Song Name");

        String song_name=sc.next();
        try 
        {
          search(song_name); 
        } 
        catch(SongNotFoundException e)
        {
         System.out.print(e);
        }
	catch(Exception e)
        {
         System.out.print(e);
        }
        break;
  }
 }
}