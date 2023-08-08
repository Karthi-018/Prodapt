import java.util.*;
import java.text.*;
import java.io.*;
class SongMain
{
	static List<Song> SongArr = new ArrayList<>();
	public void convert() throws ParseException
	{
		SongArr.add(Song.createSong("aaa,melodious,04:00,4.4"));
		SongArr.add(Song.createSong("saa,jazz,03:30,5.0"));
		SongArr.add(Song.createSong("re,pop,02:05,4.0"));
		SongArr.add(Song.createSong("gaa,rock,01:30,3.5"));
		SongArr.add(Song.createSong("maa,desi,01:00,3.5"));
	}
	public static void main(String[] args) throws ParseException, IOException
		
	{
		SongMain sobj = new SongMain();
		sobj.convert();
		
		Scanner s=new Scanner(System.in);

        	System.out.println("1.To sort the Song by duration");
        	System.out.println("2.To sort the Song by rating");
        	System.out.println("3.To search song");
        	System.out.println("Enter your option: ");
        	int choice = s.nextInt();


        	switch(choice)
        	{
            	case 1:
                
			SongArr.sort((s1,s2) ->(s2.getDuration().compareTo(s1.getDuration())));
			System.out.format("%-20s %-10s %-12s %-12s\n","title","genre","duration","rating");
			SongArr.forEach(System.out::println);
			break;
                	
                case 2:	

			SongArr.sort((s1,s2) ->(s2.getRating().compareTo(s1.getRating())));
			System.out.format("%-20s %-10s %-12s %-12s\n","title","genre","duration","rating");
			SongArr.forEach(System.out::println);
			break;

		case 3:
			System.out.println("Choose a song to search: ");
			String SongSelect = s.next();
			int flag=0;

			Iterator<Song> i =SongArr.iterator();
                	
			while(i.hasNext())
                	{
                    		Song son = i.next();                       	      //className ref =i.hasNext();
                    	
				if(son.getTitle().equals(SongSelect))                   //if(ref.getName().equals(from user)
                    		{
                        		
					flag=1;

					//FileWriter fw = new FileWriter("Song.txt");
				
					//fw.write(son.toString());
					File f = new File("test.txt");
					try(FileOutputStream fis = new FileOutputStream(f);
					    ObjectOutputStream oos = new ObjectOutputStream(fis);)
					{
							System.out.println("test");
							
						oos.writeObject(son);
						System.out.println(son);
						System.out.println("Serialication success");
					}
					catch(Exception e)
					{
						System.out.println(e);
					}

					//fw.close();
					
					break;
                    		}
			}
			 	
			if(flag==0)
        		{
            			try
            			{
                		throw new SongNotFoundException(SongSelect);

            			}
            			catch (Exception e)
            			{
                			System.out.println(e);
            			}
			}
			break;
        

			


        }


	}
        

    }

		
		
	
