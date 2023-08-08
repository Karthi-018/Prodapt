import java.util.*;
import java.util.Scanner;
import java.io.*; 
import java.text.*;

class MainSong 
{
    
    public static void main(String args[]) throws Exception
{
   
    List<Song> songlist = new ArrayList<>();
    
    songlist.add(Song.createSong("abc, rock, 03:08, 4.9"));
    
    songlist.add(Song.createSong("ahf, folk, 04:08, 2.9"));
    
    songlist.add(Song.createSong("hgf, melody, 02:08, 3.9"));
    
    songlist.add(Song.createSong("khd, pop, 05:09, 1.9"));

    songlist.add(Song.createSong("ugd, jazz, 06:26, 5.0"));
    
    System.out.println("1. Sort based on duration");
    System.out.println("2. Sort based on rating");
    System.out.println("3. Search a song");
    
    Scanner sc = new Scanner(System.in);
    int select = sc.nextInt();
    
    switch(select)
    
    {
    case 1: //to sort based on duration

    songlist.sort((Song s1,Song s2) -> {return s1.getduration().compareTo(s2.getduration());});
    System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
    for(Song i:songlist)
    {
       DateFormat df = new SimpleDateFormat("mm:ss");
       System.out.format("%-20s %-10s %-12s %-12s\n",i.gettitle(),i.getgenre(),df.format(i.getduration()),i.getrating());
    }
    //songlist.forEach(System.out::println);
    //System.out.println(songlist);
    break;


    case 2: //to sort based on rating

    //songlist.sort((song1, song2) -> (song1.getrating()<song2.getrating())?-1:(song1.getrating()>song2.getrating())?1:0);
    songlist.sort((Song s1,Song s2) -> {
			if(s1.getrating()>s2.getrating()){
				return 1;
			}
			else {
				return -1;
			}
		}
	);
    System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
    for(Song i:songlist)
    {
       DateFormat df = new SimpleDateFormat("mm:ss");
       System.out.format("%-20s %-10s %-12s %-12s\n",i.gettitle(),i.getgenre(),df.format(i.getduration()),i.getrating());
    }
    break;


    case 3: //to search a song
    {

      int flag = 0;
      String search_song = sc.next(); 
      
      File file=new File("Varsha.txt");
      try(FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos);) 
      {
      for(Song s1 : songlist)
      {
            
      if(search_song.equals(s1.gettitle()))
      {
        System.out.println(s1);
        /*System.out.format("%-20s %-10s %-33s %-15s\n","Title","Genre","Duration","Rating");
        for(Song i:songlist)
        {
           System.out.format("%-20s %-10s %-33s %-15s\n",i.gettitle(),i.getgenre(),i.getduration(),i.getrating());
        }*/
        flag = 1; 
        oos.writeObject(s1);
        break;
      }
      }
      if (flag == 0)
      {
        throw new SongNotFoundException(search_song);
      }
      }

      catch(IOException e)
      {
      System.out.print(e);
      }
      break;
      }
      

}
}
}













