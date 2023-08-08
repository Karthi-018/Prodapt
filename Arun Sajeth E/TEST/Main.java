package songs;
import java.util.*;
import java.text.*;
import java.io.*;

public class Main
{
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		
		Song sg = new Song();
		List<Song> L = new ArrayList<>();

		// setting data int List

		try
		{
			L.add(Song.createSong("ABC,gen1,05:55,7.50"));
			L.add(Song.createSong("XYZ,gen2,07:30,5.40"));
			L.add(Song.createSong("MNO,gen3,02:10,9.75"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		// Operation

		int choice;
		do
		{
			System.out.println("1. sort based on duration");
			System.out.println("2. sort based on rating");
			System.out.println("3. search the song");
			
			System.out.print("Enter the choice: ");
			choice = s.nextInt();

			Main m = new Main();
			
			switch(choice)
			{
				case 1:
					L.sort((s1, s2) -> (s1.getDuration().compareTo(s2.getDuration())));
					for(Song l1:L)
					{
						DateFormat df = new SimpleDateFormat("mm:ss");
						System.out.format("%-20s %-10s %-12s %-12s\n",l1.getTitle(),l1.getGenre(),df.format(l1.getDuration()),l1.getRating());
					}
					break;
				case 2:
					L.sort((s1, s2) -> (s1.getRating()<s2.getRating())?-1:(s1.getRating()>s2.getRating())?1:0);
					for(Song l1:L)
					{
						DateFormat df = new SimpleDateFormat("mm:ss");
						System.out.format("%-20s %-10s %-12s %-12s\n",l1.getTitle(),l1.getGenre(),df.format(l1.getDuration()),l1.getRating());
					}
					break;
				case 3:
					System.out.print("Enter the song name to search: ");
					String name = s.next();
					search_Song(name,L);
					break;
				default:
					System.out.println("EXIT");
			}
		}while(choice!=0 && choice < 4);
					
	}

	// for searching song title from the list

	public static void search_Song(String name, List<Song> L)
	{
		boolean flag = false;
		for(Song l1:L)
		{
			if(l1.getTitle().equals(name))
			{
				DateFormat df = new SimpleDateFormat("mm:ss");
				System.out.format("%-20s %-10s %-12s %-12s\n",l1.getTitle(),l1.getGenre(),df.format(l1.getDuration()),l1.getRating());
				flag = true;
				try{
					FileOutputStream fos = new FileOutputStream("my.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(l1);
					oos.close();
				}
				catch(Exception e)
				{
					System.out.print(e);
				}
			}
		}
		if(!flag)
		{
			try{
				throw new songs.SongNotFoundException(name);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}