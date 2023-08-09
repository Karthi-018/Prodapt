import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;
import java.util.*;
import java.text.*;

public class Main implements Serializable {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        List<Song> al=new ArrayList<>();
        System.out.println("Size: ");
        int q=sc.nextInt();
        for (int  i= 0; i < q; i++) {
            System.out.println("Enter details: ");
            String detail=sc.next();
            //Song.createSong(detail);
            Song sg=new Song();
            sg=Song.createSong(detail);//passing line to method
            al.add(sg);
        }
        System.out.println(al);
        System.out.println("Enter 1 for sort using duration");
        System.out.println("Enter 2 for sort using rating");
        System.out.println("Enter 3 for search using songName");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
            {
                al.sort((al1,al2) -> al1.getDuration().compareTo(al2.getDuration()) );
                for(Song o:al)
                {
                    DateFormat df=new SimpleDateFormat("mm:ss");
                    System.out.println(o);
                }
            }
            case 2:
            {

                al.sort((al1,al2) -> al1.getRating().compareTo(al2.getRating()));
                al.forEach(System.out::println);
                break;
            }

            case 3:
                System.out.println("Enter Song Name: ");
                String title= sc.next();
                int flag=0;
                //Iterator<Song> it=al.iterator();
                File fs=new File("song.txt");
                try(FileOutputStream fos = new FileOutputStream(fs);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);)
                {
                    for(Song o:al)
                    {
                        if(title.equals(o.getTitle()))
                        {System.out.println(o);
                            oos.writeObject(o);
                            flag=1;
                        }
                    }
                    if(flag==0)
                    {throw new SongNotFoundException(title);}
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                break;
            }
        }

    }
