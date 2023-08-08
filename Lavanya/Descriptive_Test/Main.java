import java.text.*;
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws SongNotFoundException,Exception{
        Scanner scan=new Scanner(System.in);
        Song s=new Song();
        ArrayList<Song> list=new ArrayList<>();
        list.add(Song.createSong("not today, kpop, 04:00, 5.3"));
        list.add(Song.createSong("not, kpop, 04:45, 5.2"));
        list.add(Song.createSong("today, kpop, 04:20, 4.3"));
        DateFormat df = new SimpleDateFormat("mm:ss");System.out.println("Enter 1 to sort the data by duration");
        System.out.println("Enter 2 to sort the data by rating");
        System.out.println("Enter 3 to search the song");
        System.out.println("Enter your choice");
        int choice=scan.nextInt();
        switch(choice){
            case 1:
                Collections.sort(list,(s1,s2) -> ((s1.getDuration().compareTo(s2.getDuration()))));
                System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
                for(Song i:list){
                    System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),df.format(i.getDuration()),i.getRating());
                }
                break;
            case 2:
                Collections.sort(list,(s1,s2) -> ((s1.getRating().compareTo(s2.getRating()))));
                System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
                for(Song i:list)
                {
                    System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),df.format(i.getDuration()),i.getRating());
                }
                break;
            case 3:
                System.out.print("Enter the name of the song : ");
                String name=scan.next();
                File f=new File("Song.txt");
                boolean flag = false;
                for (Song i:list){
                    if (i.getTitle().equals(name)){
                        flag = true;
                        System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");

                        System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),df.format(i.getDuration()),i.getRating());
                        try(FileOutputStream fs = new FileOutputStream(f);
                            ObjectOutputStream oos = new ObjectOutputStream(fs);)
                        {
                            oos.writeObject(i);
                            System.out.println("Done Serailization");
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                        break;
                    }
                }
                if(!flag)
                {
                    try
                    {
                        throw new SongNotFoundException(name);
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                }
           }
    }
}