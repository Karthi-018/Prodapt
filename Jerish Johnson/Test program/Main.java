import java.util.*;
import java.text.*;
import java.io.*;
class Main {
	
	public static void main(String []args) throws Exception{
		int ch;
		
		List<Song> data=new ArrayList();
		
		data.add(Song.createSong("AAA,POP,01:30,88"));
		data.add(Song.createSong("BBB,JAZZ,02:00,99"));
		data.add(Song.createSong("CCC,MELODY,03:40,76"));
		data.add(Song.createSong("DDD,POP,04:20,81"));
		data.add(Song.createSong("EEE,MELODY,0:50,59"));
		
		Scanner sc=new Scanner(System.in);
		
		
	
			System.out.println("**************************************************");
			
			System.out.println("1.Sorts th song list based on duration");
			System.out.println("2.Sorts based on rating ");
			System.out.println("3.Search the song name and serialize the list ");
			System.out.print("Enter the choice : ");
			ch=sc.nextInt();
			System.out.println("***************************************************");			
			switch(ch){
				case 1:
					Collections.sort(data,(s1,s2) -> (s1.getDuration().compareTo(s2.getDuration())));
					//Collections.reverse(data);
					System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
					for (Song i:data){
						//System.out.println(i);
						System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),new SimpleDateFormat("mm:ss").format(i.getDuration()),i.getRating());
					}
					
				break;
				
				case 2:
					Collections.sort(data,(s1,s2) -> (s1.getRating().compareTo(s2.getRating())));
					System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
					for (Song i:data){
						//System.out.println(i);
						System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),new SimpleDateFormat("mm:ss").format(i.getDuration()),i.getRating());
					}
					
				break;
				
				case 3:
					System.out.print("Enter the name of the song : ");
					String name=sc.next();
					boolean flag=false;
					
					
					for (Song i:data){
					if (i.getTitle().equals(name)){
						flag=true;
						System.out.println(i);
						try(FileOutputStream fis = new FileOutputStream("Song.txt");
						ObjectOutputStream oos = new ObjectOutputStream(fis);){
							oos.writeObject(i);
							System.out.println("Serialization done Successfully");
							break;
						}
						catch(Exception e){
							System.out.println(e);
						}
						break;
					}
				
				}
				if(!flag){
					try{
						throw new SongNotFoundException(name);
					}
					catch(Exception e){
						System.out.println(e);
					}
				}
					
					
			    break;
				
			}
			
			
			
			
		
	System.out.println("***********************************************");
	System.out.println("Exiting");
	}
	
	
	
}