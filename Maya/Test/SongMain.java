import java.util.*;
import java.text.*;
import java.io.*;

class SongMain implements Serializable
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc=new Scanner(System.in);
        List<Song> songlist=new ArrayList<>();
        songlist.add(Song.createSong("Bad,Rock Metal,08:12,3.0"));
        songlist.add(Song.createSong("Cruel,Pop,09:12,5.0"));
        songlist.add(Song.createSong("Calm,Pop,01:22,4.0"));
        while(true)
        {
            System.out.println("Enter your choice between 1 to 4");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    songlist.sort((s1, s2) -> (s1.getduration().compareTo(s2.getduration())));
                    for(Song s:songlist)
                    {
                        System.out.format("%-20s %-10s %-8s %-12s\n",s.gettitle(),s.getgenre(),new 					SimpleDateFormat("mm:ss").format(s.getduration()),s.getrating());
                    }
                    break;
                }


                case 2:
                {
                    songlist.sort((s1, s2) -> (s1.getrating().compareTo(s2.getrating())));
                    for(Song s:songlist)
                    {
                        System.out.format("%-20s %-10s %-8s %-12s\n",s.gettitle(),s.getgenre(),new 										SimpleDateFormat("mm:ss").format(s.getduration()),s.getrating());
                    }
                    break;
                }

                case 3:
                {
                    System.out.println("Enter the song name to be searched");
                    String songname=sc.next();
                    boolean temp=false;
                    for(Song s : songlist)
                    {
			if (s.gettitle().toLowerCase().equals(songname.trim().toLowerCase())) {
                        
                          
                            System.out.format("%-20s %-10s %-8s %-12s\n",s.gettitle(),s.getgenre(),new    									    SimpleDateFormat("mm:ss").format(s.getduration()),s.getrating());
                            temp=true;
                            File seraializable_file=new File("demo.txt");
                            try (FileOutputStream f = new FileOutputStream(seraializable_file);
                                 ObjectOutputStream o = new ObjectOutputStream(f);)
                            {
                                o.writeObject(s);
                                System.out.println("sucessfull");
                                temp=true;
                                break;
                            }
                            catch (Exception e) {

                                System.out.println(e);
                            }
                        }
                    }
                    if(!temp)
                    {
                        throw new SongNotFoundException(songname);
                    }
		    break;


                }


                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");


            }

        }




    }

}