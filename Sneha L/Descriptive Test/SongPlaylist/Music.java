import java.util.*;
import java.text.*;
import java.io.*;
public class Music implements Serializable{
	static Scanner sc=new Scanner(System.in);
	static ArrayList<MusicPojo> song=new ArrayList<>();
	static DateFormat df=new SimpleDateFormat("mm:ss");
	public static void main(String args[]){
	

	song.add(MusicPojo.createSong("calmDown,Vibe,04:38,5.0"));
	song.add(MusicPojo.createSong("Toofan,Bass,08:57,4.5"));
	song.add(MusicPojo.createSong("Lulu,Motivation,06:50,3.5"));
	song.add(MusicPojo.createSong("CallOutMyName,Sad,04:50,4.0"));
	song.add(MusicPojo.createSong("Pooru,Rap,05:07,4.9"));
	song.add(MusicPojo.createSong("aaaa,Vibe,06:37,4.3"));
	song.add(MusicPojo.createSong("Surviva,Bass,07:00,2.5"));
	song.add(MusicPojo.createSong("bbbb,Motivation,03:35,3.2"));
	song.add(MusicPojo.createSong("withoutme,Sad,05:50,4.8"));
	song.add(MusicPojo.createSong("ProMax,Rap,06:10,4.2"));
	System.out.println("Enter your choice\n 1. Sort the song lists based on duration\n 2. Sort Song lists based on rating\n 3. Display the song");
	int ch=sc.nextInt();
	
	switch(ch){
	case 1:
		System.out.println("Sorted Song list based on duration");
		sortDuration(song);
		System.out.format("%-20s %-10s %-12s %-12s\n","TITLE", "GENRE", "DURATION", "RATING");
		for(MusicPojo i:song){
		System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),df.format(i.getDuration()),i.getRating());
		}
		break;
	case 2: 
		System.out.println("Sorted Song list based on duration");
		Collections.sort(song,(o1,o2)->((o1.getRating()>o2.getRating()?1:-1)));
		System.out.format("%-20s %-10s %-12s %-12s\n","TITLE", "GENRE", "DURATION", "RATING");
		for(MusicPojo i:song){
			
			
		System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),df.format(i.getDuration()),i.getRating());
		}
		break;
	case 3:
		System.out.println("Display the song");
		String s=sc.next();
		try{
		searchSong(s);
		}catch(SongNotFoundException e){
		System.out.println(e.toString());
		}
		break;
	default:
		System.out.println("Invalid choice");
	}

}

	
public static void sortDuration(ArrayList<MusicPojo> song) {
            Collections.sort(song,((o1, o2)
                  -> o1.getDuration().compareTo(o2.getDuration())));
		}


	public static void searchSong(String s) throws SongNotFoundException{
		Boolean found=false;
		for(MusicPojo i:song){
			if(i.getTitle().equals(s)){
				found=true;
				System.out.format("%-20s %-10s %-12s %-12s\n","TITLE", "GENRE", "DURATION", "RATING");
				
				System.out.format("%-20s %-10s %-12s %-12s\n",i.getTitle(),i.getGenre(),df.format(i.getDuration()),i.getRating());
				File file=new File("Song.txt");
				try(FileOutputStream fout=new FileOutputStream(file);
           			ObjectOutputStream objt=new ObjectOutputStream(fout)){
                		objt.writeObject(i);
						}
				catch(Exception e){
					e.printStackTrace();
				}
				break;
			}
			}
			if(!found){
				throw new SongNotFoundException(s);
			    }
		        }
	          
}
	 class SongNotFoundException extends Exception{
			 private String title;
		SongNotFoundException(String title){
				this.title=title;
				}
				public String toString(){
				return "SongNotFoundException:Song with "+title+"title not found";
		}
	}


 
