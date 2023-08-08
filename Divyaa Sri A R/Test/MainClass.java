import java.util.Scanner;
import java.util.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.*;
import java.io.*;
class MainClass implements Serializable
{
	public static void main(String a[])throws Exception
	{
		List<Song> songdet= new ArrayList<>();
		songdet.add(Song.createSong("aaa,melody,04:02,4.1"));
		songdet.add(Song.createSong("bbb,pop,05:01,3.9"));
		songdet.add(Song.createSong("ccc,sad,04:05,4.3"));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			songdet.sort((s1, s2) -> (s1.getDuration().compareTo(s2.getDuration())));
			for(Song s:songdet)
			{
				System.out.format("%-20s %-10s %-8s %-12s\n",s.getTitle(),s.getGenre(),new SimpleDateFormat("mm:ss").format(s.getDuration()),s.getRating());
			}
			break;
		}
		case 2:
		{
			songdet.sort((s1, s2) -> (s1.getRating().compareTo(s2.getRating())));
			for(Song s:songdet)
			{
				System.out.format("%-20s %-10s %-8s %-12s\n",s.getTitle(),s.getGenre(),new SimpleDateFormat("mm:ss").format(s.getDuration()),s.getRating());
			}
			//songdet.forEach(System.out::println);
			break;
		}
		case 3:
		{
			//Scanner sc=new Scanner(System.in);
			boolean flag=false;
			System.out.println("Enter the name to search");
			String searchName=sc.next();
			for(Song sn : songdet) 
			{
              			if (sn.getTitle().equals(searchName)) 
				{
                			System.out.println(sn);
					flag=true;
					File file=new File("sample.txt");
					try (FileOutputStream fos = new FileOutputStream(file);
             				ObjectOutputStream oos = new ObjectOutputStream(fos);) 
					{
            					oos.writeObject(sn);
            					System.out.println("sucess");
						flag=true;
						break;
        				}
					catch (Exception e) {
            					
						System.out.println(e);
					}
				}
			}
			if(flag==false)
			{
				throw new SongNotFoundException(searchName);
			}
				
			
		}
		}		
	}
		
}
	
		