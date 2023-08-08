import java.util.*;
import java.text.*;
import java.io.*;
class Main implements Serializable {
public static void main(String args[]) throws Exception{
ArrayList<Song>song=new ArrayList<>();
//createSong obj=new createSong();

song.add(Song.createSong("aaa,pop,04:58,5.0d"));
song.add(Song.createSong("bbb,mp3,05:58,3.0d"));
song.add(Song.createSong("ccc,mp4,06:58,2.0d"));

DateFormat df=new SimpleDateFormat("mm:ss");
System.out.println("Enter your choice: ");
Scanner sc=new Scanner(System.in);
int choice=sc.nextInt();
switch (choice){

case 1:
Collections.sort(song,((s1, s2) -> (s1.getduration()).compareTo(s2.getduration())));
System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");

for(Song i:song)
{
System.out.format("%-20s %-10s %-12s %-12s\n",i.gettitle(),i.getgenre(),df.format(i.getduration()),i.getrating());
}
                //song.forEach(System.out::println);
break;


case 2:
Collections.sort(song,((s1,s2)->(s1.getrating()<s2.getrating())?-1:(s1.getrating()>s2.getrating())?1:0));

for(Song i:song)
{
System.out.format("%-20s %-10s %-12s %-12s\n",i.gettitle(),i.getgenre(),df.format(i.getduration()),i.getrating());
}
break;


case 3:
System.out.println("Enter song:");
		String songname =sc.next();
		int x=0;
		File file=new File("demo.txt");
		try(FileOutputStream fos = new FileOutputStream(file);
             	   ObjectOutputStream oos = new ObjectOutputStream(fos);)
		{
	        for(Song ss: song)
                {
		if(ss.gettitle().equals(songname))
		{
			x=1;
			System.out.println("SONG FOUND");
			System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
			System.out.format("%-20s %-10s %-12s %-12s\n",ss.gettitle(),ss.getgenre(),df.format(ss.getduration()),ss.getrating());
			

        	}
		}
}
               catch(Exception e){
                       System.out.println(e);
		}
		
		if(x==0)
                {
           
                    throw new SongNotFoundException(songname);
                   
                 }



}
}
}
