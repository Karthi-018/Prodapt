import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.*;
import java.text.*;
import java.util.*;
public class Songs
{
    static ArrayList<Song> song=new ArrayList<>();
    public static void main(String a[]) throws ParseException, IOException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Size");
        int sz=s.nextInt();


        for(int i=0;i<sz;i++)
        {
            System.out.println("Enter Details");
            String detail=s.next();
            Song.createSong(detail);
        }
        System.out.println("1.sort by duration\n2.sort by rating\n3.search");
        System.out.println("Enter Choice:");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
                song.sort(( song,  song1)-> song.getduration().compareTo( song1.getduration()));
                song.forEach((n)->System.out.println(n));
                break;

            case 2:
                song.sort((song,song1)-> song.getrating().compareTo(song1.getrating()));
                for (Song i:song) {
                    System.out.format("%-20s %-10s %-12s %-12s\n",i.gettitle(),i.getgenre(),new SimpleDateFormat("mm:ss").format(i.getduration()),i.getrating());
                }
                break;

            case 3:
                System.out.println("Enter search song name");
                String title=s.next();
                int f=0;
                Iterator<Song> i=song.iterator();
                while(i.hasNext())
                {
                    Song sr=i.next();
                    if (sr.gettitle().equals(title))
                    {
                        System.out.println(sr);
                        f++;
                        FileOutputStream fw = new FileOutputStream("hi.txt");
                        ObjectOutputStream ob=new ObjectOutputStream(fw);
                        ob.writeObject(sr);
                        return;
                    }
                }
                if(f==0) try {
                    throw new SongNotFoundException();
                } catch (SongNotFoundException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
    }
}
