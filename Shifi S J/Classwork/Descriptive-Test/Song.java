import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.io.*;
import java.text.*;
import java.text.DateFormat;


class Song{

    public static void main(String []args)throws Exception
{
 	    System.out.println("Enter the choice ");
            
            System.out.println("1.Sorts the song list based on duration");
            System.out.println("2.Sorts the songs based on rating ");
            System.out.println("3.Search the song");
	    Scanner sc=new Scanner(System.in);
	    int choice =sc.nextInt();

     
        List<SongPojo> song=new ArrayList<>();      //creating list
        song.add(SongPojo.createSong("Uyire,pop,02:07,4.5"));
        song.add(SongPojo.createSong("Kanave,jazz,03:00,3.0"));
        song.add(SongPojo.createSong("Inaye,rock,04:40,4.1"));
        song.add(SongPojo.createSong("Saregama,melody,05:30,5.0"));
        song.add(SongPojo.createSong("Maatram,pop,02:04,4.0"));

            switch(choice){
                case 1:
                    Collections.sort(song,(duaration1,duration2)->(duaration1.getDuration().compareTo(duration2.getDuration())));
                    System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");   //formatting

                    for(SongPojo i:song ){
                        System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),new SimpleDateFormat("mm:ss").format(i.getDuration()),i.getRating());
                    }

        		break;

                        case 2:

                    Collections.sort(song,(rating1,rating2) -> (rating1.getRating().compareTo(rating2.getRating())));
                    System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
                    DateFormat df = new SimpleDateFormat("mm:ss");
                    for(SongPojo i:song ){
                        System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),df.format(i.getDuration()),i.getRating());
                    }
                     break;
                     case 3:

                    String n = sc.next();
                    Iterator <SongPojo> it= song.iterator();
                    int flag=0;
                    while(it.hasNext()){
                        SongPojo s= it.next();
                        if(s.getTitle().equals(n)){
                            flag=1;
                            
                            System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
                            System.out.format("%-20s %-10s %-12s %-12s\n",s.getTitle(),s.getGenre(),new SimpleDateFormat("mm:ss").format(s.getDuration()),s.getRating());

                            File file=new File("song.txt");
                            try(FileOutputStream fs = new FileOutputStream(file);      //serialization
				 ObjectOutputStream obj=new ObjectOutputStream(fs))
                            {
                                obj.writeObject(s);
                                break;
                                   }
                                   catch(Exception e)
                                   {
                                        System.out.println(e);
                                   }
                        }

                    } 
                    if (flag==0){
                            System.out.println("not found");
                    }           


            }

        }
}