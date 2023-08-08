import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
class Main
{
	public static void main(String a[]) throws Exception
	{
	  	
	  	
		List<Song> s = new ArrayList<Song>();
		s.add(Song.createSong("ABC,JAZZ,04:35,4.5"));
		s.add(Song.createSong("XYZ,POP,03:20,3.5"));
		s.add(Song.createSong("MNO,MELODY,05:00,4.7"));
		s.add(Song.createSong("PQR,Rock,02:00,8.7"));
		
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		while(choice !=4)
		{
			System.out.println("Select your choice");
			System.out.println("1.Sorting based on duration of the song");
			System.out.println("2.Sorting based on rating of the song");
			System.out.println("3.Search Song");
			System.out.println("4.Exit");
			System.out.println("Enter your request :");
			int choice = sc.nextInt();

			switch(choice)
			{
				case 1 :
 					s.sort((s1,s2) -> s1.getDuration().compareTo(s2.getDuration()));
					for(Song i :s)
					{
						System.out.println(i);
						
					}
					break;	
					
				
				case 2 :
					s.sort((s1,s2) -> s1.getRating().compareTo(s2.getRating()));
					for(Song i :s)
					{
						System.out.println(i);
						
					}
					break;	
					
				case 3 :
					int flag = 0;
					System.out.println("Enter song name : ");
					String name = sc.next();
					
						for(Song i : s)
						{
							if(i.getTitle().equalsIgnoreCase(name))
							{
								System.out.println(i);
								flag = 1;
								try(FileOutputStream fis = new FileOutputStream("file.txt");
								ObjectOutputStream oos = new ObjectOutputStream(fis);)
								{
									oos.writeObject(i);
									System.out.println("Serialization Success");
								}
								catch(Exception e)
								{
									System.out.println(e);
								}
								break;
									
								
							} }
							if(flag == 0)
							{
								throw new songNotFoundException(name);
							}
						
					
					
					break;
				case 4 :
					System.out.println("Thank you !!!");
					System.exit(0);
					break;

				default :
					System.out.println("Please enter valid option.");
					

			}
					
		}
	}

}		
			