import java.util.*;
import java.io.*;
import java.text.*;

class SongsMain implements Serializable
{

public static void main(String args[]) throws Exception
{

	ArrayList<Song> SongsList = new ArrayList<>();
        SongsList.add(Song.createSong("AAA, pop, 04:98,4.8"));
        SongsList.add(Song.createSong("BBB, album, 03:54,3.9"));
        SongsList.add(Song.createSong("CCC, bts, 04:56,4.2"));
	SongsList.add(Song.createSong("DDD, one direction, 04:32,4.9"));
	SongsList.add(Song.createSong("EEE, podcasts, 04:11,4.0"));

        System.out.println("FEEL THE MUSIC");
        for (Song s : SongsList) 
	{
            System.out.println(s);
        }

	Scanner sc = new Scanner(System.in);
	System.out.println("1--> Sort the Song List based on Duration \n"); 
	System.out.println("2--> Sort the Song List based on Rating \n");
	System.out.println("3--> Display Song Details by Song Name \n");
	System.out.println("Enter your Choice: \n");

	int choice = sc.nextInt();

	switch(choice)
	{
	
	case 1:
		System.out.println("Sort the Song List based on Duration");
		SongsList.sort((s1,s2)->(s1.getDuration().compareTo(s2.getDuration())));
		System.out.format("%-15s %-20s %-12s %-12s\n","Title","Genre","Duration","Rating");
		for(Song s: SongsList)
		{
			DateFormat df=new SimpleDateFormat("mm:ss");
			System.out.format("%-15s %-20s %-12s %-12s\n",s.getTitle(),s.getGenre(),df.format(s.getDuration()),s.getRating());
			//System.out.println(s);
		}
		break;

	case 2:
		System.out.println("Sort the Song List based on Rating");
		Collections.sort(SongsList,Comparator.comparing(Song::getRating));
		/*Song.sort((s1,s2)->(s1.getRating().compareTo(s2.getRating())));
		
		for(Song s: SongsList)
		{
		
		}*/
		System.out.format("%-15s %-20s %-12s %-12s\n","Title","Genre","Duration","Rating");
		for(Song s:SongsList)
		{
			DateFormat df=new SimpleDateFormat("mm:ss");
			System.out.format("%-15s %-20s %-12s %-12s\n",s.getTitle(),s.getGenre(),df.format(s.getDuration()),s.getRating());
			//System.out.println(s);
		}
		break;

	case 3:
		System.out.println("Display Song Details by Song Name");
		System.out.println("Enter the Song name to be searched:");
		String songname=sc.next();
                File file=new File("Music.txt");
		try(
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);) 
                {
	        int flag=0;
		for(Song s:SongsList)
		{
			if(songname.equals(s.getTitle()))
			{
				System.out.println(s);
				oos.writeObject(s); 
                                flag=1; 
                                break;
			}
                 }
                  if(flag==0)
                  throw new SongNotFoundException(songname);
		 }
                 catch(IOException e)
			{
				System.out.println(e);
			}
			
 		
	}
}

}			
		
	
	
	




       
