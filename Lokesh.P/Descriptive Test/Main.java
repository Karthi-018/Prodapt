import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.*;
import java.io.*;
import java.text.*;
public class Main implements Serializable
{
static List<Song> l = new ArrayList<>();	

	public void createList()
	{
	
	
	l.add(Song.createSong("aaa,pop,04:58,5.0"));
	l.add(Song.createSong("ddd,classic,05:02,4.2"));
	l.add(Song.createSong("bbc,folk,03:44,3.5"));
	l.add(Song.createSong("ccc,jazz,02:44,4.7"));
	l.add(Song.createSong("fff,mass,03:18,4.1"));
	}

	public static void main(String[] args) throws SongNotFoundException,Exception
	{
	Main m = new Main();
	m.createList();

	Scanner sc = new Scanner(System.in);
	int choice;
	do
	{
	System.out.println("Choose one among Them");
	System.out.println("1.Sort song based on duration");
	System.out.println("2.Sort Song based on Rating");
	System.out.println("3.Search the song by name");
	System.out.println("4.Exit");
	Song s = new Song();
	
	choice=sc.nextInt();
	switch(choice)
	{
		case 1:
			Collections.sort(l,(obj1,obj2)->(obj1.getDuration().compareTo(obj2.getDuration())));
			System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
			displaySong(l);
			break;
		case 2:
			Collections.sort(l,(obj1,obj2)->((obj1.getRating())>(obj2.getRating())?1:-1));
			System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
			displaySong(l);
			break;
		case 3:
			
			String name = sc.next();
			Song foundSong=searchSong(l,name);
			
			
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option");
	}
	}
	while(choice!=4);
	sc.close();
	}
	
	public static void displaySong(List<Song> l)
	{
	for(Song k : l)
	{
		DateFormat df=new SimpleDateFormat("mm:ss");
		System.out.format("%-20s %-10s %-12s %-12s\n",k.getTitle(),k.getGenre(),df.format(k.getDuration()),k.getRating());
	}

	}
	public static Song searchSong(List<Song> l,String name) throws IOException,SongNotFoundException
	{ 
		File f = new File("song.txt");
                int flag=0;
		Song g = null;
	        FileOutputStream fos = new  FileOutputStream(f);
 		ObjectOutputStream obj = new ObjectOutputStream(fos);
		
			
		for(Song i : l)
		{
			if(i.getTitle().equals(name))
			{
				System.out.println("SONG FOUND");
				DateFormat df=new SimpleDateFormat("mm:ss");
				System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),df.format(i.getDuration()),i.getRating());
				obj.writeObject(i);
                                flag=1;
				g =  i;
			}
		}
                if(flag==0)
		{ throw new SongNotFoundException();}
		return g;
					
	}
}

		
	
		
