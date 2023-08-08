import java.util.*;
import java.io.*;
import java.text.*;
class MainCls 
{
	static List<Song> list = new ArrayList<Song>();



	public void initialise() throws Exception
	{
		list.add(Song.createSong("aaa,pop,04:34,5.0"));
		list.add(Song.createSong("bbb,hiphop,03:22,4.1"));
		list.add(Song.createSong("ccc,jazz,04:10,3.0"));
		list.add(Song.createSong("ddd,pop,03:58,2.3"));
	}
	

	public static void main(String[] args)
	{
		
		MainCls m = new MainCls();
		try{m.initialise();}
		catch(Exception e){System.out.println(e);}
		System.out.println("1. sort by Duration");
		System.out.println("2. sort by rating");
		System.out.println("3. search a song");
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the options");
		int opt = sc.nextInt();

		switch(opt)
		{
			case 1:
				Collections.sort(list,(o1,o2)->(o2.getDuration().compareTo(o1.getDuration())));
				Collections.reverse(list);
				for(Song i:list)
				{
					try
					{
						
					System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),
								new SimpleDateFormat("mm:ss").format(i.getDuration()),i.getRating());
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
				
				break;



			case 2:
				
				Collections.sort(list,(Song o1, Song o2)->(o2.getRating().compareTo(o2.getRating())));
				Collections.reverse(list);
					
				for(Song i:list)
				{
					try
					{
						
					System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),
								new SimpleDateFormat("mm:ss").format(i.getDuration()),i.getRating());
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
				break;



			case 3:
				System.out.println("Enter the song name to search");
				String name = sc.next();
				boolean flag = false;
				for(Song i:list)
				{
					if(i.getTitle().equals(name))
					{
						flag = true;
						System.out.println(i);
						 try(FileOutputStream fis = new FileOutputStream("file.seq");
                 				     ObjectOutputStream oos = new ObjectOutputStream(fis);)
        					{
            						oos.writeObject(i);
            						System.out.println("serialization success");
        					}
        					catch (Exception e){
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
				break;

			
		}



	}

}