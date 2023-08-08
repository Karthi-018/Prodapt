import java.util.*;
import java.text.*;
import java.io.*;
class SongNotFoundException extends Exception
{
	SongNotFoundException(String s)
	{
		System.out.println("Song not found in the list");
	}
}

class mainSong
{
	public static void main(String args[])throws Exception
	{
		Date d = new Date();
		
		
		ArrayList<songPojo> l = new ArrayList<songPojo>();
		l.add(songPojo.createSong("aaa,pop,10:00,9.0"));
		l.add(songPojo.createSong("bbb,folk,11:00,9.1"));
		l.add(songPojo.createSong("ccc,jazz,09:00,8.4"));
		l.add(songPojo.createSong("ddd,pop,02:00,7.5"));
		
		//l.forEach(System.out::println);
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		while(choice!=4)
		{
		System.out.println("Enter 1 to sort the song based on duration: ");
		System.out.println("Enter 2 to sort the song based on ratings: ");
		System.out.println("Enter 3 to search the song by name: ");
		System.out.println("Enter 4 to complete: ");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1 : 
				Collections.sort(l,(t1,t2)-> t1.getduration().compareTo(t2.getduration()));
				//l.forEach(System.out::println);
				System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
				for(songPojo i : l)
				{
					System.out.format("%-20s %-10s %-12s %-12s\n",i.gettitle(),i.getgenre(),new SimpleDateFormat("mm:ss").format(i.getduration()),i.getrating());
				}
				break;
			case 2 :
				Collections.sort(l,(t1,t2)->(t1.getrating() > t2.getrating())? 1 :(t1.getrating() < t2.getrating())? -1 :0);
				//l.forEach(System.out::println);
				System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
				for(songPojo i : l)
				{
					System.out.format("%-20s %-10s %-12s %-12s\n",i.gettitle(),i.getgenre(),new SimpleDateFormat("mm:ss").format(i.getduration()),i.getrating());
				}
				break;
			
			case 3 : 
			
			System.out.println("Enter the song name to search");
			String uname = sc.next();
			boolean flag = true;
			try(FileOutputStream fis = new FileOutputStream("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fis);)
			{
			for(songPojo s : l)
			{
				if(uname.equals(s.gettitle()))
				{
					System.out.println(s);
					flag = false;
						System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
						System.out.format("%-20s %-10s %-12s %-12s\n",s.gettitle(),s.getgenre(),new SimpleDateFormat("mm:ss").format(s.getduration()),s.getrating());
						oos.writeObject(s);
						System.out.println("Done");
					
					
					break;
					
					
			}}
				if(flag==true)
				{
					throw new SongNotFoundException(uname);
				}
				
			
			}
			catch(Exception e)
					{
						System.out.println(e);
					}
			break;
			case 4 : System.exit(0);
			break;
			/*Iterator<songPojo> i = l.iterator();
			while(i.hasNext())
			{
				
				songPojo s = i.next();
				if(uname.equals(s.gettitle()))
				{
					System.out.println(s);
					c = true;
				}
				
				
			}
			if(c ==false)
			{
				throw new songNotFoundException(uname);
			}*/
			}	
		}
	}
}
