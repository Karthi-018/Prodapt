import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.text.*;
import java.io.Serializable;
class Main implements Serializable{
public static void main(String args[])throws Exception
{
	List<Song> song=new ArrayList<>();
	song.add(Song.createSong("aaa,pop,04:02,5.0"));
	song.add(Song.createSong("bbb,pop,48:09,8.0"));
	song.add(Song.createSong("ccc,pop,58:28,7.0"));
	song.add(Song.createSong("fff,pop,44:25,5.0"));
	song.add(Song.createSong("ddd,pop,79:25,9.0"));

	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	System.out.println("Enter your choice:");
	System.out.println("\1.sort by duration,\2.sort by rating,\3.song name in the list");

	int choice =1;
        switch(choice){
		case 1:
		{
                song.sort((t1,t2)->(t1.getduration()).compareTo(t2.getduration()));
	        //song.forEach(System.out::println);//
		for(Song sg:song)
                {
                System.out.format("%-20s %-10s %-8s %-12s\n",sg.gettitle(),sg.getgenre(),new SimpleDateFormat("mm:ss").format(sg.getduration()),sg.getrating());
                }
		break;
		}
		case 2:
		{
		song.sort((t1,t2)->(t1.getrating()).compareTo(t2.getrating()));
	        for(Song sg:song)
                {
                System.out.format("%-20s %-10s %-8s %-12s\n",sg.gettitle(),sg.getgenre(),new SimpleDateFormat("mm:ss").format(sg.getduration()),sg.getrating());
                }
		break;
		}
				
		case 3:
		{
		System.out.println("Enter song:");
		String songname =sc.next();
		int x=0;
		File file=new File("demo.txt");
		try(FileOutputStream fos = new FileOutputStream(file);
             	   ObjectOutputStream oos = new ObjectOutputStream(fos);)
		{
			for(Song ss: song)
		if(ss.gettitle().equals(songname))
		{
			x=1;
			System.out.println(ss);
			oos.writeObject(ss);
           	 	System.out.println("sucess");
        	}
		} 
		catch(Exception e){
			System.out.println(e);
		}
		
	if(x==0){
		throw new SongNotFoudException(songname);
		}
}
		
}		
}
}
               
	
