import java.util.*;
import java.text.*;
import java.io.*;

public class Main implements Serializable
{
static Scanner sc=new Scanner(System.in);

List<Song> l=new ArrayList<>();

public void createDatabase()
{
	
	l.add(new Song().createSong("aaa,pop,04:58,5.0"));
	l.add(new Song().createSong("bbb,jazz,05:44,4.0"));
	l.add(new Song().createSong("ccc,folk,03:44,3.0"));
	
}


public void songOperations(int choice) throws SongNotFoundException,Exception
{
	switch(choice)
	{

	case 1:
	System.out.println("Sorting song based upon duration:");
	Collections.sort(l,(obj1,obj2)->(obj1.getDuration()).compareTo(obj2.getDuration()));
	System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
	for(Song i:l)
	{
	DateFormat df=new SimpleDateFormat("mm:ss");
	System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),df.format(i.getDuration()),i.getRating());
	}
	break;
	
	case 2:
	System.out.println("Sorting song based upon rating");
	Collections.sort(l,(obj1,obj2)->((obj1.getRating())>(obj2.getRating())?1:-1));
	System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
	for(Song i:l)
	{
	DateFormat df=new SimpleDateFormat("mm:ss");
	System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),df.format(i.getDuration()),i.getRating());
	}
	break;
	

	case 3:
	System.out.println("Enter song to search ");
	String search=sc.next();

	try
	{
	searchSong(search);
	}

	catch(SongNotFoundException e)
	{
	System.out.println(e);
	}

	catch(Exception e)
	{}
	
	default:
		break;
	}//switch close

}



public void searchSong(String search) throws Exception
{
File f=new File("Song.txt");
try(
FileOutputStream fos=new FileOutputStream(f,true);
ObjectOutputStream oos=new ObjectOutputStream(fos);
)
{                                            //try start
int flag=0;
for(Song i:l)
{
	if(i.getTitle().equals(search))
	{
		
		System.out.println("SONG FOUND!!!");
		System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
		System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),new SimpleDateFormat("mm:ss").format(i.getDuration()),i.getRating());
		oos.writeObject(i);
		flag=1;
		break;
	}
}//for end

if(flag==0)
{
	throw new SongNotFoundException();
}

}//try end



catch(Exception e)
{
	System.out.println(e);
}

}//search end.



public static void main(String args[]) throws SongNotFoundException,Exception
{
	Main m=new Main();
	m.createDatabase();
	

	System.out.println("ENTER CHOICE\n 1-song sort based on duration\n 2-song sort based on rating\n 3-search song");
	int choice=sc.nextInt();
	m.songOperations(choice);
}

}

